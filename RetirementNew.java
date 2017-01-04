package MyTests;

import javax.swing.*;
import java.text.NumberFormat;

/**
 * Created by Алина on 27.08.2016.
 */
public class RetirementNew
{
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog("Каков объем Вашего ежегодного взноса?");
        double payment=Double.parseDouble(input);

        input=JOptionPane.showInputDialog("Процентнаяставка ставка, % :");
        double interestRate=Double.parseDouble(input);

        double balance=0;
        int years=0;

        NumberFormat formatter= NumberFormat.getCurrencyInstance();

        do{
            balance+=payment;
            double interest=balance*interestRate/100;
            balance+=interest;

            years++;

            System.out.println("После "+years+" на Вашем счету "+formatter.format(balance));

            input=JOptionPane.showInputDialog("Вы собираетесь на пенсию? (Y/N)");
            input=input.toUpperCase();}
        while (input.equals("N"));
            System.exit(0);


    }
}
