package ConstructorChaning;

//a.final variable:constant
//b.final function

final class abc{ //now it can't be inherited.
    final void fun(){ //this function can't be overridden.
        System.out.println("fun called");
    }

}
public class Final {
    public static void main(String[] args) {
        final int a=10;//final value can't be changed during execution of program.


    }
}
