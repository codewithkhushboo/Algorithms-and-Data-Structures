public class AlphabetPyramidTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int spaces=1;spaces<=3-i;spaces++)
            {
                System.out.print(" ");            
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j=i-1;j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }

}
