import java.util.Scanner;

public class Exercise2 {
    public static void main (String [] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter any string: ");
            char[] text = scan.nextLine().toCharArray();
       
            
            for (int i = text.length-1; i>=0; i--){
                System.out.println(text[i]);
                
            }
            

            scan.close();
    }

}