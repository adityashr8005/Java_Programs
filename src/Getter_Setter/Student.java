package Getter_Setter;

public class Student {
    private int id;
    private String name;
    //using private data member can't be access outside class.So, we need to create function.
//    void setId(int x){
//        id=x;
//    }
//    int getId(){
//        return id;
//    }
//
//    void setName(String s){
//        name=s;
//    }
//    String getName(){
//        return name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
