
import java.util.Scanner;
public class PrintMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("time to compare ");
		double a = s.nextDouble();
		System.out.print("to ");
		double b = s.nextDouble();
		System.out.println(Double.max(a, b) + "is bigger");
		s.close();
	}
}
