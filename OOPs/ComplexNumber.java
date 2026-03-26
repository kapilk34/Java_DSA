package OOPs;
class ComplexNumbers{
    int x;
    int y;
    ComplexNumbers(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y > 0) System.out.println(x+"+" + y + "i");
        else {
            System.out.println(x+"-" + (-y) + "i");
        }
    }
    void add(ComplexNumbers z2){
        z2.x = 8;
    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumbers z1 = new ComplexNumbers(2, 6);
        ComplexNumbers z2 = new ComplexNumbers(2, -9);
        z1.print();
        z2.print();
        z1.add(z2);
        z2.print();
    }
}
