package controller;


import model.TaskInterface;


/*
/ If we need to edit the task name, the details, the date, and importance, message sent to controller
*/
public class UpdateMessage implements Message{
    
    private String taskName;
    private String details;
    private String date;
    TaskInterface task;
    private boolean important;

    public UpdateMessage(TaskInterface task, String taskName, String details, String date, boolean important) {
        this.task = task;
        this.taskName = taskName;
        this.details = details;
        this.date = date;
        this.important = important;
    }
//
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

    public TaskInterface getTask() {
        return this.task;
    }

    public String getTaskName() {
        return taskName;
    }


    public String getDetails() {
        return details;
    }


    public String getDate() {
        return date;
    }

    public boolean isImportant() {
        return important;
    }
}
