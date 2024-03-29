package com.patika.tourism.view;

import com.patika.tourism.helper.MyHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPageGUI extends JFrame{

    private JPanel pnl_top;
    private JPanel wrapper;
    private JPanel pnl_bottom;
    private JButton btn_hotel_operations;
    private JButton btn_sales_operations;
    private JLabel lbl_icon;

    @Override
    public void dispose() {
        super.dispose();
        System.exit(0);
    }

    public MenuPageGUI() {
        int guiWidth = 400, guiHeight = 400;

        setContentPane(wrapper);
        setTitle(MyHelper.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(guiWidth,guiHeight);
        setResizable(false);
        setLocation((MyHelper.SCREEN_WIDTH - guiWidth) / 2, (MyHelper.SCREEN_HEIGHT - guiHeight) / 2);
        setVisible(true);

        ImageIcon icon = new ImageIcon("src/patika_academy_dev_icon.png");
        ImageIcon resizedIcon = new ImageIcon(icon.getImage().getScaledInstance(320,56,Image.SCALE_SMOOTH));
        lbl_icon.setIcon(resizedIcon);


        btn_hotel_operations.addActionListener(e -> {
            HotelOperationsGUI hotelOperationsGUI = new HotelOperationsGUI(this);
        });


    }
}
