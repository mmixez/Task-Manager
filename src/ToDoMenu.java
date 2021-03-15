import java.util.Scanner;

class ToDoMenu {

    ToDoList todoList = new ToDoList ();

    private String menuPrompt = "1: Add Task\n2: Delete Task\n3: Complete Task\nEnter Your Choice: ";
    int menuNum;

    public String getMenuPrompt() {
        return menuPrompt;
    }

    public void setMenuPrompt(String menuPrompt) {
        this.menuPrompt = menuPrompt;
    }

    public void disPlayMenu() {
        System.out.println(getMenuPrompt());
    }

    void readInput() {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:todoList.addTask();

                break;
            case 2:
                System.out.println("chose 2 haha");
                break;
            case 3:
                System.out.println("chose 3 haha");
                break;

        }
    }
}
