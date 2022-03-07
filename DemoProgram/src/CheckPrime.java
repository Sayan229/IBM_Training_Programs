import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		boolean flag = true;
		int i;
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("It is Prime.");
		else
			System.out.println("It is not Prime.");
	}
}
