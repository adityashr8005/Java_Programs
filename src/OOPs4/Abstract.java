package OOPs4;

//Abstract class is a class which contain define and undefined function.
//The undefined function is known as abstract function.
//void fun(){}defined function.
//void fun();Undefined function.
//abstract void fun();
//And the class which inherits the abstract class , needs to define all its undefined functions.
//NO object can be created of abstract class.It's an incomplete class.It contains undefined function.

abstract class xyz{
    void fun(){

    }
  abstract void sun();
//    undefined function should be defined inside extends class.
}
public class Abstract extends xyz {

    void sun(){
        System.out.println("hello!");
    }
    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.sun();
    }
}
