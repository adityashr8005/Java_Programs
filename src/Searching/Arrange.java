package Searching;


public class Arrange {
    public static void main(String[] args) {
        int[] arr = {9,3,4,6,1,2};
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int oddCount = 0;
        int evenCount = 0;
        for (int i=0 ;i<arr.length ;i++){
            if(arr[i]%2==0){
                even[evenCount] = arr[i];
                evenCount++;
            }
            else{
                odd[oddCount] = arr[i];
                oddCount++;
            }
        }

        System.out.print("Array list:");
        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.print("\n\nEven array list:");
        for(int i=0 ; i<evenCount ; i++){
            System.out.print(even[i]+" ");
        }

        System.out.println();
        System.out.print("Odd array list:");
        for(int i=0 ; i<oddCount ; i++){
            System.out.print(odd[i]+" ");
        }
    }
}
