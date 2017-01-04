package MyTests;

/**
 * Created by Алина on 10.09.2016.
 */
public class JavaRushLevel11lesson4
{
    public static void main(String[] args){
        JavaRushLevel11lesson4 lesson=new JavaRushLevel11lesson4();
        int a=(int) (Math.random() * 1000);
        int b=(int) (Math.random()*1000);
        lesson.min( a, b);
        //lesson.print(b);
     //   print(a);
        lesson.min (a, b);
        lesson.min(a,b);
    }

   public static int min(int a, int b){
       int min;
       if (a<b) min=a;
       else min=b;
       System.out.println(min);
       return min;
   }
    public static long min(long a, long b){
        long min;
        if (a<b) min=a;
        else min=b;
        System.out.println(min);
        return min;
    }
    public static double min(double a, double b){
        double min;
        if(a<b) min=a;
        else min=b;
        System.out.println(min);
        return min;
    }
}

