package Day02;

public class Q1 {
    public static void main(String[] args) {

        if ( true ) { //true
            System.out.println("true");
        }

        if ( false ) { //false
            System.out.println("false");
        }

        int a = 10;  //true
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) { //false
            System.out.println("false");
        }

        if ( a > 10 ) { //false
            System.out.println("false");
        }

        if ( a >= 10 ) { //true
            System.out.println("true");
        }

        int b = 10;

        if ( a == b ) { //true
            System.out.println("true");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) { //false
            System.out.println("false");
        }

        if ( c == false ) { //true
            System.out.println("true");
        }

        // `!` => 반전
        if ( !c ) { //true
            System.out.println("true");
        }

        // `!` => 반전
        if ( !(!c) ) {  //false
            System.out.println("false");
        }

        boolean d = true;

        if ( c != d ) {  //true
            System.out.println("true");
        }
    }
}
