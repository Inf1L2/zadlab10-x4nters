package pl.edu.ur.oopl10;
import java.util.Scanner;

public class ArithmeticThrow extends Exception {
    public void test(){
        double dzielna = 10;
        double dzielnik = 0;
        double wynik;
        
        try{
            wynik = dzielna / dzielnik;
        }
        catch(ArithmeticException e){
            System.out.println("\n\n! -> Przechwycono ArithmeticException (dzielenie przez zero)\n\n");
        }
    }
}
