package MyTests.promoappversion1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Алина on 20.09.2016.
 */
public class PanelLabel extends JPanel
{
    JButton buttonLabel;
    JButton button;
    JFrame frame;
    JLabel label;

    public PanelLabel(){
        buttonLabel=new JButton("Опасная кнопка!");
        buttonLabel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                frame=new JFrame("Опасное меню!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setBounds(600, 200, 250, 250);
                frame.setBackground(Color.RED);
                label=new JLabel("         Fuck you!!! Fuck you!!! Fuck you!!!  ");
                label.setBackground(Color.RED);
                button=new JButton("Назад");
                button.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        frame.dispose();
                    }
                });
                frame.add(BorderLayout.CENTER, label);
                frame.add(BorderLayout.SOUTH, button);
            }
        });
        add(buttonLabel);
    }
}
