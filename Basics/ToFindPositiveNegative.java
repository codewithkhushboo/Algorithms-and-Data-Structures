import java.util.Scanner;

public class ToFindPositiveNegative {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();
        String state=(number>0)?"positive":"negative";
        System.out.println(number+" is "+state);
        sc.close();
    }
    
}
