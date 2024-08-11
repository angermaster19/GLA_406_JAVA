package Practice_Sheet_Pattern;

public class ques15 {
    public static void main(String[] args) {
        pattern15(5);
        System.out.println();
        pattern16(5);
    }
    static void pattern15(int n){
        int row = 1;
        int r = 0;
        while (row < 2*n) {
            int space = 2*r;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }

            int col = Math.abs(n-row) +1;
            int j = 1;
            while (j <= col){
                System.out.print("* ");
                j++;
            }
            row++;
            if (row <= n){
                r++;
            }else{
                r--;
            }
            System.out.println();

        }
    }
    static void pattern16(int n){
        int row = 1;
        while(row < 2*n){
            int space = Math.abs(n-row);
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int cols = Math.abs(n-row) +1;
            int c = 1;
            while (c <= cols){
                System.out.print("* ");
                c++;
            }

            row++;
            System.out.println();
        }
    }
}
