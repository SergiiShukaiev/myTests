package MyTests;

import javax.swing.*;

/**
 * Created by Алина on 27.08.2016.
 */
public class Retirement
{
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog("Сколько денег Вам нужно для пенсии?");
        double goal=Double.parseDouble(input);

        input=JOptionPane.showInputDialog("Каков объем Вашего ежегодного взноса?");
        double payment=Double.parseDouble(input);

        input=JOptionPane.showInputDialog("Процентная ставка, % :");
        double interestRate=Double.parseDouble(input);

        double balance=0;
        int years=0;

        while (balance<goal){
            balance +=payment;
            double interest=balance*interestRate/100;
            balance +=interest;
            years ++;
        }
        System.out.println("Можете идти на пенсию через " + years+" лет.");
        System.exit(0);
    }
}
