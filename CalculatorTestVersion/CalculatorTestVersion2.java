package MyTests.CalculatorTestVersion;

/**
 * Created by Алина on 19.09.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTestVersion2
{
    public static void main(String[] args){
      new CalculatorTestVersion2().startUp();
    }

    public void startUp(){
        BuildGUI buildGUI=new BuildGUI();
        buildGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildGUI.setVisible(true);
    }
}

class BuildGUI extends JFrame{
    private int DEFAULT_WIDTH=200;
    private int DEFAULT_HEIGHT=300;

    BuildGUI(){
        ButtonPanel buttonPanel=new ButtonPanel();
        setBounds(300, 300, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Calculator version 2");
        add(buttonPanel);
    }
}

class ButtonPanel extends JPanel{

  private  double value;
   private String operation;
   private JTextArea display;
   private JPanel buttonPanel;
  private JButton buttonEquelly;

    ButtonPanel(){
        setLayout(new BorderLayout());
        ActionListener numListener=new NumAction();
        ActionListener compListener=new CompListener();
        operation="+";
        value=0;

        display=new JTextArea();
        display.setSelectionColor(Color.PINK);

        buttonEquelly=new JButton("=");
        buttonEquelly.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                double  secondValue=Double.parseDouble(display.getText());
                if (("+").equals(operation)) display.setText(value+secondValue+"");
                if (("-").equals(operation)) display.setText(value-secondValue+"");
                if (("*").equals(operation)) display.setText(value*secondValue+"");
                if (("/").equals(operation)) display.setText(value/secondValue+"");

                operation="+";
                value=0;
            }
        });

        buttonPanel=new JPanel(new GridLayout(4,4));

        add(display, BorderLayout.NORTH );
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonEquelly, BorderLayout.SOUTH);

       addButton("7", numListener);
       addButton("8", numListener);
       addButton("9", numListener);
       addButton("/", compListener);

        addButton("4", numListener);
        addButton("5", numListener);
        addButton("6", numListener);
        addButton("*", compListener);

        addButton("1", numListener);
        addButton("2", numListener);
        addButton("3", numListener);
        addButton("-", compListener);

        addButton("0", numListener);
        addButton(".", new ActionListener() {
        public void actionPerformed (ActionEvent ev){
            String str = display.getText();
            if (str.isEmpty() || str.contains(".")) return;
            else display.setText(str + ".");
            }});

        addButton("C", new ActionListener() {
                    public void actionPerformed(ActionEvent ev){
                        String str=display.getText();
                        str=str.substring(0, str.length()-1);
                        display.setText(str);
                        if (str.isEmpty()) display.setText("0");
                    }});

        addButton("+", compListener);
    }

    public void addButton(String sign, ActionListener listener){
        JButton numButton=new JButton(sign);
        numButton.addActionListener(listener);
        buttonPanel.add(numButton);
    }

    class NumAction implements ActionListener{
          public void actionPerformed(ActionEvent ev){
           String input=ev.getActionCommand();
           String str= display.getText();
            display.setText(str + input);
        }
    }

    class CompListener implements ActionListener{
         public void actionPerformed(ActionEvent ev){
             String sign=ev.getActionCommand();
           value=Double.parseDouble(display.getText());
            display.setText("");
            if (sign.equals("+")) operation="+";
            if (sign.equals("-")) operation="-";
            if (sign.equals("*")) operation="*";
            if (sign.equals("/")) operation="/";
        }
    }
}
