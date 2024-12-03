package StringHandling;

public class String0 {
    public static void main(String[] args) {

        String str = "hello";
//        System.out.println(str.charAt(0)); // h
//        System.out.println(str.charAt(1)); // e
//        System.out.println(str.length());  // 5

        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)); // hello
        }

        System.out.println();

        System.out.println("Reversed String:");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)); // olleh
        }

    }
}
