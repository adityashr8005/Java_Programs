package OOPS;

public class CallByValue {
    public static void main(String[] args) {
        int num=5;
        CallByValue obj=new CallByValue();
        obj.factorial(num); //Function calling simultaneously passing value.
        obj.factor(num);
    }
    void factorial(int x){
        int f=1;
        for (int i=x;i>0;i--){
            f=i*f;
        }
        System.out.println("Factorial of "+x+"!"+" is "+f);
    }
    void factor(int num){
        System.out.print("Factors of "+num+" = ");
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
    }
}
