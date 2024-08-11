package Practice_Sheet_Pattern;

public class NumberPattern {
    public static void main(String[] args) {
        pattern23(5);
        System.out.println();
        pattern24(5);
        System.out.println();
        pattern25(5);
        System.out.println();
        pattern26(5);
        System.out.println();
        pattern27(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern29(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern31(5);
        System.out.println();
        pattern32(5);
    }
    static void pattern23(int n){
        int i = 1;
        while (i <= n) {
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            while (j<=2*i - 1){
                System.out.print(1+" ");
                j++;
            }
            i++;
            System.out.println();

        }
    }
    static void pattern24(int n){
        int i = 1;
        while (i <= n) {
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            while (j<=2*i - 1){
                System.out.print(i+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern25(int n){
        int i = 1;
        int a = 1;
        while (i <= n) {
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("   ");
                s++;
            }
            int j = 1;
            while(j<=2*i -1){
                if(a<10){
                    System.out.print(a+"  ");
                }else{
                    System.out.print(a+" ");
                }
                a++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern26(int n){
        int i = 1;
        while(i<=n){
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            while (j<=2*i -1){
                System.out.print(j+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }static void pattern27(int n){
        int i = 1;
        while (i<=n){
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            int a = 0;
            while(j<=2*i - 1){
                if (j<=i){
                    a++;
                }else{
                    a--;
                }
                System.out.print(a+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern28(int n){
        int i = 1;
        int a = 0;
        while (i<=n){
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            while (j<=2*i - 1){
                if (j<=i){
                    a++;
                }else{
                    a--;
                }
                System.out.print(a+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern29(int n){
        int i = 1;
        while (i<=n){
            int space = n - i;
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int j = 1;
            while (j<=2*i - 1){
                if (j==1 || j == 2*i -1){
                    System.out.print(i+" ");
                }else{
                    System.out.print(0+" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern30(int n){
        int i = n;
        while (i>=1){
            int j = n;
            while(j>=1){
                System.out.print(j+" ");
                j--;
            }
            i--;
            System.out.println();
        }
    }

    static void pattern31(int n){
        int i = 1;
        while (i<=n){
            int j = n;
            while(j>=1){
                if (j == i){
                    System.out.print("* ");
                }else{
                    System.out.print(j+" ");
                }
                j--;
            }
            i++;
            System.out.println();
        }
    }
    static void pattern32(int n){
        int i = 1;
        int a = 0;
        while(i<= 2*n-1){
            int j = 1;
            if (i<=n){
                a++;
            }else{
                a--;
            }
            while (j<= 2*a - 1){
                if (j%2==0){
                    System.out.print("* ");
                }else{
                    System.out.print(a+" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
