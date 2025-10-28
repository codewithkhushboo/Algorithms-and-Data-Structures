import java.util.Scanner;

public class SumWithLoop {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter any number whose sum you want to find");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int original=number;
        while(number!=0){
            int r=number%10;
            sum=sum+r;
            number=number/10;
        }
        System.out.println("Sum of "+original+" is "+sum);
        
       sc.close(); 
    }
}
