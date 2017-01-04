package MyTests.promoappversion1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Алина on 20.09.2016.
 */
public class PanelMain extends JPanel
{
    JPanel gridButton;
    DrawPanel drawPanel;
    BufferedImage bufferedImage=null;
  //  Graphics g;

    PanelMain(){
        setLayout(new BorderLayout());

        drawPanel=new DrawPanel();
        drawPanel.setVisible(true);
        drawPanel.setPreferredSize(new Dimension(300,300));

        gridButton=new JPanel(new GridLayout(4,1));

        ImageListener imageListener=new ImageListener();
        ShapeListener shapeListener=new ShapeListener();

        addGrid("Треугольник", shapeListener);
        addGrid("Прямоугольник", shapeListener);
        addGrid("Круг", shapeListener);
        addGrid("Картинка", imageListener);
           add(gridButton, BorderLayout.WEST);
           add(drawPanel);
        repaint();

          }
    public void addGrid(String name, ActionListener listener){
        JButton button=new JButton(name);
        button.addActionListener(listener);
        gridButton.add(button);
    }

    public class ImageListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
         /*   try
            {
               // drawPanel.removeAll();


                bufferedImage  = ImageIO.read(new File("E:\\images.jpg"));
                drawPanel.getImage();
                drawPanel.setImage(bufferedImage);


                Image image=ImageIO.read(new File("E:\\images.jpg"));
                Graphics g = image.getGraphics();
                drawPanel.paintComponent(g,  image);
                drawPanel.repaint();
                drawPanel.revalidate();
            } catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Такого файла не существует!");
            } catch (IOException ex) {JOptionPane.showMessageDialog(null, "Исключение ввода-вывода!");} */
        }
    }


    public class ShapeListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String labelName=event.getActionCommand();
            drawPanel.removeAll();
            drawPanel.revalidate();
            drawPanel.repaint();
            if (labelName.equals("Треуголник")) drawPanel.add(new ThreeAngle());
            if (labelName.equals("Прямоуголник")) drawPanel.add(new Square());
            if (labelName.equals("Круг")) drawPanel.add(new Circle());



        }
    }
   }
