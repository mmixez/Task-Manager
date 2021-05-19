package model;

public class Task implements TaskInterface{
    private String name;
    private String deadLine;
   // private boolean isImportant;
    private String details;
    static int count;
    int num;


    // Create a task with name, details and deadline.

    public Task(String name,String details,String deadLine) {
        this.name = name;
        this.deadLine = deadLine;
        this.details = details;
        //this.isImportant = isImporant;
        count++;
        num = count;
    }

    public String getName() {
        return name;
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }



//    public String toString() {
//        return "model.Task#" + getNum() + " " + name +" Dead Line: "+ deadLine
//                + " Important?: ";
//    }

}
