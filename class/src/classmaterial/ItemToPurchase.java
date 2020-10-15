package classmaterial;

import java.util.Scanner;

public class ItemToPurchase {
	
	String itemName;
	int itemPrice;
	int itemQuantity;
	
	ItemToPurchase(){
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ItemToPurchase itp1 = new ItemToPurchase();
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		itp1.itemName = s.nextLine();
		System.out.println("Enter the item price:");
		itp1.itemPrice = s.nextInt();
		System.out.println("Enter the item quantity:");
		itp1.itemQuantity = s.nextInt();
		
		ItemToPurchase itp2 = new ItemToPurchase();
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		itp2.itemName = s.nextLine();
		System.out.println("Enter the item price:");
		itp2.itemPrice = s.nextInt();
		System.out.println("Enter the item quantity:");
		itp2.itemQuantity = s.nextInt();
		
		
	}
	
	
}
