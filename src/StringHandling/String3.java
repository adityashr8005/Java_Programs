package StringHandling;

//listen-silent
public class String3 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        int count=0;
        for (int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            for (int j=0;j<str2.length();j++){
                if (ch==str2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if (count==str1.length()){
            System.out.println("String is .....");
        }else {
            System.out.println("String is not....");
        }
    }
}
