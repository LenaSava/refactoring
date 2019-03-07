package refactoring;
import java.util.HashMap;

public class Main {
    private static HashMap <String, Function> map;
    static {
        map = new HashMap< >();
        Function fs0  = new StringFunction0();
        Function fi0 = new IntegerFunction0();
        Function fi1 = new IntegerFunction1();
        Function fi2 = new IntegerFunction2();
        Function fi3 = new IntegerFunction3();
        map.put("0java.lang.Stringjava.lang.String",  fs0);
        map.put("0java.lang.Integerjava.lang.Integer", fi0);
        map.put("1java.lang.Integerjava.lang.Integer", fi1);
        map.put("2java.lang.Integerjava.lang.Integer", fi2);
        map.put("3java.lang.Integerjava.lang.Integer", fi3);
    }

    public static void main(String[] args) throws Exception {
        String result = "result is :";
        System.out.println(result + function(6, 4, 0));
        System.out.println(result + function(6, 4, 1));
        System.out.println(result + function(6, 4, 2));
        System.out.println(result + function(6, 4, 3));
        System.out.println(result + function("6", "4", 0));
    }

    static  <T> Object function(T a, T b, int action) throws Exception {
        Function f;
        try {
            String tmp= action+ getName(a)+  getName(b);
            f= map.get(tmp);
            f.setAB(a,b);
        } catch (NullPointerException e) {
            throw new  Exception();
        }
        return f.getResult();
    }
    private static  <T>String getName(T s) {
        return  s.getClass().getName();
    }
}