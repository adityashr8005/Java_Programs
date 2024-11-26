package Getter_Setter;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[]=new Student[3];



        for (int i=0;i<3;i++){
            System.out.println("Enter the id:");
            int roll=sc.nextInt();
            System.out.println("Enter the name:");
            String naam= sc.next();
            Student obj = new Student();
            obj.setId(roll);
            obj.setName(naam);
            arr[i]=obj;
        }
        System.out.println("Data");
        for (int i =0;i<3;i++){
//            System.out.println(arr[i]);//hashcode will be output
            Student obj=arr[i];
            System.out.println(obj.getId() + "\t" + obj.getName());
        }
    }
}
