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
public class BuildGUI extends JFrame
{
    private int DEFAULT_WIDTH=600;
    private int DEFAULT_HEIGHT=400;
    private int X=400;
    private int Y=100;
    JPanel mainPanelButton;
    DrawPanel mainDrawPanel;
    ThreeAngle threeAngle;
    Square square;
    Circle circle;
    BufferedImage bufferedImage;

    public BuildGUI() {
    setBounds(X, Y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Promo App Version 1.0");
        setBackground(Color.BLUE);
        setLayout(new BorderLayout());

        ImageListener imageListener=new ImageListener();
        ShapeListener shapeListener=new ShapeListener();

        PanelTime panelTime=new PanelTime();
        PanelLabel panelLabel=new PanelLabel();

        mainPanelButton=new JPanel(new GridLayout(4,1));
        addGrid("Треугольник", shapeListener);
        addGrid("Прямоугольник", shapeListener);
        addGrid("Круг", shapeListener);
        addGrid("Картинка", imageListener);
        add(mainPanelButton, BorderLayout.WEST);

        threeAngle=new ThreeAngle();
        square=new Square();
        circle=new Circle();
        mainDrawPanel=new DrawPanel();


      /*  PanelMain panelMain=new PanelMain();
        panelMain.setVisible(true);
        panelMain.setBackground(Color.gray); */

        add(BorderLayout.NORTH, panelTime);
        add(BorderLayout.SOUTH, panelLabel);
       }

    public void addGrid(String name, ActionListener listener){
        JButton button=new JButton(name);
        button.addActionListener(listener);
        mainPanelButton.add(button);
    }

   public class ImageListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            removePanel();
            try{
          /*      bufferedImage  = ImageIO.read(new File("E:\\images.jpg"));
                mainDrawPanel.setImage(bufferedImage);
                mainDrawPanel.revalidate();
                mainDrawPanel.repaint(); */

               Image image= ImageIO.read(new File("E:\\images.jpg"));
                Graphics g = image.getGraphics();
                mainDrawPanel.paintComponent(g,  image);
                mainDrawPanel.repaint();
                mainDrawPanel.revalidate();
            } catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Такого файла не существует!");
            } catch (IOException ex) {JOptionPane.showMessageDialog(null, "Исключение ввода-вывода!");}

            add(mainDrawPanel);
            revalidate();
            repaint();


   /*        try
           {
               Image image = ImageIO.read(new File("E:\\images.jpg"));
               Graphics g = image.getGraphics();
               setIconImage( image);
           }
           catch (FileNotFoundException ex)
           {
               JOptionPane.showMessageDialog(null, "Такого файла не существует!");
           }
           catch (IOException ex)
           {
               JOptionPane.showMessageDialog(null, "Исключение ввода-вывода!");
           }
           revalidate();
           repaint(); */
        }
    }


    public class ShapeListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String labelName=event.getActionCommand();
            removePanel();

            if (labelName.equals("Треугольник")){

                add(threeAngle);
            }
            if (labelName.equals("Прямоугольник")){

                add(square);
            }
            if (labelName.equals("Круг")){

                add(circle);
            }
            revalidate();
            repaint();
        }
    }
    public void removePanel(){
        remove(threeAngle);
        remove(square);
        remove(circle);
        remove(mainDrawPanel);
        revalidate();
        repaint();
    }
}
