import javax.swing.*;

public class ShoppingCart {

	public static void main(String[] args) {
		displayCartAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayCartAndTotal("Milk",20.0,"Bread",15.0);
		displayCartAndTotal();
		

	}
	public static void displayCartAndTotal (Object...items) {
		if(items.length==0) {
			System.out.println("No items in the cart.");
			return;
		}
		System.out.println("Items in the cart: ");
		for(int i=0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			System.out.printf("- %s: $%.2f%n",itemName,itemPrice);
			
		}
		
	}//end of CartAndTotal Method 
	
}
