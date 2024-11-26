package OOPS;

public class InstanceVariable {
    int a;    //instance variable matlab class ka variable.
              //a can be access in main function only if a is static.
              //default value of instance variable is 0.
    public static void main(String[] args) {
        InstanceVariable obj1=new InstanceVariable();
        InstanceVariable obj2=new InstanceVariable();
        obj1.fun();
        obj2.fun();
        obj1.show();
        obj2.show();
    }
    void fun(){
        a=10;
    }
    void show(){
        System.out.println("a="+a);
    }
}
