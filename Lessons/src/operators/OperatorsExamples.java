package operators;

public class OperatorsExamples {
    public static void main(String args[]) {
//        arthimaticOperators();
//        relationOperators();
//        logicalOperators();
//       assignmentOperators();
//       miscOperator();
        instanceOfOeprator();
    }
    public static void arthimaticOperators(){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
//        System.out.println(a);
//        a++;
//        System.out.println(a);
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
    public static void relationOperators(){
        int a = 10;
        int b = 20;

        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
    public static void logicalOperators() {
        boolean a = true;
        boolean b = false;
        boolean c = (1>2);
        boolean d = (2==2);
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("c && d = " + (c&&d));
        System.out.println("c || d = " + (c||d) );
        System.out.println("!(c && d) = " + !(c && d));
    }
    public static void assignmentOperators() {

            int a = 10;
            int b = 20;
            int c = 0;

            c = a + b;
            System.out.println("c = a + b = " + c );

            c += a ;
            System.out.println("c += a  = " + c );

            c -= a ;
            System.out.println("c -= a = " + c );

            c *= a ;
            System.out.println("c *= a = " + c );

            a = 10;
            c = 15;
            c /= a ;
            System.out.println("c /= a = " + c );

            a = 10;
            c = 15;

            c %= a ;
            System.out.println("c %= a  = " + c );

//            c <<= 2 ;
//            System.out.println("c <<= 2 = " + c );
//
//            c >>= 2 ;
//            System.out.println("c >>= 2 = " + c );
//
//            c >>= 2 ;
//            System.out.println("c >>= 2 = " + c );
//
//            c &= a ;
//            System.out.println("c &= a  = " + c );
//
//            c ^= a ;
//            System.out.println("c ^= a   = " + c );
//
//            c |= a ;
//            System.out.println("c |= a   = " + c );


        }
        public static void miscOperator() {
                int a, b;
                a = 10;
//                if( a==1){
//                    b= 20;
//                } else {
//                    b=30;
//                }
                b = (a == 1) ? 20: 30;
                System.out.println( "Value of b is : " +  b );

                b = (a == 10) ? 20: 30;
                System.out.println( "Value of b is : " + b );
        }
        public static void instanceOfOeprator() {
            Object name = "James";

            // following will return true since name is type of String
            boolean result = name instanceof Integer;
            System.out.println( result );

        }
}
