package Practice_Sheet_Pattern;

public class ques22 {
    public static void main(String[] args) {
        pattern22(5);
    }
    static void pattern22(int n){
        int i = n;
        int k = n;
        while(i>=1){
            int space = k - 1;
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
            int j = i;
            while (j>=1){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i--;
            k++;
        }
    }
}
