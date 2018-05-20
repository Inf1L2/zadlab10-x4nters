package pl.edu.ur.oopl10;
import java.util.Scanner;
import java.util.Random;

public class RandomDivide {
    private int liczbaA;
    private int liczbaB;
    private int wynik;
    private int ExceptionCounter = 0;
    private int SuccessCounter = 0;

    

    public int getLiczbaA() {
        return liczbaA;
    }

    public int getLiczbaB() {
        return liczbaB;
    }

    public int getExceptionCounter() {
        return ExceptionCounter;
    }

    public int getWynik() {
        return wynik;
    }

    public int getSuccessCounter() {
        return SuccessCounter;
    }
    
    public void setLiczbaA(int liczbaA) {
        this.liczbaA = liczbaA;
    }

    public void setLiczbaB(int liczbaB) {
        this.liczbaB = liczbaB;
    }

    public void setExceptionCounter(int ExceptionCounter) {
        this.ExceptionCounter = ExceptionCounter;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public void setSuccessCounter(int SuccessCounter) {
        this.SuccessCounter = SuccessCounter;
    }

    public RandomDivide() {
        System.out.println("Uruchamianie dzielenia losowego...");
        randDiv();
        System.out.println("! Powrot do menu...");
    }
    
    private void randDiv() {
        Random random = new Random();
        
        while(ExceptionCounter < 3){
            liczbaA = random.nextInt(20)-10;
            liczbaB = random.nextInt(20)-10;
            
            try{
                System.out.println("Proba dzielenia wylosowanych liczb...");
                wynik = liczbaA / liczbaB;
                SuccessCounter++;
                System.out.println("Dzielenie zakonczone prawidlowo -> " + liczbaA + " / " + liczbaB + " = " + wynik);
            }
            catch(ArithmeticException e){
                System.out.println("!! Wystapil wyjatek ArithmeticException (dzielenie przez 0)");
                ExceptionCounter++;
                System.out.println("Ilosc wystapien ArithmeticException: " + ExceptionCounter);
            }
        }
        
        System.out.println("ArithmeticException wystapil 3 razy. Program konczy dzialanie");
        System.out.println("Poprawnie wykonanych operacji: " + SuccessCounter);
    }
}
