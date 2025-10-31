public class DiamondPattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int spaces=1; spaces<=4-i;spaces++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int spaces=1;spaces<=4-i;spaces++)
            System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
