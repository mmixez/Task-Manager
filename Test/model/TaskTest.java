package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {
    String name = "Testing name";
    String details ="Testing details";
    String deadLine = "Testing deadline 1/1/2021";
    Task t = new Task(name,details, deadLine);

    @Test
    public void getNameTest() {
        assertEquals(t.getName(),name);

    }

    @Test
    public void getDetailsTest() {
    assertEquals(t.getDetails(),details);

    }

    @Test
    public void setDetailsTest() {
        String setDetails = "Setting details Testing";
        t.setDetails(setDetails);
        assertEquals(t.getDetails(),setDetails);
    }

    @Test
    public void setNameTest() {
        String setName = "Setting name Testing";
        t.setName(setName);
        assertEquals(t.getName(),setName);
    }

    @Test
    public void getDeadLineTest() {
        assertEquals(t.getDeadLine(),deadLine);
    }

    @Test
    public void setDeadLineTest() {
        String setDeadLine = "Setting deadline Testing";
        t.setDeadLine(setDeadLine);
        assertEquals(t.getDeadLine(),setDeadLine);
    }
}