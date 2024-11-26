package Array;

import java.util.Arrays;
import java.util.Scanner;

//DSA is a technique ,i.e used to manage elements in such a way we can access(insert, delete, update, search,...) it efficiently.
//Array is a collection of similar kind of data element.
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr={11,33,55,77,99};  //[]->subscript.

        int size;
        System.out.print("Enter the size:");
        size= sc.nextInt();
        String[] array = new String[size];

        System.out.println("Enter the elements:");
//        for(int i=0; i<array.length; i++); //if we put semicolon it will move to index array.length -> look Test1.
                                             //It will run 5 times and i become 5 than array[i]==array[5].
                                             //so, it will only take one output. Index become OutOfBound.
        for(int i=0; i<array.length; i++)
        {
            array[i]=sc.next();
        }

        //Output 1
        System.out.println("Output1 : Elements");
        System.out.println(Arrays.toString(array));

        //Output 2
        System.out.println("Output2 : Elements");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
