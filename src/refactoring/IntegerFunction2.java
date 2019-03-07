package refactoring;

class IntegerFunction2  extends  FunctionBaseClass implements Function  {
    @Override
    public Integer getResult( ) {
        return  (Integer) a*(Integer) b;
    }
}
