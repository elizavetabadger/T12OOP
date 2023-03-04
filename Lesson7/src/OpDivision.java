class OpDivision implements Operation{
    @Override
    public double exec(double valueOne, double valueTwo ) {
        try{
            double p = valueOne / valueTwo;
        }catch(ArithmeticException e){
            System.out.println(e + " арифметичесская ошибка");
        }
        return (valueOne / valueTwo );
    }
}