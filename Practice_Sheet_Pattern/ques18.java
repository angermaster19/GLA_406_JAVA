package Practice_Sheet_Pattern;

public class ques18 {
    public static void main(String[] args) {
        pattern18(7);
        pattern18(9);
    }
    static void pattern18(int n){
        int a = (n+1)/2;
        int b = (n-1)/2;

        for (int i = 1; i <=a ; i++) {
            for (int k = 1; k<=a-i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i -1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = b; i >=1 ; i--) {
            for (int k = 1; k<=a-i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i -1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        int a = (n+1)/2;
        int b = (n-1)/2;

        for (int i = 1; i <=a; i++) {
            for (int k=1; k<=a-i; k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i -1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = b; i >=1; i--) {
            for (int k=1; k<=a-i; k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i -1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
