package MyTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алина on 25.07.2016.
 */
public class JavaRushLevel7Lesson4unit2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list=new int[10];

        for(int i=0; i<list.length; i++){
            String s=reader.readLine();
            list[i]=Integer.parseInt(s);
        }

    }
}
