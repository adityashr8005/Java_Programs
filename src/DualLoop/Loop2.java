package DualLoop;

public class Loop2 {
    public static void main(String[] args) {
        int c=0;
        for (int num=1 ; num<=100 ; num++){
            int count =0;
            for (int i=1 ; i<=num ; i++){
                int rem = num%i;
                if (rem == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(num+" is a prime number.");
                c++;
                if (c==10){
                    break;
                }
            }
        }
    }
}
