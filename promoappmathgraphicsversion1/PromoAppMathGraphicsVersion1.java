package MyTests.promoappmathgraphicsversion1;

import javax.swing.*;

/**
 * Created by Алина on 22.09.2016.
 */
public class PromoAppMathGraphicsVersion1
{
    public static void main(String[] args){
        new PromoAppMathGraphicsVersion1().setUp();
    }
    public void setUp(){
        BuildGUI frame=new BuildGUI();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
