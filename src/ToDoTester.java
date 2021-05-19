import controller.Controller;
import controller.Message;
import model.ToDoList;
import view.MainView;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


class TodoListTester {

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
        MainView view = new MainView();
        ToDoList list = new ToDoList();
        Controller controller = new Controller(queue, list, view);
        controller.mainLoop();
    }





}


