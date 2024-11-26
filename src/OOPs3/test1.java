//package OOPs3;
////passing obj as an argument...
//
//class time{
//    private int hr,min;
//    time(int h,int m){
//        hr=h;
//        min=m;
//    }
//    void show(){
//        System.out.println(hr + ":" + min);
//    }
//
//    time(){
//        hr=0;
//        min=0;
//    }
//
//    //we use time return type because we are returning object of time.
//    time sum(time t2){ //we use time parameter as t2 passes time type object
//
////        System.out.println(t2);//it gives hashcode so,
////        System.out.println(t2.hr);//it gives hr of t2 object.
////        System.out.println(hr);//it gives hr of t1 object.
//
//        time obj = new time();
//        int h = ( min + t2.min ) /60;
//        obj.min = ( min + t2.min ) % 60;
//        obj.hr = h + hr + t2.hr;
//        return obj;
//    }
//}
//public class test1 {
//    public static void main(String[] args) {
//
//        time t1 = new time(5,45);
//        time t2 = new time(4,50);
//        time t3 = new time();
////        t1.sum(); //now sum() will have component of object t1.
////        t2.sum(); //now sum() will have component of object t2 but component of t1 will be removed.
//        t3= t1.sum(t2);
//        t3.show();
//
//    }
//}








package OOPs3;
//passing obj as an argument...

class time{
    private int hr,min;
    time(int h,int m){
        hr=h;
        min=m;
    }
    void show(){
        System.out.println(hr + ":" + min);
    }

    time(){
        hr=0;
        min=0;
    }

    //we use time return type because we are returning object of time.
    void sum(time t2 , time x){ //we use time parameter as t2 passes time type object

//        System.out.println(t2);//it gives hashcode so,
//        System.out.println(t2.hr);//it gives hr of t2 object.
//        System.out.println(hr);//it gives hr of t1 object.

        //here we done call by reference...
        time obj = new time();
        int h = ( min + t2.min ) /60;
        x.min = ( min + t2.min ) % 60;
        x.hr = h + hr + t2.hr;

    }
}
public class test1 {
    public static void main(String[] args) {

        time t1 = new time(5,45);
        time t2 = new time(4,50);
        time t3 = new time();
//        t1.sum(); //now sum() will have component of object t1.
//        t2.sum(); //now sum() will have component of object t2 but component of t1 will be removed.
        t1.sum(t2,t3);
        t3.show();

    }
}

