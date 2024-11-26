package OOPs2;

//Constructor : It is a function, whose name is same as class name.
//              It doesn't have any return_type not even void.
//              They are called automatically when ever we create an object.
//              They can be public and private.(C++ doesn't have private constructor.)
public class Constructor {
    //Constructor are used for initialization.
    //There are 2 types of constructor in java.
    //a)Default     b)Parameterised

    Constructor(){ //Default constructor.
        System.out.println("Default constructor called automatically.");
    }

    Constructor(int a){ //Parameterised constructor.
        System.out.println("\nParameterised constructor called.");
        System.out.println("a = "+a);
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor(); //Here fun->Constructor called automatically after obj. creation.
//                         new Constructor(); //This also call the constructor.
        Constructor obj2 = new Constructor(77); //Parameterised constructor called.
    }
}

//NOTE : when we don't create a constructor java itself create it.
