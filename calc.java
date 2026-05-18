
import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a operand1: ");
        double operand1 = sc.nextDouble();
        System.out.println("Enter a operator: ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter a operand2: ");
        double operand2 = sc.nextDouble();
        double solution = 0;

        if (operator == '+') {
            solution = (operand1 + operand2);

        } else if (operator == '-') {
            solution = (operand1 - operand2);

        } else if (operator == '*') {
            solution = (operand1 * operand2);

        } else if (operator == '/') {
            solution = (operand1 / operand2);

        } else  if(operator=='%'){
            solution = (operand1 % operand2);

        } 
         else {
            System.out.println("invalid");



         }
System.out.println(solution);
    }

}
