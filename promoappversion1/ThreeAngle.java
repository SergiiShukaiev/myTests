package MyTests.promoappversion1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Алина on 21.09.2016.
 */
public class ThreeAngle extends JPanel
{
    ThreeAngle()
    {
          super();
          repaint();
        setVisible(true);
            }
   public  void paint(Graphics g){

      Graphics2D g2D = (Graphics2D) g;
      g2D.setBackground(Color.GREEN);
      g2D.setColor(Color.red);

      Polygon p = new Polygon();
      p.addPoint(100, 30);
      p.addPoint(200, 250);
      p.addPoint(300, 30);
      p.addPoint(100, 30);
      g2D.drawPolygon(p);

      int red = (int) (Math.random() * 255);
      int green = (int) (Math.random() * 255);
      int blue = (int) (Math.random() * 255);
      Color randColor = new Color(red, green, blue);
      g2D.setColor(randColor);

      g2D.fillPolygon(p);

    }
}
