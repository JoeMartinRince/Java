import java.util.Scanner;
public class For {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit:");
	int limit=sc.nextInt();
	int i;
	for( i=0;i<limit;i++) { 
		if (i%2==0){
		
		 System.out.println(i);
	}
	}	
	}
 
}
