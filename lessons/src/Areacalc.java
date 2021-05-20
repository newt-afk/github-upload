

import java.util.Scanner;

public class Areacalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("please enter the length of the rectangle: ");
		double length = Double.parseDouble(s.next());
		System.out.print("please enter the width of the rectangle: ");
		double width = Double.parseDouble(s.next());
		System.out.println("the area of the rectangle " + length + " x " + width + " is... " + length * width);
		s.close();

	}

}
