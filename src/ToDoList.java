
import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {

    Task task;
   // ToDoMenu menu = new ToDoMenu();


    ArrayList <Task> tasks = new ArrayList<Task>();
    Scanner input = new Scanner(System.in);
    boolean repeat = true;
    String repeat2;
    String impor;
    void addTask () {
        int count =0;
        boolean important= true;
        while (repeat) {
            System.out.print("Enter your task: ");
            String taskName = input.nextLine();

            System.out.print("Enter your dead line: ");
            String taskDate = input.nextLine();
            System.out.print("Is it important? (T/F) : ");
            String impor = input.next();
            if (impor.equalsIgnoreCase("T")) {
                important = true;
            } else {
                important = false;
            }


            System.out.println("여긴가?");
            count++;
            tasks.add(new Task(taskName,taskDate,important));

            System.out.println("Do you want to add another task? (Y/N): ");
            repeat2 = input.next();
            input.nextLine();
            if (repeat2.equalsIgnoreCase("n")) {
            repeat = false;
            }



        }



       // Task t1 = new Task("할일1", "10/3까지", false);
        //Task t2 = new Task("할일2", "10/4까지", false);
        //tasks.add(t1);
        //tasks.add(t2);

        for (Task t : tasks) {
            System.out.println(t.toString());
        }
        //menu.readInput();
    }





}


