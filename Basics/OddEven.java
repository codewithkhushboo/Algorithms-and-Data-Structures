import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Nuumber "+number+" is even");
        
        }
        else{
            System.out.println("Number "+number+" is odd");
        }
        sc.close(); 
    }
    
}
