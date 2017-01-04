package MyTests;

import java.io.IOException;

/**
 * Created by Алина on 25.07.2016.
 */
public class JavaRushLevel7Lesson4Unit5
{
    public static void main(String[] args) throws IOException
    {
        int[] list={6,8,74,-9,-123,0,987,3,-12};

        int min=list[0];
        for(int i=0; i<list.length; i++){
            if (list[i]<min)
                min=list[i];

        }
        System.out.println(min);


    }
}
