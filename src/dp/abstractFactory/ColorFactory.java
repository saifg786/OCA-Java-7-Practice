/**
 * 
 */
package dp.abstractFactory;

/**
 * @author Saif
 * 
 */
public class ColorFactory extends AbstractFactory {

    private static ColorFactory instance = new ColorFactory();

    private ColorFactory() {

    }

    public static ColorFactory getInstance() {
        return instance;
    }

    public Color getColor( String color ) {
        if ( color == null ) {
            return null;
        }
        if ( color.equalsIgnoreCase( "RED" ) ) {
            return new Red();
        } else if ( color.equalsIgnoreCase( "GREEN" ) ) {
            return new Green();
        } else if ( color.equalsIgnoreCase( "BLUE" ) ) {
            return new Blue();
        }
        return null;
    }

    public Shape getShape( String shapeType ) {
        return null;
    }
}