
import java.util.*;

public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = {5,10,15,20,25,30,35,40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		int[] sumArr = sum(a1,a2);
		int appendNum = 200;
		int[]
		
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arrsum = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arrsum[i] = arr1[i] + arr2[i];
		}
		return arrsum;
	}
	public static int[] append(int[] arr, int num) {
		int[] newarray = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newarray[i] = arr[i];
		}
		newarray[newarray.length-1] = num;
		return newarray;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] newarray = new int[arr.length - 1];
		for(int i = 0; i < idx; i++) {
			newarray[i] = arr[i];
		}
		for(int i = idx + 1; i < arr.length; i++) {
			newarray[i-1] = arr[i];
		}
		return newarray;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i += 2) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int last = arr[arr.length-1];
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
	}
}
