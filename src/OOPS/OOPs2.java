package OOPS;

public class OOPs2 {
    public static void main(String[] args) {
        OOPs2 obj = new OOPs2();
        obj.fun(); //function calling or control transfer.
    }
    void fun(){
        System.out.println("fun called.");
        sun(); //We can only call other function inside another function.
                //We can't crete function inside other function.
    }
    void sun(){
        System.out.println("sun called.");
    }
}
