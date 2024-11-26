package OOPs3;

public class test2 {
    public static void main(String[] args) {

        int a=5 , b=10;
        test2 obj = new test2();
        obj.fun(a,b);

        //this will not swap.
        //In call by value we pass something like a photostat copies
        //so if he makes any changes in copies it will never affect to original value.
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void fun(int a , int b){
        int t = a;
        a = b;
        b = t;
        //this will swap.
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
