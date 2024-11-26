package OOPS;

public class OOPS1 {
    public static void main(String[] args) {   //main is also a function.
        fun(); //calling static function

        OOPS1 obj = new OOPS1(); //Here, we create object of class OOPS1 to call function.
        obj.function(); //calling function using object.
        obj.function(); //we can call function as many as time as per requirement.
    }
    static void fun(){  //static keyword is use because main is also static where we call this function.
                        //only static function have access to other static function
        System.out.println("Function call using static from static main function.");
    }
    void function(){
        System.out.println("Function call without using static.");
    }
}
