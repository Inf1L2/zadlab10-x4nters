package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WprowadzZKonsoliExtended {
    public void odczytajInt(){
        int intValue;

        try{
            System.out.println("Proba odczytania liczby z pliku readInt.txt...");
            FileReader fr = new FileReader("readInt.txt");
            BufferedReader br = new BufferedReader(fr);
            
            intValue = Integer.parseInt(br.readLine());
            br.close();

            PrintWriter writer = new PrintWriter("saveInt.txt", "UTF-8");
            writer.println(intValue);
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("! Brak pliku 'readInt.txt'");
        }
        catch(NumberFormatException e){
            System.out.println("! Wyjatek NumberFormatException");
        }
        catch(IOException e){
            System.out.println("! Wyjatek IOException");
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
    
    public void odczytajFloat(){
        float floatValue;

        try{
            System.out.println("Proba odczytania liczby z pliku readFloat.txt...");
            FileReader fr = new FileReader("readFloat.txt");
            BufferedReader br = new BufferedReader(fr);
            
            floatValue = Float.parseFloat(br.readLine());
            br.close();

            PrintWriter writer = new PrintWriter("saveFloat.txt", "UTF-8");
            writer.println(floatValue);
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("! Brak pliku 'readFloat.txt'");
        }
        catch(NumberFormatException e){
            System.out.println("! Wyjatek NumberFormatException");
        }
        catch(IOException e){
            System.out.println("! Wyjatek IOException");
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
    
    public void odczytajChar(){
        char charValue;

        try{
            System.out.println("Proba odczytania liczby z pliku readChar.txt...");
            FileReader fr = new FileReader("readChar.txt");
            BufferedReader br = new BufferedReader(fr);
            
            charValue = br.readLine().charAt(0);
            br.close();

            PrintWriter writer = new PrintWriter("saveChar.txt", "UTF-8");
            writer.println(charValue);
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("! Brak pliku 'readChar.txt'");
        }
        catch(NumberFormatException e){
            System.out.println("! Wyjatek NumberFormatException");
        }
        catch(IOException e){
            System.out.println("! Wyjatek IOException");
        }
        catch(InputMismatchException e){
            System.out.println("! -> Blad. Wprowadzono nieprawidlowy typ danych!");
        }
    }
}

