import java.util.Scanner;

class ToDoMenu {

    //ToDoList todoList = new ToDoList ();

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


}
