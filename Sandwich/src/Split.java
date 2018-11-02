import java.util.*;
public class Split {

	public static void main(String[] args) {
		// Your task Part 0

				//String.split();

				//It's a method that acts on a string, <StringName>.split(<String sp>);

				//Where sp is the string where the string splits

				//And it returns an array

				// Example: "I like apples!".split(" ");
				//String[] apples = "I like apples!".split(" ");
				System.out.println(Arrays.toString("I like apples!".split(" ")));
				

				// it will split at spaces and return an array of ["I","like","apples!"]

				// Example 2: "I really like really red apples"split("really")
				System.out.println(Arrays.toString("I really like reallyreally red apples!".split("really")));
				String[] applesArray = "I really like reallyreally red apples".split("really");
				System.out.println(Arrays.toString(applesArray));
				System.out.println(applesArray[2]);

				// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

				//play around with String.split!

				//What happens if you "I reallyreally likeapples".split("really") ?
				System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
	}
	//Your task Part 1:

			/*Write a method that take in a string like

			* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

			* describing a sandwich.

			* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

			* the sandwich and ignores what's on the outside

			* What if it's a fancy sandwich with multiple pieces of bread?

			*/
		
		public static String sandwichDescriber(String food) {
			int FirstBread_Index = food.indexOf("bread");
		
			//System.out.println(FirstBread_Index);
		
			int Last_BreadIndex = FirstBread_Index + 1;
		
			//System.out.println(food.indexOf("bread", Last_BreadIndex));
			
			if (FirstBread_Index == -1) return("");
		
			boolean lastBread = false;
		
			do {
				if (food.indexOf("bread",Last_BreadIndex) != -1) {
					lastBread = false;
					Last_BreadIndex++;
					//System.out.println(Last_BreadIndex);
				}
				else if (food.indexOf("bread",Last_BreadIndex) == -1) {
					lastBread = true;
					Last_BreadIndex = food.indexOf("bread",Last_BreadIndex - 1);
					System.out.println(Last_BreadIndex);
				}
			}
			while (lastBread == false);
		
			food = food.substring(FirstBread_Index,(Last_BreadIndex));
		
			//System.out.println("food is " + food);
				
			return (Arrays.toString(food.split("bread")));
		}
		

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/
		public static String sandwichDescriberPt2(String food) {
			int FirstBread_Index = food.indexOf("bread");
		
			//System.out.println(FirstBread_Index);
		
			int Last_BreadIndex = FirstBread_Index + 1;
		
			//System.out.println(food.indexOf("bread", Last_BreadIndex));
			
			if (FirstBread_Index == -1) return("");
		
			boolean lastBread = false;
		
			do {
				if (food.indexOf("bread",Last_BreadIndex) != -1) {
					lastBread = false;
					Last_BreadIndex++;
					//System.out.println(Last_BreadIndex);
				}
				else if (food.indexOf("bread",Last_BreadIndex) == -1) {
					lastBread = true;
					Last_BreadIndex = food.indexOf("bread",Last_BreadIndex - 1);
					System.out.println(Last_BreadIndex);
				}
			}
			while (lastBread == false);
		
			food = food.substring(FirstBread_Index,(Last_BreadIndex));
		
			//System.out.println("food is " + food);
			
			String[] ingredients = (food.split("bread"));
			
			String description = "";
			
			for (int i = 0; i < ingredients.length; i++) {
				description = description + ingredients[i];
			}
				
			return (Arrays.toString(description.split(" ")));
		}

}
