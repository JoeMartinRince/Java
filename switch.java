import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade:");
        String grade=sc.next();
        switch (grade) {
        case "O" :
        	System.out.println("OUTSTANDING");
        	break;
        case "A" :
        	System.out.println("Very Good");
        	break;
        case "B" :
        	System.out.println("Good");
        	break;
        case "C" :
        	System.out.println("Above Average");
        	break;
        case "D" :
        	System.out.println("Average");
        	break;
        case "F" :
        	System.out.println("Fail");
        	break;
         default :
        	System.out.println("Wrong Grade");
        	break;
        }

}
}
