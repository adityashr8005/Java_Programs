package OOPs3;

class xyz2{

    public int a;
    private int b;

    void fun(){
        a=10;
        b=20;
    }
    //private b can't be access to other class . So, we create function to acquire data.
    int getB(){
        return b;
    }
}
class mnp extends xyz2{
    private int c;
    void multiply(){
        c=a*getB();
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+getB());
        System.out.println("c="+c);
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        mnp obj = new mnp();
        //without calling fun it will not have any data store so return 0.
        obj.fun();
        obj.multiply();
        obj.show();

        //changing 'a' from 10 to 40 using object.
        obj.a=40;
        obj.multiply();
        obj.show();
    }
}
