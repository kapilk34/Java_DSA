package OOPs;

public class ConstructorUse {
    public static class StudentData{
        String name;
        int roll_No;
        int size;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }

    public static void main(String[] args){
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 99;
        s1.marks[2] = 79;
        s1.marks[3] = 69;
    }
}
