package Patterns_Question;

public class ques30 {
    public static void main(String[] args) {
        pattern30(5);
    }
    static void pattern30 (int n){
        for(int i=1;i<=n;i++){
            int space = n - i;
            for (int s = 1; s <=space;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
