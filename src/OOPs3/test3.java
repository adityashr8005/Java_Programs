package OOPs3;

public class test3 {
    int a;
    void fun(int a){ //if local and instance var (used a instead of x) will same ... Output 0.
                     //so to differentiate we use this. keyword
                    //This keyword points to a current class element.
                    //It is used to differentiate local and instance variable.
        this.a=a;
    }
    void show(){
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        test3 obj = new test3();
        obj.fun(10);
        obj.show();
    }
}
