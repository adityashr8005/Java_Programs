package Array;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={5,3,9,11,7};
        int max=arr[0];
        int min=arr[0];

        System.out.print("Elements without sorting:");
        for (int num:arr){
            System.out.print(num+" ");
        }

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }

        System.out.println();
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);


        int[] array = {5,3,9,11,7};
        Arrays.sort(array);
        System.out.print("\nElements after sorting:");
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Max : "+array[array.length-1]);
        System.out.println("Min : "+array[0]);
    }
}
