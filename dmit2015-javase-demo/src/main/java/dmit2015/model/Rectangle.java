package dmit2015.model;

public class Rectangle {
  private double length;
  private double width;

 public double getLength() {return length; }
 public void setlength(double length)    { this.length = length; }

 public double getwidth()  {return width; }
 public void setwidth(double width)  { this.width = width; }

    // Define an no-argument constructor
    public Rectangle() { length = 1;
                         width = 1; }

    public double area() { return length * width; }

    public double perimeter() { return 2 * (length * width);
 }

    static void main(String[] args) { Rectangle currentRectangle = new Rectangle();

          currentRectangle.setlength(5);
          currentRectangle.setwidth(4);
          System.out.printf("length: %.2f, width: %.2f, Area = %2f, perimeter = %.2f\n",
                  currentRectangle.getLength(),
                  currentRectangle.getwidth(),
                  currentRectangle.area(),
                  currentRectangle.perimeter());

 }
}
