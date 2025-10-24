import java.util.Scanner;
public class FindHighestNumber {
    public static void main(String[] args) {
        int number1, number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        number1=sc.nextInt();
        number2=sc.nextInt();
        int number3=(number1>number2)?number1:number2;
        System.out.println("Highest number between "+number1+" and "+number2+" is "+number3);
        sc.close();

        
    }
    
}
