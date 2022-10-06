public class Parameters {
    public static void main(String[] args) {
        helloUser("rafa");
        helloUser("brian");
        measureRectangle(2.5, 4);
    }


    public static void helloUser(String name) {
        System.out.println("hello there "+ name);
            
        }

    public static void measureRectangle( double length , double width) {
        double area = length * width;
        System.out.println( " The area of the rectangle is : " +area);
        
    }
}


