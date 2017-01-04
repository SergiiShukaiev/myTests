package MyTests.CalculatorTestVersion;

/**
 * Created by Алина on 06.09.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorTestVersion
{
    JFrame frame;
    JPanel mainPanel;
    JTextField textField;
    JTextArea display;
    double value=0.0;
    String operation="+";

    public static void main(String[] args)
    {
        new CalculatorTestVersion().go();
    }

    public void go()
    {
        buildGUI();
    }

    public void buildGUI()
    {
        frame = new JFrame("Calculator");
        frame.setBounds(300,300,300,300);
        frame.setLayout(new BorderLayout());
        JPanel grandback = new JPanel(new GridLayout(4, 4));
        mainPanel = new JPanel();

   /*     Box buttonBox1 = new Box(BoxLayout.Y_AXIS);
        Box buttonBox2 = new Box(BoxLayout.Y_AXIS);
        Box buttonBox3 = new Box(BoxLayout.Y_AXIS);
        Box buttonBox4 = new Box(BoxLayout.Y_AXIS); */

        display = new JTextArea();
        display.setSelectionColor(Color.lightGray);

        JButton button0 = new JButton("0");
        button0.addActionListener(new MyActionListener0());
        JButton button1 = new JButton("1");
             button1.addActionListener(new MyActionListener1());
        JButton button2 = new JButton("2");
              button2.addActionListener(new MyActionListener2());
        JButton button3 = new JButton("3");
             button3.addActionListener(new MyActionListener3());
        JButton button4 = new JButton("4");
             button4.addActionListener(new MyActionListener4());
        JButton button5 = new JButton("5");
             button5.addActionListener(new MyActionListener5());
        JButton button6 = new JButton("6");
             button6.addActionListener(new MyActionListener6());
        JButton button7 = new JButton("7");
            button7.addActionListener(new MyActionListener7());
        JButton button8 = new JButton("8");
            button8.addActionListener(new MyActionListener8());
        JButton button9 = new JButton("9");
             button9.addActionListener(new MyActionListener9());

        JButton buttonPoint = new JButton(".");
            buttonPoint.addActionListener(new PointActionListener());
        JButton buttonPlus = new JButton("+");
             buttonPlus.addActionListener(new PlusActionListener());
        JButton buttonMinus = new JButton("-");
             buttonMinus.addActionListener(new MinusActionListener());
        JButton buttonMultiplay = new JButton("*");
            buttonMultiplay.addActionListener(new MultiplayActionListener());
        JButton buttonDivide = new JButton("/");
            buttonDivide.addActionListener(new DivideActionListener());
        JButton buttonEquelly = new JButton("=");
          buttonEquelly.addActionListener(new EquellyActionListener());

     /*   buttonBox1.add(button7);
        buttonBox1.add(button4);
        buttonBox1.add(button1);
        buttonBox1.add(button0);

        buttonBox2.add(button8);
        buttonBox2.add(button5);
        buttonBox2.add(button2);
        buttonBox2.add(buttonPoint);

        buttonBox3.add(button9);
        buttonBox3.add(button6);
        buttonBox3.add(button3);
        buttonBox3.add(buttonEquelly);

        buttonBox4.add(buttonDivide);
        buttonBox4.add(buttonMultiplay);
        buttonBox4.add(buttonMinus);
        buttonBox4.add(buttonPlus);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(buttonBox1);
        buttonBox.add(buttonBox2);
        buttonBox.add(buttonBox3);
        buttonBox.add(buttonBox4); */
        grandback.add(button7);
        grandback.add(button8);
        grandback.add(button9);
        grandback.add(buttonDivide);

        grandback.add(button4);
        grandback.add(button5);
        grandback.add(button6);
        grandback.add(buttonMultiplay);

        grandback.add(button1);
        grandback.add(button2);
        grandback.add(button3);
        grandback.add(buttonMinus);

        grandback.add(button0);
        grandback.add(buttonEquelly);
        grandback.add(buttonPoint);
        grandback.add(buttonPlus);

        /* textField=new JTextField();

        Box panelBox = new Box(BoxLayout.Y_AXIS);
        panelBox.add(display);
        panelBox.add(buttonBox);

        grandback.add(panelBox);

        mainPanel.add(BorderLayout.NORTH, display);
        mainPanel.add(BorderLayout.CENTER, grandback); */

        frame.getContentPane().add(BorderLayout.CENTER, grandback);
        frame.getContentPane().add(BorderLayout.NORTH, display);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setSize(200, 300);
        frame.pack();
        frame.setVisible(true);

    }

    class MyActionListener0 implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            display.setText(display.getText()+"0");
        }
    }

    class MyActionListener1 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"1");
        }
    }
    class MyActionListener2 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"2");
        }
    }
    class MyActionListener3 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"3");
        }
    }
    class MyActionListener4 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"4");
        }
    }
    class MyActionListener5 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"5");
        }
    }
    class MyActionListener6 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"6");
        }
    }
    class MyActionListener7 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"7");
        }
    }
    class MyActionListener8 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"8");
        }
    }
    class MyActionListener9 implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            display.setText(display.getText()+"9");
        }
    }

    class PlusActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            value=Double.valueOf(display.getText());
            display.setText("");
            operation="+";
        }
    }
    class MinusActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            value=Double.valueOf(display.getText());
            display.setText("");
            operation="-";
        }
    }
    class MultiplayActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            value=Double.parseDouble(display.getText());
            display.setText("");
            operation="*";
        }
    }
    class DivideActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            value=Double.valueOf(display.getText());
            display.setText("");
            operation="/";
        }
    }
    class PointActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if(display.getText().contains(".") || display.getText().isEmpty()) return;
            else display.setText(display.getText()+".");
        }
    }

    class EquellyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            double secondValue=Double.valueOf(display.getText());
            if ("+".equals(operation)){
                display.setText(value+secondValue+"");
            }
            if ("-".equals(operation)) display.setText(value-secondValue+"");
            if ("*".equals(operation)) display.setText(value*secondValue+"");
            if ("/".equals(operation)) display.setText(value/secondValue+"");

            operation="+";
            value=0;

        }
    }
}