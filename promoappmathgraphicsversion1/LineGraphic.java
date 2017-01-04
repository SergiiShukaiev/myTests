package MyTests.promoappmathgraphicsversion1;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Алина on 22.09.2016.
 */
public class LineGraphic extends ShapeGraphic
{

    public LineGraphic(double x, double a, double b)
    {
        super(x, a, b);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLACK);
        g2d.setBackground(Color.black);
        BasicStroke c = new BasicStroke(2);
        g2d.setStroke(c);
        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color randColor=new Color(red,green,blue);
        g2d.setColor(randColor);
        forX = new ArrayList<Integer>();
        forY = new ArrayList<Integer>();
        if (x >= 0){ k = x;
            for (double i = k; i >= x*(-1); i -= 0.1)
            {
                y = ((i * a) + b);
                forX.add((int) i);
                forY.add((int) y);
            }}
        if (x < 0) {k = x*(-1);
            for (double i = x; i <= k; i += 0.1)
            {
                y = ((i * a) + b);
                forX.add((int) i);
                forY.add((int) y);
            }}

        for (int i = 0; i < forX.size() - 1; i++)
        {
            g2d.drawLine(forX.get(i) + 200, forY.get(i) + 200, forX.get(i + 1) + 200, forY.get(i + 1) + 200);

        }
    }
}
