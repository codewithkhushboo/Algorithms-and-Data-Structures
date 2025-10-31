/*
 * 1
 * 23
 * 456
 * 78910
 * 1112131415
 */
public class Floydstraingle {
    public static void main(String[] args) {
        int number=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
