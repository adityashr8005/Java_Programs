package Searching;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int[] brr = {2,4,6,8};
        int[] crr = new int[arr.length + brr.length];
        int i;
        for (i=0 ; i<arr.length ; i++){
            crr[i] = arr[i];
        }

        for (int j=0 ; j<brr.length ; j++){
            crr[i++] = brr[j];
        }

        System.out.print("After Merging: ");
        for (int num:crr){
            System.out.print(num+" ");
        }

    }
}
