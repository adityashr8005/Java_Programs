package StringHandling;

public class Palindrome {
    public static void main(String[] args) {

        String str1="madam";
        String str2="";

        //reversing str1...
        for (int i=str1.length()-1;i>=0;i--){
            str2 = str2+str1.charAt(i);
        }

        if (str1==str2){ //It tries to match hashcode... which would be different. Because both are different object.
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

        if (str1.equals(str2)){//It's check its ASCII code.
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        System.out.println(str1.toUpperCase());//MADAM
    }
}
