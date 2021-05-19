package model;

public class ImportantTask implements TaskInterface{
private TaskInterface task;

// Marking tasks important


public ImportantTask(TaskInterface task) {
    this.task = task;

}

    public TaskInterface getTask() {
        return this.task;
    }

    public void setTask(TaskInterface task) {
        this.task = task;
    }


    public void setName(String name) {
    task.setName(name);
    }
    public void setDetails(String details)
    {
    task.setDetails(details);
    }
    public void setDeadLine(String deadLine) {

    task.setDeadLine(deadLine);
    }

    @Override
    public String getName() {

    return "IMPORTANT! " + task.getName();
    }

    @Override
    public String getDetails() {

    return "IMPORTANT! " + task.getDetails();
    }

    @Override
    public String getDeadLine() {

    return task.getDeadLine();
    }


}
