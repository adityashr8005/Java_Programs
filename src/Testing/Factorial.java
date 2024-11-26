package Testing;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = newObj.nextInt();
        int f=1;     //Lesson:While multiplying take f as 1 and while sum take f as 0.
        for (int i=num;i>0;i--){
            f=i*f;
        }
        System.out.println("Factorial of "+num+" is "+f);
    }
}
