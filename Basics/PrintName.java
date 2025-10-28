//Accept a number from user and print your name that many time
import java.util.Scanner;
public class PrintName {
    public static void main(String[] args) {
        System.out.println("Enter a number to print your name that many times");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int increment=0;
        while(increment<number){
            System.out.println("Khushboo Gupta");
            increment++;
        }
        sc.close();
    }
    
}
