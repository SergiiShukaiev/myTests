package MyTests.threbuttonchange;

/**
 * Created by Алина on 15.09.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class ThreButtonChange
{
    public static void main(String[] args){
        new ThreButtonChange().startUp();
    }
    public void startUp(){
        MyFrame frame=new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public class MyFrame extends JFrame{
        final int DEFAULT_WIDTH=800;
        final int DEFAULT_HEIGHT=500;

        public MyFrame(){
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            setTitle("Hello!");
            MainPanel mainPanel=new MainPanel();
            ButtonTime buttonTime=new ButtonTime();
            add(BorderLayout.NORTH, buttonTime);
            add( BorderLayout.CENTER,  mainPanel);
        }
    }

    public class MainPanel extends JPanel{
        JTextArea textArea=new JTextArea(20, 15);

        MainPanel(){
            JPanel gridButton=new JPanel();
        JButton yellowButton=new JButton("Yellow");
        JButton greenButton=new JButton("Green");
        JButton redButton=new JButton("Red");
        ColorAction yellowAction=new ColorAction(Color.yellow);
        ColorAction greenAction=new ColorAction(Color.green);
        ColorAction redAction=new ColorAction(Color.red);
        gridButton.setLayout(new GridLayout(3,1));
            gridButton.add(greenButton);
        gridButton.add(yellowButton);
        gridButton.add(redButton);
        yellowButton.addActionListener(yellowAction);
        greenButton.addActionListener(greenAction);
        redButton.addActionListener(redAction);
            add(gridButton, BorderLayout.WEST );

        textArea.setLineWrap(false);
        add(textArea, BorderLayout.EAST ); }


        public class ColorAction implements ActionListener{
           private String str;
          private  Color background;
            public ColorAction(Color c){
                background=c;
                str=c.toString();
            }
            public void actionPerformed(ActionEvent event){

                textArea.append(str+"\n");
                setBackground(background);
            }
        }
    }



    public class ButtonTime extends JPanel{
        JTextField textField=new JTextField(20);
        ButtonTime(){
            //JPanel lowPanel=new JPanel();
            JButton buttonTime=new JButton("Time and Date");
            TimeAction timeAction=new TimeAction();
            buttonTime.addActionListener(timeAction);
            add(buttonTime);
            add(textField);
        }

        public class TimeAction implements ActionListener{
            Date date;
           // TimeAction(){}
            public void actionPerformed(ActionEvent event){
                date=new Date();
                SimpleDateFormat format=new SimpleDateFormat("dd MMMM yyyy, HH:mm:ss"  , Locale.ENGLISH );

                String strDate= format.format(date);
                textField.setText(strDate);
            }
        }

    }
}
