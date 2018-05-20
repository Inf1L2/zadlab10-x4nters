package pl.edu.ur.oopl10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static void zadanie1(){
        WprowadzZKonsoli getFromConsole = new WprowadzZKonsoli();
        getFromConsole.wprowadzInt();
        getFromConsole.wprowadzFloat();
        getFromConsole.wprowadzChar();

        System.out.println("! Powrot do menu...");
    }
    
    private static void zadanie2(){
        AioobeTest aioobeTest = new AioobeTest();
        aioobeTest.test();
        System.out.println("! Powrot do menu...");
    }
    
    private static void zadanie3(){
        ExceptionThrowTest ett = new ExceptionThrowTest();
        ett.test();
        System.out.println("! Powrot do menu...");
    }
    
    private static void zadanie4(){
        RandomDivide randomDivide = new RandomDivide();
        System.out.println("! Powrot do menu...");
    }
    
    private static void zadanie5(){
        WprowadzZKonsoliExtended wzke = new WprowadzZKonsoliExtended();
        wzke.odczytajInt();
        wzke.odczytajFloat();
        wzke.odczytajChar();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Usunac pliki zapisu? 1 - tak, 0 - nie");
        System.out.print("Odpowiedz > ");
        switch(scanner.nextInt()){
            case 1:
                File saveInt = new File("saveInt.txt");
                saveInt.delete();
                File saveFloat = new File("saveFloat.txt");
                saveFloat.delete();
                File saveChar = new File("saveChar.txt");
                saveChar.delete();
                System.out.println("Usunieto");
                break;
            case 0:
                break;
            default:
                System.out.println("! Nieprawidlowa opcja. Nie usuwam danych");
                break;
        }
        System.out.println("! Powrot do menu...");
    }
    
    public static void main(String[] args) {
        int menuSelect;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Lab10 > Menu >");
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 5 ] Zadanie 5");
            System.out.println(" [ 0 ] Wyjscie");
            System.out.print("Menu > ");
            menuSelect = scanner.nextInt();
            
            switch(menuSelect){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
                case 0: break;
            }
        }while(menuSelect!=0);
    }
}
