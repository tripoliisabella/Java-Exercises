import java.util.Scanner;

public class Exercise3 {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a phrase: ");
        String phrase = scan.nextLine();
        String[] splitPhrase = phrase.split(" ");
        
        System.out.println(splitPhrase[splitPhrase.length-1]);
        

        scan.close();
    }
}