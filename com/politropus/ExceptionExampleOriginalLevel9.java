package MyTests.com.politropus;

/**
 * Created by Алина on 05.09.2016.
 */
public class ExceptionExampleOriginalLevel9
{
    public static void main(String[] args){
        System.out.println("main begin");
        try{
            System.out.println("main before call");
            method1();
            System.out.println("main aftercall");
        } catch (RuntimeException e){
            String s=e.getMessage();
            System.out.println(s);
        }
        System.out.println("main end");
    }

    public static void method1(){
        System.out.println("mthod1 begin");
        method2();
        System.out.println("method1 end");
    }

    public static void method2(){
        System.out.println("method2");
        String s="Message uknow excwption";
        throw new RuntimeException(s);
    }
}
