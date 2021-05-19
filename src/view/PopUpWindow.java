package view;

import controller.Controller;
import controller.CreateMessage;
import controller.RemoveMessage;
import controller.UpdateMessage;

import model.TaskInterface;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import java.util.Properties;


public class PopUpWindow extends JFrame {




 public PopUpWindow(MainView view) {

  /*
  *  Creating a popup window to input information for a new task
  *
  * */


  // Task name for the name of the task
  JTextField taskName = new JTextField(50);


  // Labeling the blank for the input task name
     JLabel nameLabel = new JLabel("TASK NAME");
     nameLabel.setBounds(150,30,150,20);
     add(nameLabel);

     //Labeling the Details for the input task details

     JLabel detailsLabel = new JLabel("DETAILS");
     detailsLabel.setBounds(150,140,150,20);
     add(detailsLabel);

     // Labeling the deadline for the input task deadline
     JLabel deadLineLabel = new JLabel("DEADLINE");
     deadLineLabel.setBounds(150,490,150,20);
     add(deadLineLabel);

  taskName.setBounds(150, 60, 190, 50);
  add(taskName);
  getContentPane().setBackground(Color.LIGHT_GRAY);




  JTextArea details = new JTextArea(20, 20);

  details.setBounds(150, 170, 370, 290);
  add(details);
  UtilDateModel model = new UtilDateModel();

  // date picker

  Properties p = new Properties();
  p.put("text.today", "Today");
  p.put("text.month", "Month");
  p.put("text.year", "Year");


  JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
  JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
  add(datePicker);
  datePicker.setBounds(150, 520, 210, 160);

 JCheckBox checkBox = new JCheckBox("Important Task");
 add(checkBox);
 checkBox.setBounds(500,710,200,100);

  JButton okButton = new JButton("OK");
  okButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    Controller.addToQueue(new CreateMessage(taskName.getText(), details.getText(),
            datePicker.getJFormattedTextField().getText(),checkBox.isSelected()));

    dispose();
   }
  });

  add(okButton);
  okButton.setBounds(150, 710, 100, 100);


  setLayout(null);
  //setResizable(false);
  setPreferredSize(new Dimension(720, 800));
  setSize(800, 900);
  setLocationRelativeTo(null);
  setVisible(true);
 // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public PopUpWindow(MainView view, SideBar sb, TaskInterface t) throws ParseException {
  super();


     JLabel nameLabel = new JLabel("TASK NAME");
     nameLabel.setBounds(150,30,150,20);
     add(nameLabel);
     JLabel detailsLabel = new JLabel("DETAILS");
     detailsLabel.setBounds(150,140,150,20);
     add(detailsLabel);
     JLabel deadLineLabel = new JLabel("DEADLINE");
     deadLineLabel.setBounds(150,490,150,20);
     add(deadLineLabel);


  JTextField taskName = new JTextField(50);
  taskName.setBounds(150, 60, 190, 50);
  taskName.setText(t.getName());

  add(taskName);
  getContentPane().setBackground(Color.lightGray);

  JTextArea details = new JTextArea(20, 20);
 details.setText((t.getDetails()));
  details.setBounds(150, 170, 370, 290);
  add(details);
  UtilDateModel model = new UtilDateModel();

  Properties p = new Properties();
  p.put("text.today", "Today");
  p.put("text.month", "Month");
  p.put("text.year", "Year");



  JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
  JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
  add(datePicker);
  datePicker.setBounds(150, 520, 210, 160);

  JCheckBox checkBox = new JCheckBox("Important Task");
  add(checkBox);
  checkBox.setBounds(500,710,200,100);

  JButton okButton = new JButton("OK");
  okButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    Controller.addToQueue(new UpdateMessage(t, taskName.getText(), details.getText(),
            datePicker.getJFormattedTextField().getText(),checkBox.isSelected()));

    dispose();
   }
  });

  add(okButton);
  okButton.setBounds(150, 710, 100, 100);

  JButton removeButton = new JButton("Remove");
  removeButton.addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    Controller.addToQueue(new RemoveMessage(t));
    dispose();
   }
  });

  add(removeButton);
  removeButton.setBounds(300,710,100,100);

  setLayout(null);
  setResizable(false);
  setPreferredSize(new Dimension(720,750));
  setSize(800,900);
  setLocationRelativeTo(null);
  setVisible(true);

 }
}
