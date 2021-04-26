package view;

import javax.swing.*;
import java.awt.*;

public class MainList extends JList {
    public MainList(Object[] arr) {

        super(arr);
        setSize(300, 300);
        setLayout(new FlowLayout());
        JList dataList = new JList(arr);
    }

}
