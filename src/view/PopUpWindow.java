package view;

import model.Task;
import model.ToDoList;
import org.jdatepicker.JDatePanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Properties;


public class PopUpWindow extends JFrame {

   public PopUpWindow(){
    JTextField taskName = new JTextField(50);
//        JPanel panel = new JPanel();
//        JPanel topPanel = new JPanel();
//
//
//        JLabel topLabel = new JLabel("TOP LABEL");
//        panel.add(topLabel,BorderLayout.NORTH);
//        JLabel leftLabel = new JLabel("LEFT LABEL");
//        JButton addButton = new JButton("ADD");
//        JTextArea txtArea = new JTextArea("TXT AREA ......");
//
//        panel.setLayout(new BorderLayout());
//
//        panel.add(leftLabel,BorderLayout.WEST);
//        panel.add(addButton,BorderLayout.NORTH);
//
//        panel.add(txtArea, BorderLayout.CENTER);
//        add(panel);
//
//
    taskName.setBounds(100, 100, 100, 50);
    add(taskName);
    getContentPane().setBackground(Color.darkGray);

    JTextArea details = new JTextArea(20, 20);

    details.setBounds(100, 200, 200, 200);
    add(details);
    UtilDateModel model = new UtilDateModel();

    Properties p = new Properties();
    p.put("text.today", "Today");
    p.put("text.month", "Month");
    p.put("text.year", "Year");


    //model.setDate(20,04,2014);
    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
    add(datePicker);
    datePicker.setBounds(100, 500, 200, 100);


    JButton okButton = new JButton("OK");
    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
       ToDoList.addTask(new Task(taskName.getText(),details.getText(),
               datePicker.getJFormattedTextField().getText()));

       dispose();
      }
    });

    add(okButton);
    okButton.setBounds(100, 600, 100, 100);


    setLayout(null);
    //setResizable(false);
    setPreferredSize(new Dimension(800, 800));
    setSize(1000, 700);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
