package controller;

public class CreateMessage implements Message{
    @Override

    private String taskName;
    private String details;
    private String date;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public String getDate() {
        return date;
    }
}
