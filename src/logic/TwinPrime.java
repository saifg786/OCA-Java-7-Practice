/**
 * 
 */
package logic;

/**
 * @author Saif
 *
 */
public class TwinPrime {

    public static void main( String args[] ) {
        System.out.println( isTwinPrime( 5 ) );
        System.out.println( isTwinPrime( 7 ) );
        System.out.println( isTwinPrime( 53 ) );
        System.out.println( isTwinPrime( 9 ) );
    }

    private static int isTwinPrime( int n ) {
        boolean numPrime, prevNumPrime, nextNumPrime;
        numPrime = isPrime( n );
        prevNumPrime = isPrime( n - 2 );
        nextNumPrime = isPrime( n + 2 );
        return ( ( numPrime && ( prevNumPrime || nextNumPrime ) ) ) ? 1 : 0;
    }

    private static boolean isPrime( int n ) {
        for ( int i = 2; i < n; i++ ) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}