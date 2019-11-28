package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends Canvas {
    public Main() {
    }

    @Override
    public void paint(Graphics graphics){
        Circles c1= new Circles(1);
        Circles c2= new Circles(1);
        Circles c3= new Circles(1);
        Circles c4= new Circles(1);
        Circles c5= new Circles(1);
        Circles c6= new Circles(1);
        Circles c7= new Circles(1);
        Circles c8= new Circles(1);
        Circles c9= new Circles(1);
        Circles c10= new Circles(1);
        Circles c11= new Circles(1);
        Circles c12= new Circles(1);
        Circles[] circles={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12};
        int initiX=0;
        int initiY=0;
        int secondpartX=6;
        int secondpartY=0;
        for (int i = 0; i < 6; i++) {
            circles[i].setX(initiX);
            circles[i].setY(initiY);

            circles[i].draw(graphics);
            initiX=initiX+1;
            initiY=(initiX*initiX);
        }
        for (int i = 6; i <circles.length; i++) {
            int counter=5;
            circles[i].setX(secondpartX);
            circles[i].setY(secondpartY);

            circles[i].draw(graphics);
            secondpartX=secondpartX+1;
            secondpartY=initiY -((secondpartX-(counter))*(secondpartX-(counter)));
            counter--;
        }
//        for(Circles c:circles){
//           // c.setX(initi);
//             c.setY(initi);
//            initi+=5;
//            c.draw(graphics);
//        }
    }


    public static void main(String[] args) {
        Main canvas=new Main();
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
