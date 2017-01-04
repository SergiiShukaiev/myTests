package MyTests.promoappversion1;

import javax.swing.*;

/**
 * Created by Алина on 20.09.2016.
 */
public class PromoAppVersion1
{
    public static void main(String[] args){
        new PromoAppVersion1().setUp();
    }
    public void setUp(){
        JOptionPane.showMessageDialog(null, "Вы точно хотите начать?");
        buildGUI();
    }
    public void buildGUI(){
        BuildGUI frame=new BuildGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
