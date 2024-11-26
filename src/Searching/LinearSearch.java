package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println();
        System.out.println("Enter the elements:");
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        int target = sc.nextInt();
        boolean check = false;  //It is used as flag.
        int i;
        for (i=0 ; i<arr.length ; i++){
            if (target==arr[i]) {
                check = true;
                System.out.println();
                System.out.println("Target element found at index " + i);
                break;
            }
        }
        if(!check){
            System.out.println("Not found");
        }
    }
}
