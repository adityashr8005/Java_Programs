package OOPS;

import java.util.Scanner;
//util is a packages. Scanner is a class.
//import java.util.*  --> is access all classes(Scanner,Arrays to LinkedList,Hashmap).
public class Input {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);//creating object of class Scanner.
        System.out.print("Enter a number:");
        int num = newObj.nextInt(); //nextInt(),nextFloat()...are itself a function.
        System.out.println(num);
    }
}
