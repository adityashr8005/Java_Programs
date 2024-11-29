package Searching;

import java.util.Scanner;

//Array must be sorted.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        //            0  1  2  3  4  5  6
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your target number");
        int target = in.nextInt();
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2; //s+e/2-s
            if (target==arr[mid]){
                System.out.println("Target found at index "+mid);
                break;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if (start>end){
            System.out.println("Target not found.");
        }

    }
}
