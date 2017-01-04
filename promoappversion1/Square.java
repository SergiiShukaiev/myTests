package MyTests.promoappversion1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Алина on 21.09.2016.
 */
public class Square extends JPanel
{
   private int X=50;
    private int Y=70;
    private int DEFAULT_WIDTH=300;
    private int DEFAULT_HEIGHT=150;
    Square(){
        super();
        setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D)g;
        g2D.setBackground(Color.BLUE);
        g2D.setColor(Color.RED);
        g2D.drawRect(X,Y,DEFAULT_WIDTH,DEFAULT_HEIGHT);

        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color randColor=new Color(red, green, blue);
        g2D.setColor(randColor);
        g2D.fillRect(X,Y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
