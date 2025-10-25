import java.util.Scanner;
public class PrintPreviousNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=1;
        while(count<=number)
        {
            int previousnumber=number-count;
            System.out.print(previousnumber+" ");
            count++;
        }
        sc.close();
    }
    
}
