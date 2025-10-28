import java.util.Scanner;

public class ToCountOccurenceOfDigit {
public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    System.out.println("Enter digit whose occurence you want to count in"+number);
    int digit=sc.nextInt();
    int occurence=0;
    while(number!=0){
        int r=number%10;
        if(r==digit){
            occurence++;
        }
        number=number/10;
    }
    System.out.println("The number "+digit+" is re-occoured "+occurence+" times");





    sc.close();
}
    
}
