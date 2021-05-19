package controller;

import model.TaskInterface;
/*
// Creates a RemoveMessage that removes a message from the ToDolist
*/
public class RemoveMessage implements Message{
    TaskInterface task;

    public RemoveMessage(TaskInterface task) {
        this.task = task;

    }
    public TaskInterface getTask() {
        return this.task;
    }

}
