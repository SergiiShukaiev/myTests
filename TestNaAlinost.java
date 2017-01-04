package MyTests;

import javax.swing.*;

/**
 * Created by Алина on 27.08.2016.
 */
public class TestNaAlinost
{
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog("Сечас мы разберемся кто здесь Алина. Сколько тебе лет?");
        double years=Integer.parseInt(input);

        input=JOptionPane.showInputDialog("У тебя длинная грива? (N/Y)");
        input=input.toUpperCase();
        boolean griva;
        if (input.equals("Y")) griva=true;
        else griva=false;

        input=JOptionPane.showInputDialog("Любишь лук? (N/Y");
        input=input.toUpperCase();
        boolean luk;
        if (input.equals("N")) luk=true;
        else luk=false;

        input=JOptionPane.showInputDialog("Ты гусь? (N/Y)");
        input=input.toUpperCase();
        boolean gus;
        if (input.equals("Y")) gus=true;
        else gus=false;

        if (years==25 && griva==true && luk==true && gus==true)
            System.out.println("Тебя вычеслили АЛИНОЧКА!!!!");
        else if (years==25 && griva==true && luk==true && gus==false)
            System.out.println("Хоть ты указала что ты не гусь. Но я тебя узнал АЛИНОЧКА!!!");
        else if(years==29 && griva==false && luk==false && gus==false)
            System.out.println("Ты СЕРЕНЕЧКА и просто красавчик!!!");
        else System.out.println("Уходи от мэнэ! Ты не АЛИНОЧКА!!!");
    }
}
