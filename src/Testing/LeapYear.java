package Testing;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //Year divisible by 4 is leap year.
        //If same year is divisible by 100 , it must be divisible by 400 too.
        //if divisible by 4 and 100 but not with 400, it is not leap year.
        //if only divisible by 4 not by 100, it is leap year.
        Scanner input = new Scanner(System.in);
        System.out.print("Input year:");
        int year = input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's leap year.");
                }
                else{
                    System.out.println("It's not leap year.");
                }
            }
            else{
                System.out.println("It's leap year.");
            }
        }
        else{
            System.out.println("It's not leap year.");
        }
    }
}
