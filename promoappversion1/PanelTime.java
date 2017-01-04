package MyTests.promoappversion1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Алина on 20.09.2016.
 */
public class PanelTime extends JPanel
{
    private JTextField dateField;
    private JButton dateButton;

    public PanelTime(){
        dateField=new JTextField(14);
        dateField.setBackground(Color.YELLOW);
        dateButton=new JButton("Точное время и дата");
        dateButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                Date date=new Date();
                SimpleDateFormat format=new SimpleDateFormat("dd MMM yyyy, HH:mm:ss", Locale.ENGLISH);
                dateField.setText( format.format(date));
            }
        });
        add(dateButton);
        add(dateField);
    }
}
