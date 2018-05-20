package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {
    public void wprowadzInt(){
        int intValue;
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Podaj liczbe int: ");
            intValue = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
    
    public void wprowadzFloat(){
        float floatValue;
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Podaj liczbe float: ");
            floatValue = scanner.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
    
    public void wprowadzChar(){
        char charValue;
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Podaj znak: ");
            charValue = scanner.next().charAt(0);
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
}
