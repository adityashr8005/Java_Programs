package Testing;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = newObj.nextInt();
        System.out.print("Factors of "+num+" = ");
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("The total number of factors = "+count);
    }
}
