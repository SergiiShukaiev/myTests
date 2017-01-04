package MyTests;

/**
 * Created by Алина on 04.09.2016.
 */
public class StackTraceTestLevel9
{
    public static void main(String[] args){
        new StackTraceTestLevel9().test();
    }

    public void test(){
        test1();
    }
    public void test1(){
        test2();
    }
    public void test2(){
        test3();
    }
    public void test3(){
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        for(StackTraceElement el:element)
            System.out.println(el.getMethodName());
    }
}
