package view;

import controller.Controller;
import controller.UpdateListMessage;
import model.ImportantTask;

import model.ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;




public class MainView extends JFrame {
    private JList list;
    private SideBar sb;
    private boolean showImportant;

    public MainView() {

        /*
        * Main page. Create a list board that contains a list of the tasks. When you click on the task, it displays
        * the information on the right side board. When you double click the task, a popup window appears so
        * the user can edit the information.
        *
        * */

        showImportant = false;
        getContentPane().setBackground(Color.lightGray);
        DefaultListModel dfModel = new DefaultListModel();
        for (int i = 0; i < ToDoList.tasks.size(); i++) {
            dfModel.addElement(ToDoList.tasks.get(i).getName());
        }
        list = new JList(dfModel);
        MainView current = this;
        sb = new SideBar();
        sb.setBounds(400,0,400,600);
        sb.setVisible(true);
        current.add(sb);


        /*
        * When an index of the JList is clicked, it makes sure the corresponding option is clicked.
        * */


        list.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JList list = (JList) e.getSource();
                int index = list.getSelectedIndex();
                if (showImportant) {
                    int count = 0;
                    for (int i = 0; i < ToDoList.tasks.size();i++) {
                        if (ToDoList.tasks.get(i).getClass()== ImportantTask.class) {
                            count++;
                            if (count == index) {
                                index = i;
                                break;
                            }
                        }
                    }
                }
                if (e.getClickCount() == 2) {
                    try {
                        new PopUpWindow(current, sb, ToDoList.tasks.get(index));
                    } catch (ParseException parseException) {
                        parseException.printStackTrace();
                    }

                }
                sb.update(ToDoList.tasks.get(index));
                current.update();
            }

            @Override
            public void mousePressed(MouseEvent e) {


            }

            @Override
            public void mouseReleased(MouseEvent e) {
                JList list = (JList) e.getSource();
                int index = list.getSelectedIndex();
                sb.update(ToDoList.tasks.get(index));
                current.update();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        list.setBounds(0, 0, 400, 600);
        add(list);


        JButton addButton = new JButton("ADD TASK");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PopUpWindow(current);
            }
        });
        add(addButton);
        addButton.setBounds(200, 700, 170, 60);

        JButton updateListButton = new JButton("IMPORTANT ONLY");
        updateListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImportant = !showImportant;
                Controller.addToQueue(new UpdateListMessage(showImportant));
            }
        });
        add(updateListButton);
        updateListButton.setBounds(430,700,170,60);


        setLayout(null);
        setResizable(false);
        setPreferredSize(new Dimension(800, 800));
        setSize(800, 900);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void update() {
    invalidate();
    revalidate();
    repaint();
    }
    public JList getList() {
        return list;
    }

    public SideBar getSideBar() {
        return sb;
    }

//    public void popUp() {
//        new PopUpWindow();
//    }
//    public void popUp(Task t) {
//        new PopUpWindow();
//    }

}