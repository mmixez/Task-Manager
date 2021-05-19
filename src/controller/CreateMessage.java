package controller;

public class CreateMessage implements Message{


     String taskName;
     String details;
     String date;
     boolean important;

     // Message sent to the controller to create a new task that will be added to the ToDolist

    public CreateMessage(String taskName, String details, String date, boolean important) {
        this.taskName = taskName;
        this.details = details;
        this.date = date;
        this.important = important;
    }

//    public void setTaskName(String taskName) {
//        this.taskName = taskName;
//    }
//
//    public void setDetails(String details) {
//        this.details = details;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    public String getTaskName() {
        return taskName;
    }


    public String getDetails() {
        return details;
    }


    public String getDate() {
        return date;
    }

    public boolean getImportant() {
        return important;
    }
}
