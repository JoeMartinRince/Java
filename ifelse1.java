
import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("elegible to vote");
		}
		
		else {
			System.out.println("not elegible to vote");
		}
		sc.close();
	}
}
