package OOPS;

class Outsider{
    static void fun(){
        System.out.println("Outsider member function called.");
    }
}
public class ClassOutsideClass {
   static void fun(){
        System.out.println("Main class member function called.");
    }
    public static void main(String[] args) {
        fun();                   //It will call main class function[fun()].(ClassOutsiderClass)
        System.out.println();
        ClassOutsideClass.fun(); //here, we call fun by class to know which class member function being called.
        Outsider.fun();          //It called fun() of Outsider class.
    }
}
