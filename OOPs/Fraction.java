package OOPs;
class Fractions{
    int num;
    int deno;
    Fractions(int num, int deno){
        this.num = num;;
        this.deno = deno;
    }
    void print(){
        System.out.println(num + "/" + deno);
    }
    void add(Fractions f){
        num = num * f.deno + f.num * deno;
        deno = deno * f.deno;
    }
    void multiply(Fractions f){
        num = num * f.num;
        deno = deno * f.deno;
    }
}

public class Fraction {
    public static void main(String[] args) {
        Fractions f1 = new Fractions(3, 10);
        // f1.print();
        Fractions f2 = new Fractions(2, 5);
        // f2.print();
        // f1.add(f2);
        // f1.print();
        f1.multiply(f2);
        f1.print();
    }
}
