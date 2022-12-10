package Task5;

public class Calculator {

    static public double add(double num1, double num2){
        return num1+num2;
    }
    static public double sub(double num1, double num2){
        return num1-num2;
    }
    static public double mul(double num1, double num2){
        return num1*num2;
    }
    static public double div(double num1, double num2){
        if(num2==0){
            throw new ArithmeticException("Division by zero!");

        }
        return num1/num2;
    }
}
