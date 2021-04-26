package model;

import model.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    Task task;
    // ToDoMenu menu = new ToDoMenu();

    public static ArrayList<Task> tasks = new ArrayList<Task>();
//    Scanner input = new Scanner(System.in);
//    boolean repeat = true;
//    String repeat2;
//    String impor;

    public static void addTask(Task t){
        tasks.add(t);
    }

//    void addTask() {
//
//        boolean important = true;
//        while (repeat) {
//            System.out.print("Enter your task: ");
//            String taskName = input.nextLine();
//
//            System.out.print("Enter your dead line: ");
//            String taskDate = input.nextLine();
//            System.out.print("Is it important? (T/F) : ");
//            String impor = input.next();
//            if (impor.equalsIgnoreCase("T")) {
//                important = true;
//            } else {
//                important = false;
//            }
//
//
//            tasks.add(new Task(taskName, "", taskDate));
//
//            System.out.println("Do you want to add another task? (Y/N): ");
//            repeat2 = input.next();
//            input.nextLine();
//            if (repeat2.equalsIgnoreCase("n")) {
//                repeat = false;
//            }
//
//        }
//
//        for (Task t : tasks) {
//            System.out.println(t.toString());
//        }
//
//    }
//
//    void readInput() {
//        Scanner input = new Scanner(System.in);
//        int choice = input.nextInt();
//
//        switch (choice) {
//            case 1:
//                addTask();
//
//                break;
//            case 2:
//                System.out.println("chose 2 haha");
//                break;
//            case 3:
//                System.out.println("chose 3 haha");
//                break;
//
//        }
//    }


}
