//package OOPs2;
//
////Passing object as an argument.
//class Time{
//    int hr,min;
//    void fun(int h,int m){
//        hr=h;
//        min=m;
//    }
//
//    void show(){
//        System.out.println(hr+ " : " + min);
//    }
//
//}
//public class CopyConstructor {
//    public static void main(String[] args) {
//        Time t1 = new Time();
//        Time t2 = new Time();
//        Time t3 = new Time();
//
//        t1.fun(5,45);
//        t2.fun(4,50);
//        t1.show();
//        t2.show();
//        System.out.println("Hashcode of t1:"+t1); //Output:OOPs2.Time@52cc8049 -> Hashcode.
//
//        t3.hr = t1.hr+t2.hr; //Adding hour //We can't add like t1+t2 in java.
//        t3.min = t1.min+t2.min;
//        System.out.println("\nAfter sum of t1 and t2(Hour,Minutes).");
//        t3.show();
//    }
//}










package OOPs2;

//Passing object as an argument.
class Time{
    private
    int hr,min;
    void fun(int h,int m){
        hr=h;
        min=m;
    }

    void show(){
        System.out.println(hr+ " : " + min);
    }

   Time sum(Time t2){    //here, return type (Time is used) because we are returning object.
        Time obj = new Time();
        System.out.println(hr + t2.hr);
        System.out.println(min + t2.min);
        return obj;
    }
}
public class TestPassingObject {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.fun(5,45);
        t2.fun(4,50);
        t3 =  t1.sum(t2); //passing object as an argument to function sum() and storing return obj to t3.
        t3.show();        //It gives output of t3.
    }
}

