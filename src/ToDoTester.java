import controller.Controller;
import controller.Message;
import model.ToDoList;
import view.MainView;
import view.PopUpWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class TodoListTester {

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
        MainView view = new MainView();
        ToDoList list = new ToDoList();
        Controller controller = new Controller(queue, list, view);
        controller.mainLoop();
    }





}


