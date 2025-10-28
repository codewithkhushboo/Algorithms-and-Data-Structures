import java.util.Scanner;
public class CountDigitInNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number whose number of digit you want to count");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=0;
        int temp=number;
        while(number!=0){
            number=number/10;
            digit++;

        }
        System.out.println("The count of number "+temp+" is "+digit);
        sc.close();
    }
    
}
