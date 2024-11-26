package OOPS;

import java.util.Scanner;

public class StudentManagement {
    int id;
    String name;
    static String school = "KVM"; //We use static cause it hold same memory space for all objects.
                                  //For efficient memory management.
                                  //For both obj1 and obj2 will have same memory.(3byte)
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name:");
        name = sc.next();   //string input
        System.out.print("Enter a id:");
        id = sc.nextInt();  //integer input
    }
    void showData(){
        System.out.println("Name:"+name+"\t"+"ID:"+id+"\t"+"School:"+school);
    }
    public static void main(String[] args) {
        StudentManagement obj1 = new StudentManagement();
        StudentManagement obj2 = new StudentManagement();
        obj1.getData();  //calling getData() function using obj1 for input data.
        obj2.getData();  //calling getData() function using obj2 for input data.
        obj1.showData(); //calling showData() function for displaying output of obj1.
        obj2.showData();
    }
}
