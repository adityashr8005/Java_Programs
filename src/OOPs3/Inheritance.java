package OOPs3;

class xyz{
    void sun(){
        System.out.println("xyz called");
    }
}

class abc { // abc inherit properties of xyz
    void fun(){
        System.out.println("abc called.");
    }
}
public class Inheritance extends abc{ //abc is parent class and test4 is child class.
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.fun();
    }
}
