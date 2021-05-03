package model;

public class Task implements TaskInterface{
    private String name;
    private String deadLine;
   // private boolean isImportant;
    static int count;
    int num;

    public Task(String name,String details,String deadLine) {
        this.name = name;
        this.deadLine = deadLine;
        //this.isImportant = isImporant;
        count++;
        num = count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDetails() {
        return null;
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

//    public boolean isImportant() {
//        return isImportant;
//    }
//
//    public void setImportant(boolean important) {
//        isImportant = important;
//    }
//    public int getNum () {
//        return num;
//    }

//    @Override
//    public String toString() {
//        return "model.Task#" + getNum() + " " + name +" Dead Line: "+ deadLine
//                + " Important?: ";
//    }

}
