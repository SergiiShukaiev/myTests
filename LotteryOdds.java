package MyTests;

import javax.swing.*;

/**
 * Created by Алина on 30.08.2016.
 */
public class LotteryOdds
{
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog("Сколько номеров нужно угадать?");
        int k=Integer.parseInt(input);

        input=JOptionPane.showInputDialog("Чему равен наибольший из возможных номеров?");
        int n=Integer.parseInt(input);

        int lotteryodds=1;

        for (int i=0; i<=k; i++)
            lotteryodds=lotteryodds*(n-i+1)/1;

        System.out.println("Ваш шанс равен 1 из "+lotteryodds+". Удачи!");

        System.exit(0);
    }
}
