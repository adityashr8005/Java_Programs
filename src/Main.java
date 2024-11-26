//Sample
//public class Main {
//    public static void main(String[] args) {
//      int n=5;
//      while(n>0) {
//          for (int i = 0; i < n; i++) {
//              System.out.print("*");
//          }
//          System.out.println();
//          n--;
//      }
//    }
//}
//Operator(7 types) -> Assignment:Assign data to var from right to left.
                     //Arithmetic,Logical,conditional, bit-wise, relational,increment and decrement.


//Ternary Operator(From 3 operator {Unary,binary,ternary})

//expr 1 ? expr2 : expr3
//if expr1 is true control move to expr2 else to expr3.
//public class Main {
//    public static void main(String[] args) {
//        int a=5,b=7;
//        int x=5,y=10,z=1;
//        int ans=a>b?a:b;  //b is greater ; Output:7
//        int result=x>y?(x>z?x:z):(y>z?y:z);
//        System.out.println(ans+" is greater");
//        System.out.println(result+" is larger");
//    }
//}




//Bit-wise operator(and,or,xor,right-shift,left-shift)
//public class Main {
//    public static void main(String[] args) {
//        int a=5,b=9;
//        System.out.println("And and OR bit-wise Example");
//        int c=a & b;           //               0101 -5
//        System.out.println(c); //5=101  9=1001  1001 -9   &Gate applied.
//                               //               0001
//        //Output: 1
//        int z=a|b;
//        System.out.println(z); //Output:13
//
//
//        //Right-shift
//        System.out.println("Right-shift");
//        int x=5;
//        int result1 = x>>1; //right-shift by one-> 5=101 , after right-shift->10=2
//        int result2 = x>>2; //right-shift by two-> 5=101 , after right-shift->1=1
//        System.out.println(result1);
//        System.out.println(result2);
//
//        //Left-shift
//        System.out.println("Left-shift");
//        int y=5;
//        int result3= y<<1;  //left-shift by one-> 5=101 , after left-shift->1010=10
//        int result4= y<<2;  //left-shift by one-> 5=101 , after left-shift->10100=20
//        System.out.println(result3);
//        System.out.println(result4);
//    }
//}




//Increment & Decrement
//public class Main {
//    public static void main(String[] args) {
//        int a=2;
//        int c=2;
//        //    2     3     4
//        int b=a++ + a++ + a++;
//        //    2     3     5
//        int z=c++ + c++ + ++c;
//        System.out.println("b="+b); //b=9
//        System.out.println("a="+a); //a=5
//        System.out.println("z="+z); //z=10
//        System.out.println("c="+c); //c=5
//        }
//    }




//If-else
//division int x=1/2; 0.5 but ans comes 0 cause int data type.
//type casting int x=(float)1/2; now output comes 0.5
//leap year->year divisible by 4 and not by 100->if true check with 400;