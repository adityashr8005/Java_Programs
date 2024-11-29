package Modifier;

import Modifier2.abc;

public class AccessSpecifier extends abc {
//extends karney sey private elements extends nahi hoti.
    public static void main(String[] args) {

//        abc obj = new abc();
//        System.out.println(obj.a);
//        System.out.println(obj.b);

        AccessSpecifier obj = new AccessSpecifier();
//        System.out.println(obj.a);//default can' tbe access even via inherit.
        System.out.println(obj.b);//access because it is public.
//        System.out.println(obj.c);can't be access private.
        System.out.println(obj.d);//protect can be access inheriting.

    }
}
