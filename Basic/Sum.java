//first code of the java basic.

// public class Main{
//     public static void main(String[] args){
//         System.out.println("Hello world!");
//     }
// }


//simple code to take input from the user

// import java.util.*;

// public class Input{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("please enter some input:");
//         int rollno = input.nextInt();
//         System.out.println("Your roll number is" + rollno); 
//     }
// }


//code for adding the two numbers

package Basic;
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum = " + sum);
        input.close();
    }
}