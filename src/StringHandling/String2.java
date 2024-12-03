package StringHandling;

//ASCII:American Standard Code for Information Interchange
//A-65      a-97
//B-66      b-98
//
//Z-90      z-122
public class String2 {
    public static void main(String[] args) {

//        System.out.println(65); //65
//        System.out.println((char)65); //A

        String s="hello";
        System.out.println(s.toUpperCase()); //HELLO //It create new String for HELLO don't change original String.
        System.out.println(s); //hello .....java is immutable can't be changes.
        s=s.toUpperCase(); //store new data.
        System.out.println(s); //HELLO

        System.out.println();

        System.out.println("Conversion of letterCase. ");
        System.out.println("@HellO");
        //convert @HellO to @hELLo
        String str="@HellO";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>=65 && ch<=90){//we can't apply .lowerCase function to char.
                ch=(char)(ch+32); //32==97(a)-65(A)
            }else if(ch>=90 && ch<=122){ //else can be dangerous cause it will also convert other character rather than
                                         //alphabets. So, we use else if.
                ch=(char)(ch-32);
            }
            System.out.print(ch);
        }

    }
}
