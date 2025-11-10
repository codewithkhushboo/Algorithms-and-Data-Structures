//      1
//     222
//    33333
 
public class OooTttThthth {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int space=1;space<=3-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int j=2;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
