package DualLoop;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number");
        int num1= in.nextInt();
        int num2= in.nextInt();

        int i,max=0;
        //iterative method...
        for (i=1 ; i<=num1 ; i++){
            if (num1%i==0 && num2%i==0){
                if(i>max){
                    max=i;
                }
            }
        }
        System.out.println("HCF by iteration method");
        System.out.println(max+" is a HCF.");


        //subtraction method
        while (num1!=num2){
            if (num1>num2){
                num1 -= num2;
            }else {
                num2 -= num1;
            }
        }
        System.out.println("\nHCF by subtraction method");
        System.out.println(num1+" is a HCF.");
    }
}
