package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportantTaskTest {
    String name = "Name Testing";
    String details = "Details Testing";
    String deadLine = "Deadline Testing";
    Task t = new Task(name,details,deadLine);
    ImportantTask it = new ImportantTask(t);
    String important = "IMPORTANT! ";

    @Test
    public void getNameTest() {
        assertEquals(it.getName(), important + name);
    }

    @Test
    public void setNameTest() {
        String newName = "Setting name Testing";
        it.setName(newName);
        assertEquals(it.getName(), important + newName);
    }

    @Test
    public void getDetailsTest() {
        assertEquals(it.getDetails(), important + details);
    }

    @Test
    public void setDetailsTest() {
        String newDetails = "Setting details Testing";
        it.setDetails(newDetails);
        assertEquals(it.getDetails(), important + newDetails);

    }

    @Test
    public void getDeadLineTest() {
        assertEquals(it.getDeadLine(), deadLine);
    }

    @Test
    public void setDeadLineTest() {
        String newDeadLine = "Setting deadline Testing";
        it.setDeadLine(newDeadLine);
        assertEquals(it.getDeadLine(),newDeadLine);

    }

    @Test
    public void getTaskTest() {
        assertEquals(it.getTask(), t);
    }
    @Test
    public void setTaskTest() {
        Task setNewTask = new Task("Testing name","Testing details", "Testing deadline");
        it.setTask(setNewTask);
        assertEquals(it.getTask(), setNewTask);
    }


}