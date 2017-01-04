package MyTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алина on 25.07.2016.
 */
public class JavaRushLevel7Lesson4
{
    public static void main(String[] args)throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] list=new String[10];

        for (int i=0; i<list.length; i++){
            list[i]=reader.readLine();
        }

    }
}
