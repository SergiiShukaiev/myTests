package MyTests.promoappmathgraphicsversion1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Алина on 22.09.2016.
 */
public class BuildGUI extends JFrame
{
    private int X=200;
    private int Y=50;
    private int DEFAULT_WIDTH=700;
    private int DEFAULT_HEIGHT=450;
    TitlePanel titlePanel;
    JPanel mainPanel;
    JPanel buttonPanel;
    JPanel inputPanel;
    JTextField fieldX;
    JTextField fieldA;
    JTextField fieldB;
    double x;
    double a;
    double b;
    CubGraphic cub;
    QuadroGraphic quadro;
    LineGraphic line;
    GiperbolaGraphic gip;


    BuildGUI(){
    setBounds(X,Y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
    setLayout(new BorderLayout());
        setTitle("Mathematic's Graphics App");
        setBackground(Color.CYAN);

  /*      cub=new CubGraphic(x,a,b);
        quadro=new QuadroGraphic(x,a,b);
        line=new LineGraphic(x,a,b);
        gip=new GiperbolaGraphic(x,a,b);   */

        titlePanel=new TitlePanel();
        add(titlePanel, BorderLayout.NORTH);

        DrawListener drawListener=new DrawListener();

        mainPanel=new JPanel(new GridLayout(2,1));
        buttonPanel=new JPanel(new GridLayout(5,1));
        addButton("a*x3+b", drawListener);
        addButton("a*x2+b", drawListener);
        addButton("a*x+b", drawListener);
        addButton("a/x+b", drawListener);
        addButton("Изменение цвета", drawListener);

        fieldX=new JTextField(8);
        fieldX.setBackground(Color.pink);
        fieldA=new JTextField(8);
        fieldA.setBackground(Color.pink);
        fieldB=new JTextField(8);
        fieldB.setBackground(Color.pink);

        inputPanel=new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("Заполните пустые поля:"));
        inputPanel.add(new JLabel("      "));
        addLabel("x");
        inputPanel.add(fieldX);
        addLabel("a");
        inputPanel.add(fieldA);
        addLabel("b");
        inputPanel.add(fieldB);
        inputPanel.add(new JLabel("   "));
        inputPanel.add(new JLabel("Выберите функцию"));

        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);

        add(BorderLayout.WEST, mainPanel);

}
    public void addButton(String label, ActionListener listener){
        JButton buttonF=new JButton(label);
        buttonF.addActionListener(listener);
        buttonF.setBackground(Color.CYAN);
        buttonPanel.add(buttonF);
    }

    public void addLabel(String b){
        JLabel label=new JLabel("Введите значение "+b+" :");
        inputPanel.add(label);
    }

    class DrawListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
           try
           {
             x = Double.parseDouble(fieldX.getText());
           } catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Некорректный ввод для Х!");
               fieldX.setText("");}
            try{
            a = Double.parseDouble(fieldA.getText());
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Некорректный ввод для А!");
                fieldA.setText("");}
            try{
            b = Double.parseDouble(fieldB.getText());
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Некорректный ввод для B!");
               fieldB.setText("");}

            String command=event.getActionCommand();

            cub=new CubGraphic(x,a,b);
            quadro=new QuadroGraphic(x,a,b);
            line=new LineGraphic(x,a,b);
            gip=new GiperbolaGraphic(x,a,b);

            if ("a*x3+b".equals(command)){

                add(cub);}
            if ("a*x2+b".equals(command)){
                add(quadro);}
            if ("a*x+b".equals(command)){
                add(line);}
            if ("a/x+b".equals(command)){
                add(gip);
            }
            if ("Очистить панель".equals(command)){
               // removePanel();
                remove(cub);
                remove(quadro);
                remove(line);
                remove(gip);
                revalidate();
                repaint();
            }

            revalidate();
            repaint();
        }
    /*    public void removePanel(){
            remove(cub);
            remove(quadro);
            remove(line);
            remove(gip);
            revalidate();
            repaint();
        } */
    }
}
