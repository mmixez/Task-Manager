package model;

public class ImportantTask implements TaskInterface{
private TaskInterface task;
ImportantTask(TaskInterface task) {
    this.task = task;

}

    public TaskInterface getTask() {
        return task;
    }

    public void setTask(TaskInterface task) {
        this.task = task;
    }

    @Override
    public String getName() {
        return "IMPORTANT: " + task.getName();
    }

    @Override
    public String getDetails() {
        return "IMPORTANT: " + task.getDetails();
    }

    @Override
    public String getDeadLine() {
        return "IMPORTANT: " + getDeadLine();
    }
}
