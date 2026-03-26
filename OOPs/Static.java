package OOPs;
class Cricketer{
    static String country = "Nz";
    int runs;
    String name;
    double avg;
    void print(){
        System.out.println(runs + " " + name + " " + avg + " ");
    }
    static void great(){
        System.out.println("Hello EveryOne!");
    }
}

public class Static {
    public static void main(String[] args){
        Cricketer.great();
        System.out.println(Cricketer.country);
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer(); 
        c1.country = "India"; 
        System.out.println(c2.country);
    }
}
