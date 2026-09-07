package dmit2015.model;

public class Circle {

    // Define a field to store the radius
    private double radius;

    //Define getters/setters for data fields
    public double getRadius() {
     return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Define an no-argument constructor

    public Circle() {
        radius = 1;
    }
   //Define an instance-level to return the area of this circle
   public double area() {
        return Math.PI * radius * radius;
   }

  public static void main(String[] arg) {
        // Create new circle
         Circle currentCircle = new Circle();
         // Change the radius circle to 5
          currentCircle.setRadius(5);
          // Print a message with the Radius and Area of the current circle
       System.out.printf("Radius: %.2f, Area = %.2f\n",
               currentCircle.getRadius(),
               currentCircle.area());
   }
}
