import java.util.Scanner;

public class SommaArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quanti numeri saranno inseriti: ");
          int lunghezzaArray = scanner.nextInt();
          
          int[] array = new int [lunghezzaArray];   //capire meglio come usarlo
         
          System.out.println("Inserisci " + lunghezzaArray + " numeri separati da spazio" );
     
          System.out.println("Inserisce i tuoi numeri: ");
         
          for ( int i = 0; i < lunghezzaArray; i++){     //popolameto array
          array[i]= scanner.nextInt();
         }
             
          int sommaArray = calcolaSommaArray(array);   
          System.out.println("La somma del tuo Array è: " +sommaArray);
          scanner.close();       
    }

    private static int calcolaSommaArray(int[] array) {
        int somma = 0;

        for (int elemento : array) {
            somma += elemento;
        }
        return somma;
    
    }
    }
