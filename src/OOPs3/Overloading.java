package OOPs3;

public class Overloading {

    void fun(){
        System.out.println("hlo");
    }
    void fun(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {

        Overloading obj = new Overloading();
        obj.fun();
        obj.fun(10);
    }
}
