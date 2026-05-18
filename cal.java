import java.util.*;

public class cal {

    public static void main(String[] args) {

        System.out.println("Enter your income:");

        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 400000) {
            tax = 0;
        }
        else if (income <= 800000) {
            tax = income * 0.05;
        }
        else if (income <= 1200000) {
            tax = income * 0.10;
        }
        else if (income <= 1600000) {
            tax = income * 0.15;
        }
        else if (income <= 2000000) {
            tax = income * 0.20;
        }
        else {
            tax = income * 0.30;
        }

        System.out.println("Tax = " + tax);

        sc.close();
    }
}