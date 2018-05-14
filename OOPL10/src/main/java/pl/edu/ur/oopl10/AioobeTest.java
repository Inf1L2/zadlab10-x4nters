package pl.edu.ur.oopl10;


public class AioobeTest {
    public void test(){
        int[] intTable = new int[10];
        for(int i = 0; i<10; i++){
            intTable[i] = 1;
        }
        
        System.out.println("Zawartosc tablicy int:");
        
        try{
            for(int i=0; i<100; i++){
                System.out.print(intTable[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n\n! -> Przechwycono wyjatek ArrayIndexOutOfBoundsException\n\n");
        }
    }
}
