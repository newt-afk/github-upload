
import java.util.Scanner;
public class PrintMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("time to compare ");
		double a = Double.parseDouble(s.next());
		System.out.print("to ");
		double b = Double.parseDouble(s.next());
		System.out.println(Double.max(a, b));
		s.close();

	}

}
