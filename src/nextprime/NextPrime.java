/*
 * Next Prime Number - Have the program find prime numbers until the 
 * user chooses to stop asking for the next one.
 */
package nextprime;

import java.util.Scanner;

/**
 *
 * @author Dan Bennett
 */
public class NextPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String yesno = "";
        Scanner input = new Scanner(System.in);
                
        for(int i=2; yesno.length() == 0; i++){
            if(isPrime(i)){
                System.out.println(i);
                System.out.println("Press Enter to view next Prime Number, "
                        + "or type any other letters to exit.");
                yesno = input.nextLine();
            }            
        }            
    }
    
    private static boolean isPrime(int x) {
        Boolean prime = true;
        
        for(int j=2; j <= x/2; j++){
            if(x%j == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
