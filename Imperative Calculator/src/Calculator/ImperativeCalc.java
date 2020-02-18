package calculator;

import java.util.Scanner;

/**
 *
 * @author Apple Mejos
 */
public class ImperativeCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator");
        System.out.println("Please choice on what operation to do\n1.Addition\n"
                + "2.Subtraction\n3.Multiplication\n4.Division\n0.Exit\nEnter here: ");
        int ch;
        while ((ch = sc.nextInt()) != 0) {
            if (ch == 1) {
                System.out.println("You choose Addition");
                System.out.println("Enter the first number: ");
                int fadd = sc.nextInt();
                System.out.println("Enter the second number: ");
                int sadd = sc.nextInt();
                int sol = fadd + sadd;
                System.out.println("The result is: " + sol);
                System.out.println("****************************");
            }
            if (ch == 2) {
                System.out.println("You choose Subtraction");
                System.out.println("Enter the first number: ");
                int fn = sc.nextInt();
                System.out.println("Enter the second number: ");
                int sn = sc.nextInt();
                int sol = fn - sn;
                System.out.println("The result is: " + sol);
                System.out.println("****************************");
            }

            if (ch == 3) {
                System.out.println("You choose Multiplication");
                System.out.println("Enter the first number: ");
                int fn = sc.nextInt();
                System.out.println("Enter the second number: ");
                int sn = sc.nextInt();
                int sol = fn * sn;
                System.out.println("The result is: " + sol);
                System.out.println("****************************");
            }

            if (ch == 4) {
                System.out.println("You choose divition");
                System.out.println("Enter the first number: ");
                int fn = sc.nextInt();
                System.out.println("Enter the second number: ");
                int sn = sc.nextInt();
                int sol = fn - sn;
                System.out.println("The result is: " + sol);
                System.out.println("****************************");
            }
            if(ch > 4){
                System.out.println("Input Unidentified please choice on the menu"
                        + "\n*****************************************");
            }
            System.out.println("Please choice on what operation to do\n1.Addition\n"
                    + "2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter here: ");

        }
        System.out.println("Bye! Bye!");
        System.exit(0);
    }
}
