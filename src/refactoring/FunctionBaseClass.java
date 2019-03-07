package refactoring;

 class FunctionBaseClass<T>  implements Function {
    T a;
    T b;
    public T getResult() {
        // new Exception();
        return null;
    }
    public void setAB(Object a, Object b) {
        this.a =(T) a;
        this.b = (T) b;
    }
}
