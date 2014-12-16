/**
 * 
 */
package dp.abstractFactory;

/**
 * @author Saif
 * 
 */
public class FactoryProducer {

    public static AbstractFactory getFactory( String choice ) {
        if ( choice.equalsIgnoreCase( "SHAPE" ) ) {
            return ShapeFactory.getInstance();
        } else if ( choice.equalsIgnoreCase( "COLOR" ) ) {
            return ColorFactory.getInstance();
        }
        return null;
    }
}