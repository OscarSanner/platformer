package com.platformer.view;

import com.platformer.model.Model;

import javax.swing.*;
import java.awt.*;

public class ViewFrame extends JFrame {
    private final int x;
    private final int y;
    public DrawPanel drawPanel;


    public ViewFrame(String framename, Model model){
        x = model.getWidth();
        y = model.getHeight();
        drawPanel = new DrawPanel(x, y, model);
        initComponents(framename);
    }

    private void initComponents(String title) {

        this.setTitle(title);
        this.setPreferredSize(new Dimension(x,y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.add(drawPanel);
}
}
