
	import java.util.Scanner;
	public class PAL {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your no:");
	        int num=sc.nextInt();
	        int org =num;
	        int rev=0;
	        int rem;
	        while(num>0) {
	        	rem=num % 10;
	        	rev= rev *10 + rem;
	        	num=num / 10;
	        }
	        if(rev==org){
	        	System.out.println("YES");
	        }
	        else {
	        	System.out.println("No");
	        }
		}
	}
