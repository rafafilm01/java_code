public class DocComments {
    public static void main(String[] args) {
        
    }
/**
 * Function name : greet
 * 
 * 
 * Inside the function:
 * 1. prints a greeting
 */
    public static void greet() {
        System.out.println("why hello there ! ");
        
    }
/**
 * Function name: printText
 * @param name (String)
 * @param age (int)
 * 
 * Inside the function:
 * print the age and name 
 */
    public static void printText(String name , int age) {
        System.out.println("hi ! My name is "+name+ " and I am "+ age+ " years old." );
        
    }
/**
 * Function name: measureRectangle
 * @param length (double)
 * @param width (double)
 * @return
 * 
 * Inside the function
 * calculate the area of a rectangle 
 */
    public static double measureRectangle( double length , double width) {
        double area = length * width;
        return area;
}
}
