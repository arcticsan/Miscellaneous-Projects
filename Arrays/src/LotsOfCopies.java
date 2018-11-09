import java.util.Arrays;

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num,strMain,arrMain);
		System.out.println("num: " +  num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		part2WithInts();
		part2WithStrings();
		part2WithIntArrays();
	}
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str += str;
		arr[2] = 42;
	}
	public static void part2WithInts() {
		System.out.println("Part 2");
		int a = 7; // a = startValue
		int b = a; // b = a
		a = 1; 	   // a = newValue
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithStrings() {
		System.out.println("Part 2");
		String a = "Hi"; // a = startValue
		String b = a; // b = a
		a = "Bye"; 	   // a = newValue
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithIntArrays() {
		System.out.println("Part 2");
		int[] a = {1,2,3}; // a = startValue
		int[] b = a; // b = a
		a[1] = 5; 	   // a = newValue
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
}
