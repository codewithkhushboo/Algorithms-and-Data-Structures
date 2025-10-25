import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number you want to reverse");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        int rev=0;
        while(number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        System.out.println("The reverse of number "+original+" is "+rev);
        sc.close();
    }
}
