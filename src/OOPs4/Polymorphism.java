package OOPs4;

//Overriding...

class abc{
    void fun(){
        System.out.println("Hello");
    }
}
public class Polymorphism extends abc{

        void fun(){
            super.fun();
            System.out.println("Hi");
        }
    public static void main(String[] args) {

        Polymorphism obj = new Polymorphism();
        obj.fun();
        //It will access child class fun because it overrides the parent class.
        //So,to access parent class function we use super key word.
        //Super keyword is used to access the super class.
    }
}
