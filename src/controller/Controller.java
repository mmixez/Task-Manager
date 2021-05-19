package controller;

import model.ImportantTask;
import model.Task;
import model.TaskInterface;
import model.ToDoList;
import view.MainView;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Controller {

/*
 /  Controller that controls creating, removing, updating message and message list.
 /  Valve implemented.
*/
    static BlockingQueue<Message> queue;
    public ToDoList list;
    public MainView view;
    private List<Valve> valves = new LinkedList<Valve>();

    public Controller(BlockingQueue<Message> queue, ToDoList list, MainView view) {
        Controller.queue = queue;
        this.list = list;
        this.view = view;
        valves.add(new CreateValve());
        valves.add(new RemoveValve());
        valves.add(new UpdateListValve());
        valves.add(new UpdateValve());
    }

    public static void addToQueue(Message message) {
        queue.add(message);
    }

    public void mainLoop() {

        ValveResponse response = ValveResponse.EXECUTED;
        while (view.isDisplayable()) {
            Message message = null;
            try {
                message = queue.take();

            } catch (InterruptedException exception) {
                // do nothing
            }

            for (Valve valve : valves) {
                response = valve.execute(message);
                if (response != ValveResponse.MISS) {
                    break;
                }
            }
        }
    }

//            if (message.getClass() == CreateMessage.class) {
//                String taskName = ((CreateMessage) message).getTaskName();
//                String details = ((CreateMessage) message).getDetails();
//                String date = ((CreateMessage) message).getDate();
//                boolean important = ((CreateMessage) message).getImportant();
//                createTask(taskName, details, date,important);
//
//            }

//            if (message.getClass() == UpdateMessage.class) {
//                TaskInterface t = ((UpdateMessage) message).getTask();
//                String taskName = ((UpdateMessage) message).getTaskName();
//                String date = ((UpdateMessage) message).getDate();
//                String details = ((UpdateMessage) message).getDetails();
//                boolean important = ((UpdateMessage)message).isImportant();
//                updateTask(t, taskName, details, date,important);
//
//            }
//
//            if(message.getClass() == RemoveMessage.class){
//                TaskInterface t =  ((RemoveMessage) message).getTask();
//                removeTask(t);
//            }
//            if (message.getClass() == UpdateListMessage.class) {
//                updateList(((UpdateListMessage) message).isShowAll());
//            }



    private void updateList(boolean showImportant) {
        DefaultListModel dfModel = new DefaultListModel<String>();
        for(int i = 0; i< ToDoList.tasks.size();i++) {
            if (showImportant && ToDoList.tasks.get(i).getClass() ==
            ImportantTask.class) {
                dfModel.addElement(ToDoList.tasks.get(i).getName());

            }
            else if (!showImportant) {
                dfModel.addElement(ToDoList.tasks.get(i).getName());
            }
        }
        this.view.getList().setModel(dfModel);
    }


    public void createTask(String task, String details, String date, boolean important) {
        Task t = new Task(task, details, date);
        ToDoList.addTask(important ? new ImportantTask(t) : t );
        DefaultListModel dfModel = new DefaultListModel<String>();
        for (int i = 0; i < ToDoList.tasks.size(); i++) {
            dfModel.addElement(ToDoList.tasks.get(i).getName());
        }
        this.view.getList().setModel(dfModel);
    }


    private void updateTask(TaskInterface t, String task, String details, String date, boolean important) {
        t.setName(task);
        t.setDetails(details);
        t.setDeadLine(date);
        DefaultListModel dfModel = new DefaultListModel<String>();
        for (int i = 0; i < ToDoList.tasks.size(); i++) {

            if(ToDoList.tasks.get(i) == t && (important && t.getClass() == Task.class)) {
                ToDoList.tasks.set(i,new ImportantTask(t));
            } else if (ToDoList.tasks.get(i) == t && (!important && t.getClass() == ImportantTask.class)) {
                ToDoList.tasks.set(i, ((ImportantTask) ToDoList.tasks.get(i)).getTask());
            }
            dfModel.addElement(ToDoList.tasks.get(i).getName());
        }
        this.view.getList().setModel(dfModel);
        this.view.getSideBar().update(t);
        this.view.update();
    }



    public void removeTask(TaskInterface t) {
        ToDoList.tasks.remove(t);
        DefaultListModel dfModel = new DefaultListModel<String>();
        for (int i = 0; i < ToDoList.tasks.size(); i++) {
            dfModel.addElement(ToDoList.tasks.get(i).getName());
        }
        this.view.getList().setModel(dfModel);
        this.view.getSideBar().reset();
        this.view.update();

    }

    private class CreateValve implements Valve {

    public ValveResponse execute(Message message) {
        if (message.getClass() != CreateMessage.class) {
            return ValveResponse.MISS;
        }

            String taskName = ((CreateMessage) message).getTaskName();
            String details = ((CreateMessage) message).getDetails();
            String date = ((CreateMessage) message).getDate();
            boolean important = ((CreateMessage) message).getImportant();
            createTask(taskName, details, date,important);
            return ValveResponse.EXECUTED;
        }
    }

    private class UpdateValve implements Valve {
    public ValveResponse execute(Message message) {
        if (message.getClass() == UpdateMessage.class) {
            return ValveResponse.MISS;
        }
            TaskInterface t = ((UpdateMessage) message).getTask();
            String taskName = ((UpdateMessage) message).getTaskName();
            String date = ((UpdateMessage) message).getDate();
            String details = ((UpdateMessage) message).getDetails();
            boolean important = ((UpdateMessage)message).isImportant();
            updateTask(t, taskName, details, date,important);
            return ValveResponse.EXECUTED;
        }
    }


    private class RemoveValve implements Valve {
    public ValveResponse execute(Message message) {

        if(message.getClass() != RemoveMessage.class){
            return ValveResponse.MISS;
        }
            TaskInterface t =  ((RemoveMessage) message).getTask();
            removeTask(t);
            return ValveResponse.EXECUTED;
        }
    }

    private class UpdateListValve implements Valve {
    public ValveResponse execute (Message message) {
        if (message.getClass() != UpdateListMessage.class) {
        return ValveResponse.MISS;
        }

            updateList(((UpdateListMessage) message).isShowAll());
            return ValveResponse.EXECUTED;
    }
    }
    private interface Valve {
    public ValveResponse execute(Message message);
    }


}