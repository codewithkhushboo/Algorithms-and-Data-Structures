public class PascalTraingle {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int spaces=1;spaces<=5-i;spaces++){
                System.out.print(" ");
            }
            int number=1;
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/j;
            }
            System.out.println();
        }
    }

}
