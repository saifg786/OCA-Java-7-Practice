/**
 * 
 */
package logic;

/**
 * @author Saif
 *
 */
public class ConsecutiveFactored {

    public static void main( String[] args ) {
        System.out.println( isConsectiveFactored( 24 ) );
        System.out.println( isConsectiveFactored( 105 ) );
        System.out.println( isConsectiveFactored( 90 ) );
        System.out.println( isConsectiveFactored( 23 ) );
        System.out.println( isConsectiveFactored( 15 ) );
        System.out.println( isConsectiveFactored( 2 ) );
        System.out.println( isConsectiveFactored( 0 ) );
        System.out.println( isConsectiveFactored( -12 ) );
    }

    private static int isConsectiveFactored( int n ) {
        int i = 0;
        if ( n % 2 != 0 ) {
            return 0;
        }
        for ( i = 2; i < Math.sqrt( n ); ++i ) {
            int div = i * ( i + 1 );
            if ( n % div == 0 ) {
                return 1;
            }
        }
        return 0;
    }
}