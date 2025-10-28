import java.util.Scanner;
public class Sumof3digitwithoutloop {
    public static void main(String[] args) {
        System.out.println("Enter a 3 digit number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        if(number>99 && number<1000){
            int number1=number%10;
            number=number/10;
            int number2=number%10;
            number=number/10;
            int number3=number%10;
            number=number/10;
            System.out.println("Sum of "+original+" is "+(number1+number2+number3));
        }
        else{
            System.err.println("It is not a 3 digit number");
        }
        sc.close();
    }
    
}
