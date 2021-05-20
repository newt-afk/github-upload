import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("what was your grade?");
		int grade = s.nextInt();
		if (grade > 89 && grade < 101) {
			System.out.println("you got an A!");
		}
		else if (grade > 79 && grade < 100) {
			System.out.println("you got a B!");
		}
		else if (grade > 69 && grade < 100) {
			System.out.println("you got a C :(");
		}
		else if (grade > 59 && grade < 100) {
			System.out.println("you got a D :(");
		}
		else if (grade > -1 && grade < 100) {
			System.out.println("you got a F :(");
		}
		else {
			System.out.println("invalid");
		}
		s.close();

	}

}
