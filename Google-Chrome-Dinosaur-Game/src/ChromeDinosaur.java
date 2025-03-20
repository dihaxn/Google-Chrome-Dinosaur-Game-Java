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
    Image dinosaurJumpImg;
    Image cactus1Img;
    Image cactus2Img;
    Image cactus3Img;

    public ChromeDinosaur(){

        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.lightGray);

        dinosaurImg = new ImageIcon(getClass().getResource("./img/dino-run.gif")).getImage();
        dinosaurDeadImg = new ImageIcon(getClass().getResource("./img/dino-dead.png")).getImage();
        dinosaurJumpImg = new ImageIcon(getClass().getResource("./img/dino-jump.png")).getImage();
        cactus1Img = new ImageIcon(getClass().getResource("./img/dino-cactua1.png")).getImage();
        cactus2Img = new ImageIcon(getClass().getResource("./img/dino-cactua2.png")).getImage();
        cactus3Img = new ImageIcon(getClass().getResource("./img/dino-cactua3.png")).getImage();




    }


}
