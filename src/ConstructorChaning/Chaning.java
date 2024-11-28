package ConstructorChaning;

class AA{
    AA(){
        System.out.println("AA");
    }
}
class BB extends AA{
    BB(){
        System.out.println("BB");
    }
}
public class Chaning extends BB {
    Chaning(){
        System.out.println("Chaning");
    }
    public static void main(String[] args) {
        Chaning obj = new Chaning();

    }
}
