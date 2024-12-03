package StringHandling;

public class CheckVowel {
    public static void main(String[] args) {

        String str="hello";
        int c=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                c++;
            }
        }
        System.out.println("There are "+c+" vowels in "+str);
    }
}
