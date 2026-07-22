package org.tnsif.acc.c2tc.oops;

public class FoodItem {


		//variables
		String name;
		double price;
		String category;
		
		//method
		void displayDetails() {
			System.out.println("Food name:"+ name);
			System.out.println("Price:"+ price);
			System.out.println("Category:"+ category);
		}

		public static void main(String[] args) {
			
			FoodItem food1 =new FoodItem();  //new:allocatate the memory for the object creator
            food1.name="briyanni";
            food1.price=399.00;
            food1.category="Rice";
            FoodItem food2 =new FoodItem();  
            food2.name="pizza";
            food2.price=89.00;
            food2.category="fast food";
            food1.displayDetails();
            food2.displayDetails();
		}

}
