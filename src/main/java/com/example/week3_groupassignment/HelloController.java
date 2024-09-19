package com.example.week3_groupassignment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    //connecting all parts of the program to the scene
    @FXML
    private ImageView maze1;
    @FXML
    private ImageView car1;
    @FXML
    private Button exampleButton1;
    @FXML
    private ImageView maze2;
    @FXML
    private ImageView car2;
    @FXML
    private Button exampleButton2;
    /*
    To move within boundaries, we will put in pixelReader.getColor and detect what color is in front of the car. By doing this every time the user wants to move,
    we can prevent the object from going through walls. Blue = cannot move, white = can move forward.
     */


    /*
    The example button will swap the image of the car imageView and then proceed through the maze in a predetermined path. This can be done with the Timeline class,
    which would let us program individual positions each frame to make the robot show the user where to go.
     */




}