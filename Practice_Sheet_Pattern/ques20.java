package Practice_Sheet_Pattern;

public class ques20 {
    public static void main(String[] args) {
        pattern20(7);
    }
    static void pattern20(int n){
        int a = (n+1)/2;
        int b = (n-1)/2;

        for (int row = 1; row <=a ; row++) {
            for (int k = 1; k <=a-row ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*row - 1 ; j++) {
                if (j==1 || j == 2*row - 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = b; row >=1 ; row--) {
            for (int k = 1; k <=a-row ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*row - 1 ; j++) {
                if (j==1 || j == 2*row - 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
