package Practice_Sheet_Pattern;

public class ques21 {
    public static void main(String[] args) {
        pattern21(5);
        System.out.println();
        pattern22(10);
    }
    static void pattern21(int n){
        for (int i = 1; i <=n ; i++) {
            int space = (2*n - 1) - i;
            for (int k = 1; k<=space;k++){
                if (k<=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        int i = 1;
        while (i<=n){
            int space = (2*n - 1) - i;
            int s = 1;
            while (s<=space){
                if(s<=i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                s++;
            }
            int j = 1;
            while (j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
