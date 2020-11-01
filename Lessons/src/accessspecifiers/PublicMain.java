package accessspecifiers;

import accessspecifiersub.PublicSub;
/*
The members, methods and classes that are declared public can be accessed from anywhere. This modifier doesn’t put any restriction on the access.
 */
public class PublicMain {
    public static void main(String args[]){
        PublicSub publicSub = new PublicSub();
        publicSub.msg();
    }
}
