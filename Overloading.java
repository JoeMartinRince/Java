package NEW;
class Calculator{
	int add(int a,int b){
		return a+b;
		
	}
	int add(int a,int b,int c){
		return a+b+c;
  }
	double add(double a,double b) {
		return a+b;
	}
}   
public class Overloading {
    public static void main(String[] args) {
    Calculator Calc=new Calculator();
    System.out.println("Sum of two integers: " + Calc.add(10, 20));
    System.out.println("Sum of three integers: " + Calc.add(10, 20, 30));
    System.out.println("Sum of two doubles: " + Calc.add(10.5, 20.5));
    
    
    }
}
