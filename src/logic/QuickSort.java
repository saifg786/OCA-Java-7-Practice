/**
 * 
 */
package logic;

/**
 * @author Saif
 * 
 */
public class QuickSort {

    public static void main( String[] args ) {
        int array[] = { 23, 44, 1, 2009, 2, 88, 123, 7, 999, 1040, 88 };
        quickSort( array, 0, array.length - 1 );
    }

    public static void quickSort( int[] array, int position, int arrayLength ) {
        if ( position < arrayLength ) {
            int qSort = partition( array, position, arrayLength );
            quickSort( array, position, qSort );
            quickSort( array, qSort + 1, arrayLength );
        }
    }

    private static int partition( int[] array, int position, int r ) {
        int x = array[position];
        int i = position - 1;
        int j = r + 1;
        while ( true ) {
            i++;
            while ( i < r && array[i] < x )
                i++;
            j--;
            while ( j > position && array[j] > x )
                j--;
            if ( i < j )
                swap( array, i, j );
            else
                return j;
        }
    }

    private static void swap( int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}