package MyTests.promoappmathgraphicsversion1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Алина on 22.09.2016.
 */
public class TitlePanel extends JPanel
{
    JLabel halloText;
    JButton timeButton;
    JTextField timeField;

    TitlePanel(){
        setVisible(true);
        setBackground(Color.GREEN);


        halloText=new JLabel("Приветствую тебя, дорогой человек!");
        halloText.setBackground(Color.YELLOW);
        timeField=new JTextField(15);
        timeField.setSelectedTextColor(Color.YELLOW);
        timeField.setBackground(Color.LIGHT_GRAY);
        timeButton=new JButton("Точное время");
        timeButton.setBackground(Color.LIGHT_GRAY);
        timeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
           Date date=new Date();
                SimpleDateFormat formatdate=new SimpleDateFormat("dd MMM yyyy, HH:mm:ss");
                String str=formatdate.format(date);
                timeField.setText(str);
            }
        });


        add(halloText, BorderLayout.WEST);
        add(timeButton, BorderLayout.CENTER);
        add(timeField, BorderLayout.EAST);
    }
}
