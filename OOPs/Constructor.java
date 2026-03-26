package OOPs;

public class Constructor {
    public static class Car {
        int seats;
        String name;
        double length;
        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length+" ");
        }
    }

    public static void main(String[] args){
        Car c1 = new Car(3, "Kia Sonet", 3.99);
        c1.print();
        Car c2 = new Car(6, "Honda", 4.65);
        c2.print();
    }
}
