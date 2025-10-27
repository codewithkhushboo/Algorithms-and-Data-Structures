import java.util.Scanner;
public class PrintPrevious5Numbers {
    public static void main(String[] args) {
        System.out.println("Enter a number whose 5 previous number you want to print");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        System.out.print("Previous 5 numbers are:");
        while(count<=5){
            number--;
            System.out.print(number+" ");
            count++;
        }
        System.out.println();
        sc.close();
    }
    
}
