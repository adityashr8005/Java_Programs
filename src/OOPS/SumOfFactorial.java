package OOPS;

//1!+2!+3!+4!+5!
public class SumOfFactorial {
    public static void main(String[] args) {
        int num=5;
        int sum=0;
        SumOfFactorial obj=new SumOfFactorial();
        for (int i=1;i<=num;i++) {
            int ans = obj.fun(i); //calling fun by passing 'i' and storing return value in ans.
            System.out.println("Factorial of "+i+" = "+ans);
            sum=sum+ans;
            int result=i/ans;
            System.out.println(i+"/"+i+"!="+result);//output of:1/1! ,2/2! ,3/3!....
        }
        System.out.println("Sum of all factorials = "+sum);//output of:1!+2!+3!+4!+5!
    }
    int fun(int x){
        int f=1;
        for (int i=x;i>0;i--){
            f=i*f;
        }
        return f;
    }
}
