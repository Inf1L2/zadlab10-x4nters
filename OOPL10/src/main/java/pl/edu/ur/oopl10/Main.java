package pl.edu.ur.oopl10;
import java.util.Scanner;

public class Main {
    private static void zadanie1(){
        WprowadzZKonsoli getFromConsole = new WprowadzZKonsoli();
        getFromConsole.wprowadzInt();
    }
    
    private static void zadanie2(){
        AioobeTest aioobeTest = new AioobeTest();
        aioobeTest.test();
    }
    
    private static void zadanie3(){
        ExceptionThrowTest ett = new ExceptionThrowTest();
        ett.test();
    }
    
    private static void zadanie4(){
        
    }
    
    private static void zadanie5(){
        
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
