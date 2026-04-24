package TwoD_Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            //Top row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //Right coloum
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //Bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //Left coloum
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
