package refactoring;

class IntegerFunction1  extends  FunctionBaseClass implements Function  {
    @Override
    public Integer getResult( ) {
        return  (Integer) a-(Integer) b;
    }
}
