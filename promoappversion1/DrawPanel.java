package MyTests.promoappversion1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Алина on 21.09.2016.
 */
public class DrawPanel extends JPanel
{
    BufferedImage image = null;

    DrawPanel()
    {
        super();
        setVisible(true);
        setSize(400, 400);
        //  removeAll();
        //   revalidate();
        // repaint();
        draw();
    }

    protected BufferedImage getImage()
    {
        return image;
    }

    protected void setImage(BufferedImage image)
    {
        this.image = image;
    }

    public void draw()
    {

        try
        {
            Image image = ImageIO.read(new File("E:\\images.jpg"));
            Graphics g = image.getGraphics();
            paintComponent(g, image);
        }
        catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Такого файла не существует!");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Исключение ввода-вывода!");
        }

}

  /*  protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null, 0,0,0,0, this);

    }*/
    protected void paintComponent(Graphics g, Image img){
        super.paint(g);
        g.drawImage(img,50, 50,300,300, this);
    }
}
