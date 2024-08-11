package Practice_Sheet_Pattern;

public class ques1 {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
    }

    static void pattern1 (int n){
        for(int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2 (int n){
        for(int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3 (int n){
        for(int row = n; row >=1 ; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        for(int row = 1; row <=n ; row++) {
            int space = n - row;

            for (int s = 1; s <= space ; s ++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        for(int row = n; row >=1 ; row--) {
            int space = n - row;

            for (int s = 1; s <= space ; s ++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6 (int n){
        int r = 0;
        for (int row = n; row >=1 ; row--) {
            int space = 2*r;
            for (int s = 1; s<= space;s++){
                System.out.print("  ");
            }

            for (int col = row; col>=1 ; col--) {
                System.out.print("* ");
            }
            r++;
            System.out.println();
        }
    }

    static void pattern7 (int n){
        for(int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    static void pattern8 (int n){
        for(int row = 0; row <n ; row++) {
            for (int col = 0; col <n; col++) {
                if (col == row || col == n - row - 1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9 (int n){
        int row = 1;
        int r = 1;
        while (row <= 2* n){
            int space = n - r;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int col = 1;
            while (col <=row){
                System.out.print("* ");
                col++;
            }

            r++;
            row+=2;
            System.out.println();
        }
    }
    static void pattern10 (int n){
        int row = 2*n - 1;
        int r = 5;
        while (row >=1){
            int space = n - r;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int col = 1;
            while (col <=row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            r--;
            row-=2;
        }
    }
    static void pattern11 (int n){
        int row = 1;
        int r = 1;
        while (row <= 2* n){
            int space = n - r;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int col = 1;
            while (col <=row){
                if (col %2==0){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
                col++;
            }
            row+=2;
            r++;
            System.out.println();
        }
    }
    static void pattern12 (int n){
        int row = 1;
        int r = 1;
        while (row <= 2* n){
            int space = n - r;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int col = 1;
            while (col <=row){
                if (col %2==0){
                    System.out.print("! ");
                }else {
                    System.out.print("* ");
                }
                col++;
            }
            row+=2;
            r++;
            System.out.println();
        }
    }
    static void pattern13 (int n){
        int row = 1;
        while(row < 2* n){
            int col = row > n ? 2*n - row : row;
            int c = 1;
            while (c < col){
                System.out.print("* ");
                c++;
            }
            row++;
            System.out.println();
        }
    }
    static void pattern14 (int n){
        int row = 1;
        while (row < 2* n){
            int col = row > n ? 2*n - row : row;
            int space = n - col;
            int s = 1;
            while (s <= space){
                System.out.print("  ");
                s++;
            }
            int c = 1;
            while (c <= col){
                System.out.print("* ");
                c++;
            }
            row++;
            System.out.println();
        }
    }

}
