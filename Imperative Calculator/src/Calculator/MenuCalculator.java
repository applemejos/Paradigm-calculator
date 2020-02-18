package Calculator;

import java.util.Scanner;

public class MenuCalculator {

    private double num1;
    private double num2;
    private Scanner sc;
    public String option;
    public double result;

    public MenuCalculator() {
        sc = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println(" A. Addition\n B. Subtraction\n C. Multiplication\n D. Division\n E. Modulo");
        System.out.println("OPTION:");
        option = sc.next().toLowerCase().toUpperCase();
        System.out.println("Enter First Number");
        num1 = sc.nextDouble();
        System.out.println("Enter Second Number");
        num2 = sc.nextDouble();
    }

    public String set_option() {
        option = sc.next();
        return option;
    }

    public double getX() {
        return this.num1;
    }

    public double getY() {
        return this.num2;
    }
}
