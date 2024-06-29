package TugasPraktikum1;

public class Division implements Operation {
    public double calculateResult(double left, double right) throws ArithmeticException{
        if(right == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return left / right;
    }
}
