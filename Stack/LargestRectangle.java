package Stack;

import java.util.Stack;

public class LargestRectangle {
    public static int LargestRectangleArea(int[] heights){
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        //calculating nse
        st.push(n-1); //index
        nse[n-1] = n;
        for(int i = n - 2; i >= 0; i++){
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if(st.size() == 0){
                nse[i] = n;
            } else{
                nse[i] = st.peek();
                st.push(i);
            }
        }
        //empting Stack
        while (st.size() > 0) st.pop();

        //calculating pse
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i < n-1; i++){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            } 
        }
    }

    public static void main(String[] args) {
        int[] heights = {2,4,6,9,1,8,3};
        LargestRectangleArea(heights);
    }
}
