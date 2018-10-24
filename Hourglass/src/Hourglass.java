/* Bryan Chan
 * This program prints out a hourglass. 
 * Version 0
 * October 19, 2018
 */
import java.util.*;
public class Hourglass {

	public static void main(String[] args) {
		//Scanner console = new Scanner(System.in);
		//System.out.println("Please enter width of hourglass (discounting borders ie \"|\"): ");
		//int width = console.nextInt();
		int width = 10;
		base(width);
		tophalf(width);
		middle(width);
		bottomhalf(width);
		base(width);
	}
	public static void base(int width) {
		System.out.print("|");
		for (int i = 1; i <= width; i++) {
			System.out.print("\"");
		}
		System.out.print("|\n");
	}
	public static void tophalf(int width) {
		for (int line = 1; line <= 4; line++) {
			for (int i = 1; i <= line; i++) {		
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 1; j <= (-2 * (line) + 10); j++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	public static void middle(int width) {
		System.out.println("     ||");
	}
	public static void bottomhalf(int width) {
		for (int i = 4; i >= 1; i--)
	}
	
}