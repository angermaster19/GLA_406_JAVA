//Jai Sri Radhe
package Patterns_Question;

public class ques28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int i = 0; i < 2*n; i++) {
            int col = i > n ? 2*n - i : i;
            int space = n - col;
            for (int s = 1; s <=space;s++){
                System.out.print(" ");
            }

            for (int j = 1; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
