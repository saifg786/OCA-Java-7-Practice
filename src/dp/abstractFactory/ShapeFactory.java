/**
 * 
 */
package dp.abstractFactory;

/**
 * @author Saif
 * 
 */
public class ShapeFactory extends AbstractFactory {

    private static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {

    }

    public static ShapeFactory getInstance() {
        return instance;
    }

    public Shape getShape( String shapeType ) {
        if ( shapeType == null ) {
            return null;
        }
        if ( shapeType.equalsIgnoreCase( "CIRCLE" ) ) {
            return new Circle();
        } else if ( shapeType.equalsIgnoreCase( "RECTANGLE" ) ) {
            return new Rectangle();
        } else if ( shapeType.equalsIgnoreCase( "SQUARE" ) ) {
            return new Square();
        }
        return null;
    }

    public Color getColor( String color ) {
        return null;
    }
}