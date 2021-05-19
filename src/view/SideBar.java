package view;


import model.TaskInterface;

import javax.swing.*;

public class SideBar extends JPanel {
    private JLabel taskName;
    private JLabel details;
    private JLabel date;

    /*
    * Create a sidebar for the task
    * */

    SideBar() {
        taskName = new JLabel();
        details = new JLabel();
        date = new JLabel();
        taskName.setBounds(50,50,300,100);
        details.setBounds(50,150,300,200);
        date.setBounds(50,350,300,100);

        add(taskName);
        add(details);
        add(date);
        setLayout(null);
        setSize(500,500);
    }

    public void update(TaskInterface t) {
        taskName.setText("Name: " + t.getName());
        details.setText("Details: " + t.getDetails());
        date.setText("Date: " + t.getDeadLine());
    }

    public void reset() {
        taskName.setText("");
        details.setText("");
        date.setText("");
    }
}
