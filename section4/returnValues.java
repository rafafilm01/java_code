public class returnValues {
    public static void main(String[] args) {
        
double measure1 =measureRectangle(4.2, 7);
System.out.println(measure1);     

double measure2 = measureRectangle(6.0, 3.5);
stringPrinter(6.0, 3.5, measure2);
    }

    public static double measureRectangle( double length , double width) {
        double area = length * width;
        return area;
        
    }
//void method is not returning anything but just producing a print statement
    public static void stringPrinter(double length , double width , double area) {
       System.out.println("the parameters of the rectangle  with length "+ length+ " and width of " + width+ " are: "+ area);
        

        
    }
}
