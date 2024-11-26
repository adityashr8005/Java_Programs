package Testing;

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner newObj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = newObj.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
