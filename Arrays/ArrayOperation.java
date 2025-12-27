package Arrays;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        int marks[] = new int[20];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        sc.close();

        //updation
        marks[1] = marks[1]+10;
        System.out.println("che : "+marks[1]);
    }
}
