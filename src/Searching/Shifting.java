package Searching;

// Q. 11 22 33 44 55
//Ans:-
//22 33 44 55 11
//55 11 22 33 44
//44 55 11 22 33

import java.util.Arrays;

public class Shifting {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        System.out.println("Given array elements:"+Arrays.toString(arr));
        //22 33 44 55 11
        int t1 = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=t1;
        System.out.print("\nShifting1:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        //Sorting to rearrange the elements.(Initial element was in ascending order)
        Arrays.sort(arr);

        //55 11 22 33 44
        int t2=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=t2;
        System.out.print("\nShifting2:");
        for (int num:arr){
            System.out.print(num+" ");
        }

        //Sorting to rearrange the elements.(Initial element was in ascending order)
        Arrays.sort(arr);

        //44 55 11 22 33
        int t3a=arr[arr.length-1];
        int t3b=arr[arr.length-2];
        for (int i=arr.length-1;i>1;i--){
            arr[i]=arr[i-2];
        }
        arr[0]=t3b;
        arr[1]=t3a;
        System.out.print("\nShifting3:");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

