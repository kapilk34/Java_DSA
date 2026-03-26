package OOPs;

class ArrayList{ //user defined data structure
    int[] arr;
    int index = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    void add(int ele){
        if(index == arr.length){ // array is full
            int[] arr2 = new int[arr.length*2];
            for(int i = 0; i < arr.length; i++){ //copy paste of original array
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[index++] = ele;
        size++;
    }
    void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(3);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();
        arr.add(40);
        arr.display();
    }
}
