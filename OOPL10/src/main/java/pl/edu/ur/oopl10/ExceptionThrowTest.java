package pl.edu.ur.oopl10;

public class ExceptionThrowTest {
    public void test(){
        ArithmeticThrow arithmeticThrow = new ArithmeticThrow();
        
        try{
            arithmeticThrow.test();
            System.out.println("Klasa poprzedzajaca przechwycila i obsluzyla wyjatek (ArithmeticException)");
        }
        catch(ArithmeticException e){
            System.out.println("Poprzednia klasa nie przechwycila wyjatku (ArithmeticException)");
        }
    }
}
