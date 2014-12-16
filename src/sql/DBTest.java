/**
 * 
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;

/**
 * @author Saif
 * 
 */
public class DBTest {

    public static void main( String[] arg ) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            connection = DriverManager.getConnection( "jdbc:mysql://db4free.net:3306/saifg786", "saifg786", "saifg786" );
            statement = connection.createStatement();
            String sql = "SELECT * FROM tbl_person";
            rs = statement.executeQuery( sql );
            ResultSetMetaData rsmd = rs.getMetaData();
            for ( int i = 1; i <= rsmd.getColumnCount(); i++ ) {
                System.out.println( "Column Name / Column Type: " + rsmd.getColumnName( i ) + " / " + rsmd.getColumnTypeName( i ) );
            }
            while ( rs.next() ) {
                int id = rs.getInt( "id" );
                Date dob = rs.getDate( "dob" );
                String firstName = rs.getString( "first_name" );
                String lastName = rs.getString( "last_name" );
                System.out.print( "ID: " + id );
                System.out.print( ", Dob: " + dob );
                System.out.println( ", Name: " + firstName + " " + lastName );
            }            
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            try {
                if ( rs != null ) {
                    rs.close();
                }
            } catch ( Exception e ) {
                e.printStackTrace();
            }
            try {
                if ( statement != null ) {
                    statement.close();
                }
            } catch ( Exception e ) {
                e.printStackTrace();
            }
            try {
                if ( connection != null ) {
                    connection.close();
                }
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }
    }
}