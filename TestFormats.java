package MyTests;

import java.util.Date;

/**
 * Created by Алина on 05.08.2016.
 */
public class TestFormats
{
    public static void main(String[] args){
        String s =String.format("%,d", 1000000000);
        System.out.println(s);

        String d=String.format("%tA, %<tB %<td", new Date());
        System.out.println(d);
    }
}
