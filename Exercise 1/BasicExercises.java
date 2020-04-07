

public class BasicExercises {

    public static void main (String[] args){
        System.out.println("Hello World!");  
        Values values = new Values();
        sum(values.x, values.y);
    }

    static class Values {
        int x = 5;
        int y = 10;
    }
    public static void sum(int x, int y) {
        Integer sum = x+y; 
        System.out.println("Sum is " + sum);
    }

}
 