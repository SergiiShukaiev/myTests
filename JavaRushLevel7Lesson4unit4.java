package MyTests;

import java.io.IOException;

/**
 * Created by Алина on 25.07.2016.
 */
public class JavaRushLevel7Lesson4unit4
{
    public static void main(String[] args) throws IOException
    {
        int[] list={5,9,8,7,-456,987,-2,-3,0,65,95,7};
        int sum=0;
        for (int i=0; i<list.length; i++)
            sum+=list[i];

        System.out.println("Sum is " +sum);

    }
}
