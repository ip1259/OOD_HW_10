package main;
import java.util.Scanner;
import java.math.BigDecimal;

public class HW1 {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Item item_1 = new Item();
		Item item_2 = new Item();
		Item item_3 = new Item();
		double subtotal = 0.0;
		double total = 0.0;
		double tax = 0.0;
		
		System.out.println("Input name of item 1:");
		item_1.setName(keyboard.nextLine());
		System.out.println("Input quantity of item 1:");
		item_1.setQuantity(Integer.valueOf(keyboard.nextLine()));
		System.out.println("Input price of item 1:");
		item_1.setPrice(Double.valueOf(keyboard.nextLine()));
		
		System.out.println("Input name of item 2:");
		item_2.setName(keyboard.nextLine());
		System.out.println("Input quantity of item 2:");
		item_2.setQuantity(Integer.valueOf(keyboard.nextLine()));
		System.out.println("Input price of item 2:");
		item_2.setPrice(Double.valueOf(keyboard.nextLine()));
		
		System.out.println("Input name of item 3:");
		item_3.setName(keyboard.nextLine());
		System.out.println("Input quantity of item 3:");
		item_3.setQuantity(Integer.valueOf(keyboard.nextLine()));
		System.out.println("Input price of item 3:");
		item_3.setPrice(Double.valueOf(keyboard.nextLine()));
		
		subtotal = item_1.getTotal() + item_2.getTotal() + item_3.getTotal() ;
		tax = new BigDecimal(subtotal * 0.0625).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		total = subtotal + tax ;
		
		System.out.println("");
		System.out.println("Your bill:");
		System.out.println("");
		System.out.printf("%-30s%-10s%-10s%-10s\n", "Item", "Quantity", "Price", "Total");
		item_1.printItemLine();
		item_2.printItemLine();
		item_3.printItemLine();
		System.out.println("");
		System.out.printf("%-50s%-10.2f\n", "Subtotal", subtotal);
		System.out.printf("%-50s%-10.2f\n", "6.25% scales tax", tax);
		System.out.printf("%-50s%-10.2f\n", "Total", total);
		
		keyboard.close();
		

	}
	

}

