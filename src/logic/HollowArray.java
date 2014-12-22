/**
 * 
 */
package logic;

/**
 * @author Saif
 *
 */
public class HollowArray {

    public static void main( String args[] ) {
        System.out.println( isHollow( new int[] { 1, 2, 0, 0, 0, 3, 4 } ) );
        System.out.println( isHollow( new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 } ) );
        System.out.println( isHollow( new int[] { 1, 2, 0, 0, 3, 4 } ) );
        System.out.println( isHollow( new int[] { 1, 2, 0, 0, 0, 3, 4, 5 } ) );
        System.out.println( isHollow( new int[] { 3, 8, 3, 0, 0, 0, 3, 3 } ) );
        System.out.println( isHollow( new int[] { 1, 2, 0, 0, 0, 3, 4, 0 } ) );
        System.out.println( isHollow( new int[] { 0, 1, 2, 0, 0, 0, 3, 4 } ) );
        System.out.println( isHollow( new int[] { 0, 0, 0 } ) );
    }

    private static int isHollow( int... a ) {
        int precCnt = 0, zeroIndex = 0, zeroCnt = 0, followIndex = 0, followCnt = 0;
        for ( int i = 0; i < a.length; i++ ) {
            if ( a[i] != 0 ) {
                precCnt++;
            }
            if ( a[i] == 0 ) {
                zeroIndex = i;
                break;
            }
        }
        for ( int i = zeroIndex; i < a.length; i++ ) {
            if ( a[i] == 0 ) {
                zeroCnt++;
            }
            if ( a[i] != 0 ) {
                followIndex = i;
                break;
            }
        }
        for ( int i = followIndex; i < a.length; i++ ) {
            if ( a[i] != 0 ) {
                followCnt++;
            }
            if ( a[i] == 0 ) {
                break;
            }
        }
        return ( precCnt == followCnt && zeroCnt > 2 ) ? 1 : 0;
    }
}