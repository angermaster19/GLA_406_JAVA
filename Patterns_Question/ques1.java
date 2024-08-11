package Patterns_Question;

public class ques1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }
//    pattern1
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

//    pattern2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    pattern3
    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    pattern4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//    pattern5
    static void pattern5(int n) {
        for (int i = 1; i < 2*n; i++) {
            int col = i > n ? 2*n - i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

