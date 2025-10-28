import java.util.Scanner;
public class MaxNumberin3variables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        int maximum=(number1>number2)?(number1>number3?number1:number3):(number2>number3?number2:number3);
        System.out.println("Out of "+number1+","+number2+" and "+number3+" is "+maximum);
        sc.close();
        
    }
}