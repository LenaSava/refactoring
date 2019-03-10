package refactoring;

import java.util.HashMap;

public class Calculate {
    private static HashMap<String, FunctionBase> map;
    static {
        map = new HashMap< >();
        FunctionBase string  = new StringFunction();
        FunctionBase funcPlus = new IntegerPlus();
        FunctionBase funcMinus = new IntegerMinus();
        FunctionBase funcMulti = new IntegerMulti();
        FunctionBase funcDiv = new IntegerDivision();
        map.put("0java.lang.Stringjava.lang.String",  string);
        map.put("0java.lang.Integerjava.lang.Integer", funcPlus);
        map.put("1java.lang.Integerjava.lang.Integer", funcMinus);
        map.put("2java.lang.Integerjava.lang.Integer", funcMulti);
        map.put("3java.lang.Integerjava.lang.Integer", funcDiv);
    }

    static  <T> Object function(T a, T b, int action) throws Exception {
        FunctionBase base;
        try {
            String tmp= action+ getName(a)+  getName(b);
            base= map.get(tmp);
            base.setAB(a,b);
        } catch (NullPointerException e) {
            throw new  Exception();
        }
        return base.getResult();
    }
    private static  <T>String getName(T s) {
        return  s.getClass().getName();
    }
}
