//Accept a number from user and do % 2 and print remainder
import java.util.Scanner;
public class PrintRemainder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double number=sc.nextDouble();
        double remainder=number%2;
        System.out.println("The remainder of " + number + " % 2 is: " + remainder);
        sc.close();
    }
}