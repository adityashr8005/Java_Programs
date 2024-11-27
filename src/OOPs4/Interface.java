package OOPs4;

//interface is not a class.
//interface contains only undefined function.
//interface use implements to inherit parent class.
interface pp{
    void fun();
    //we don't need to write abstact. It is by default abstract because all interface are undefined function.
    //It is by default public also.
}

public class Interface implements pp{
    public void fun(){
        System.out.println("hii");
    }
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.fun();
    }
}
