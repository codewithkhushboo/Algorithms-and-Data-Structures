import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        float dividend=sc.nextFloat();
        System.out.println("Enter the divisor");
        float divisor=sc.nextFloat();
        float remainder;
        remainder=dividend%divisor;
        System.out.println("Remainder of "+dividend+" and " +divisor+" is "+remainder);
        sc.close();
    }
    
}
