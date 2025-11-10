public class OneZeroOne {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int space = i; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
