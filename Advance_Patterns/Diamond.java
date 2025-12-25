package Advance_Patterns;

import java.util.Scanner;

public class Diamond {
    public static void diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int num = in.nextInt();
        diamond(num);
        in.close();
    }
}
