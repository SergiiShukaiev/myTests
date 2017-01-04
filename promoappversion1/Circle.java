package MyTests.promoappversion1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Алина on 21.09.2016.
 */
public class Circle extends JPanel
{
    private int X=100;
    private int Y=30;
    private int DEFAULT_WIDTH=200;
    private int DEFAULT_HEIGHT=200;

    Circle(){
        super();
        setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D) g;
        g2D.setBackground(Color.yellow);
        g2D.setColor(Color.CYAN);

        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color rondColor=new Color(red, green, blue);
        g2D.setColor(rondColor);

        g2D.fillOval(X,Y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
