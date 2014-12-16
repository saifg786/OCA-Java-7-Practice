/**
 * 
 */
package dp.factory;

/**
 * @author Saif
 * 
 */
public class FactoryPatternDemo {

    public static void main( String[] args ) {

        // get an object of Circle and call its draw method.
        Shape circle = ShapeFactory.getInstance().getShape( "CIRCLE" );

        // call draw method of Circle
        circle.draw();

        // get an object of Rectangle and call its draw method.
        Shape rectangle = ShapeFactory.getInstance().getShape( "RECTANGLE" );

        // call draw method of Rectangle
        rectangle.draw();

        // get an object of Square and call its draw method.
        Shape square = ShapeFactory.getInstance().getShape( "SQUARE" );

        // call draw method of circle
        square.draw();
    }
}