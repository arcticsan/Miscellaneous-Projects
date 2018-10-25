/* Bryan Chan\
 * This program prints out a hourglass. 
 * Version 1
 * October 19, 2018
 */
import java.util.*;
public class Hourglass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean stop_run;
		do {
			System.out.print("Please enter width of hourglass (discounting borders ie \"|\"): ");
			int width = console.nextInt();
			//int width = ;
			base(width);
			tophalf(width);
			middle(width);
			bottomhalf(width);
			base(width);
			System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
			String quit = console.next().toLowerCase();
			stop_run = quit.contentEquals("quit");
			System.out.println("");
		}
		while (stop_run != true);
	}
	public static void base(int width) {
		System.out.print("|");
		for (int i = 1; i <= width; i++) {
			System.out.print("\"");
		}
		System.out.print("|\n");
	}
	public static void tophalf(int width) {
		for (int line = 1; line <= (width/2)-1; line++) {
			for (int i = 1; i <= line; i++) {		
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 1; j <= (-2 * (line) + width); j++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	public static void middle(int width) {
		for (int i = 1; i <= (width/2); i++) {
			System.out.print(" ");
		}
		if ((width % 2) == 0) System.out.println("||");
		else System.out.println("|:|");
	}
	public static void bottomhalf(int width) {
		for (int line = 1; line <= (width/2)-1; line++){
			for(int i = (width/2)-1; i >= line; i--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int j = 1; j <= (line * 2) + (width%2); j++) {
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
	
}