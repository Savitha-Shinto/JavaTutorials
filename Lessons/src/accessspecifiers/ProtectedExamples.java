package accessspecifiers;


import accessspecifiersub.ProtectedParent;

class ProtectedChild extends ProtectedParent {
     public static void main(String args[]){
         ProtectedChild protectedChild = new ProtectedChild();
         protectedChild.msg();
     }
 }