package MyTests.promoappmathgraphicsversion1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Алина on 22.09.2016.
 */
abstract class ShapeGraphic extends JPanel
{
    protected double x;
    protected double a;
    protected double b;
    double y;
    double k;
    ArrayList<Integer>forX;
    ArrayList<Integer>forY;

    public ShapeGraphic(double x, double a, double b)
    {
        super();
        remove(this);
        repaint();
        setVisible(true);
        this.x=x;
        this.a=a;
        this.b=b;

       // setBackground(Color.BLACK);

    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.BLACK);
        g2d.setBackground(Color.black);
        BasicStroke c=new BasicStroke(2);
        g2d.setStroke(c);
        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color randColor=new Color(red,green,blue);
        g2d.setColor(randColor);
        forX=new ArrayList<Integer>();
        forY=new ArrayList<Integer>();
    }
}
