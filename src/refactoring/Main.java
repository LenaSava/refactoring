package refactoring;
import static refactoring.Calculate.function;

public class Main {

    public static void main(String[] args) throws Exception {

        String result = "result is :";
        System.out.println(result + function(6, 4, 0));
        System.out.println(result + function(6, 4, 1));
        System.out.println(result + function(6, 4, 2));
        System.out.println(result + function(6, 4, 3));
        System.out.println(result + function("6", "4", 0));
    }


}