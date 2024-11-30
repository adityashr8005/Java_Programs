package DualLoop;

public class Loop4 {
    public static void main(String[] args) {

        for (int num=10;num<100;num++){
            int data=num;
            int sum=0;
            while(data>0){
                int rem=data%10;
                sum=(sum*10)+rem;
                data=data/10;
            }
            if(num==sum){
                System.out.println(num + " is a palindrome.");
            }
        }
    }
}
