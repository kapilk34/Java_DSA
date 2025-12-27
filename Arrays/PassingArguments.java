package Arrays;

public class PassingArguments {
    //update works on pass by refence
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {98,96,89};
        update(marks);

        //printing our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
