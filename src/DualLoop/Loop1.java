package DualLoop;

public class Loop1 {
    public static void main(String[] args) {

        for (int num =3 ; num<=7 ; num++){
            int f=1;
            for (int i=num ; i>0 ; i--){
                f=f*i;
            }
            System.out.println("Factorial of "+num+" is "+f);
        }
        System.out.println();
    }
}
