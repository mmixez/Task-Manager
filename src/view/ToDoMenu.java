package view;

import java.util.Scanner;

class ToDoMenu {

    //model.ToDoList todoList = new model.ToDoList ();

    private String menuPrompt = "1: Add model.Task\n2: Delete model.Task\n3: Complete model.Task\nEnter Your Choice: ";
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
