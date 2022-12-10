package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        double num1;
        double num2;
        String oper;
        double result;
        System.out.println("num1: ");
        num1 = sc.nextDouble();
        System.out.println("num2: ");
        num2 = sc.nextDouble();
        System.out.println("oper: ");
        oper = sc1.nextLine();
        switch (oper){
            case "add" : {
                System.out.println(Calculator.add(num1,num2));
                break;
            }
            case "sub" : {
                System.out.println(Calculator.sub(num1,num2));
                break;
            }
            case "mul" : {
                System.out.println(Calculator.mul(num1,num2));
                break;
            }
            case "div" : {
                System.out.println(Calculator.div(num1,num2));
                break;
            }
            default:
                System.out.println("wrong operation type");
        }


    }


}
