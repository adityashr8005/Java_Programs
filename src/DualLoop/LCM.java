package DualLoop;

import java.util.Scanner;

//LCM of two number.
public class LCM {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number");
        int num1= in.nextInt();
        int num2= in.nextInt();
        //LCM using iterative method...
        for (int i=num1 ; i<=num1*num2 ; i++){
            if (i%num1==0 && i%num2==0){
                System.out.println("LCM using iterative method");
                System.out.println(i + " is a LCM.");
                break;
            }
        }

        //LCM using HCF
        int mult=num1*num2;//pre multiplication cause below num1/num2 will be changed. Also, can be done using function.

        while (num1!=num2){
            if (num1>num2){
                num1 -= num2;
            }else {
                num2 -= num1;
            }
        }
        System.out.println("\nLCM using HCF");
        System.out.println(mult/num2 + " is a LCM");

    }
}
