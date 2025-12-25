package Advance_Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void Hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow rectangle-stars
            for( int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines want to print : ");
        int num = in.nextInt();
        Hollow_Rhombus(num);
        in.close();
    }
}
