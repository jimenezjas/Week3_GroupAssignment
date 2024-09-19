package com.example.week3_groupassignment;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends KeyAdapter {

    @FXML
    protected ImageView car1;

    boolean leftKey = false;
    boolean upKey = false;
    boolean downKey = false;
    boolean rightKey = false;

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){ leftKey = true; }
        if(e.getKeyCode() == KeyEvent.VK_UP){ upKey = true; }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ downKey = true; }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){ rightKey = true; }
    }
    public void keyReleased(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){ leftKey = false; }
        if(e.getKeyCode() == KeyEvent.VK_UP){ upKey = false; }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ downKey = false; }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){ rightKey = false; }
    }

    public boolean getLeftStatus(){ return leftKey;}
    public boolean getUpStatus(){ return upKey;}
    public boolean getRightStatus(){ return rightKey;}
    public boolean getDownStatus(){ return downKey;}

}
