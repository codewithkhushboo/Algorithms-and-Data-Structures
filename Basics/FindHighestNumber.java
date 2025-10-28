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
        
        
        
        /*System.out.print("Enter the first number (num1): ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number (num2): ");
        int num2 = sc.nextInt();
        
        // Store the highest number in a new variable called 'highest'
        int highest = Math.max(num1, num2);
        
        System.out.println("\nThe highest number is: " + highest);
        
        */
    }
}

        
    
