package NEW;
class Calculator{
	double area(double radius){
		return 3.14*radius*radius;
		
	}
	double area(double length,double breadth){
		return length*breadth;
  }
	float area(float base,float height) {
		return 1/2*base*base;
	}
	int area(int side) {
		return side*side;
	}
}   
public class Overloading {
    public static void main(String[] args) {
    Calculator Calc=new Calculator();
    System.out.println("Area of Circle: " + Calc.area(5.4567845678));
    System.out.println("Area of Rectangle: " + Calc.area(3.45676,4.78987654567));
    System.out.println("Area of triangle: " + Calc.area(5.23,4.7));
    System.out.println("Area of square: " + Calc.area(5));
    }
}
