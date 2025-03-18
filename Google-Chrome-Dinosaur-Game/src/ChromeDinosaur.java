package src;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ChromeDinosaur extends JPanel{

    int boardWidth= 750;
    int boardHeight= 250;


    //Immage
    Image dinosaurImg;
    Image dinosaurDeadImg;
    Image dinosaurJumping;
    Image cactus1Img;
    Image cactus2Img;
    Image cactus3Img;

    public ChromeDinosaur(){

        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.lightGray);

    }


}
