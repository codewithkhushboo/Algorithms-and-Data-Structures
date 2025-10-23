
//Accept 2 number from user and find quotient

import java.util.Scanner;

public class FindQuotient {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        float dividend=sc.nextFloat();
        System.out.println("Enter the divisor");
        float divisor=sc.nextFloat();
        float quotient;
        quotient=dividend/divisor;
        System.out.println("Quotient of "+dividend+" and " +divisor+" is "+quotient);
        sc.close();
        
    }
    
}
