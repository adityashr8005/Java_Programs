package OOPs3;

public class Overriding {

    void fun(){
        System.out.println("hlo");
    }
    void fun(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {

        Overriding obj = new Overriding();
        obj.fun();
        obj.fun(10);
    }
}
