import java.util.Scanner;
import java.math.BigDecimal;

public class HW1 {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Item item[] = new Item[3];
		double subtotal = 0.0;
		double total = 0.0;
		double tax = 0.0;
		
		for(int i =0;i<3;i++)
		{
			try
			{
				item[i] = new Item();
				System.out.printf("Input name of item %d:\n",i+1);
				item[i].setName(keyboard.nextLine());
				System.out.printf("Input quantity of item %d:\n",i+1);
				item[i].setQuantity(Integer.valueOf(keyboard.nextLine()));
				System.out.printf("Input price of item %d:\n",i+1);
				item[i].setPrice(Double.valueOf(keyboard.nextLine()));
			}
			catch(NumberFormatException e)
			{
				System.out.println("資料輸入有誤情重新輸入");
				i--;
			}
		}
		
		for(Item i : item)
		{
			subtotal = subtotal + i.getTotal();
		}
		
		tax = new BigDecimal(subtotal * 0.0625).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		total = subtotal + tax ;
		
		System.out.println("");
		System.out.println("Your bill:");
		System.out.println("");
		System.out.printf("%-30s%-10s%-10s%-10s\n", "Item", "Quantity", "Price", "Total");
		for(Item i: item)
		{
			System.out.println(i.toString());
		}
		System.out.println("");
		System.out.printf("%-50s%-10.2f\n", "Subtotal", subtotal);
		System.out.printf("%-50s%-10.2f\n", "6.25% scales tax", tax);
		System.out.printf("%-50s%-10.2f\n", "Total", total);
		
		keyboard.close();
		

	}
	

}

