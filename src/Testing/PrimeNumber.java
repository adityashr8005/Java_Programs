package Testing;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = newObj.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Given number is prime number.");
        }else {
            System.out.println("Given number is composite number.");
        }
    }
}
