package view;

import model.Task;
import model.ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainView extends JFrame {

    public MainView() {

        JTextField input = new JTextField(50);
        JPanel topPanel = new JPanel();
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


        input.setBounds(100, 100, 600, 50);
        add(input);
        getContentPane().setBackground(Color.darkGray);
        ArrayList<String> stringsArrayList = new ArrayList<>();
        MainList list = new MainList(stringsArrayList.toArray());

        list.setBounds(100, 300, 500, 100);
        add(list);


        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new PopUpWindow();
            }
        });
        add(okButton);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ArrayList<String> stringsArrayList = new ArrayList<>();
                MainList list = new MainList(stringsArrayList.toArray());
                for(Task t: ToDoList.tasks)
                    stringsArrayList.add(t.getName());
                }
            }
        );
        add(refreshButton);



        refreshButton.setBounds(500, 700, 100, 100);
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> stringsArrayList = new ArrayList<>();
                for(Task t: ToDoList.tasks){
                  //  list.a;
                }

            }
        });
        setLayout(null);
        setResizable(false);
        setPreferredSize(new Dimension(800, 800));
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
