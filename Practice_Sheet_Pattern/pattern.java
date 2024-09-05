package part2;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i =0;i<n;i++){
            int cols = 2*n -1;
            //part1
            int c = n;
            for(int j =0;j<cols-1-i;j++){
                int b = n - i;
                System.out.print(c);
                if(c!=b){
                    c--;
                }
            }
            //part2
            for(int k=0;k<=i;k++){
                int a = n - i +k;
                System.out.print(a);
            }
            System.out.println();
        }

        //palat do

        for( int i =n-2;i>=0;i--){
            int cols = 2*n -1;
            //part1
            int c = n;
            for(int j =0;j<cols-1-i;j++){
                int b = n - i;
                System.out.print(c);
                if(c!=b){
                    c--;
                }
            }
            //part2
            for(int k=0;k<=i;k++){
                int a = n - i +k;
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
