package Testing;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = newObj.nextInt();
        int data=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        System.out.println(sum);
        if (data==sum){
            System.out.println("Number is palindrome.");
        }else {
            System.out.println("Number is not palindrome.");
        }
    }
}
