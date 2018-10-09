package main;
public class Item 
{

	private String name = new String("");
	private int quantity = 0 ;
	private double price = 0.0;
	private double total = 0.0;
	
	public Item()
	{
		name = "";
		quantity = 0;
		price = 0.0;
		total = quantity * price ;
	}
	public Item(String strName, int iQuantity, double dPrice)
	{
		name = strName;
		quantity = iQuantity;
		price = dPrice;
		total = quantity * price ;
	}
	public String getName()
	{
		return name ;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getPrice()
	{
		return price;
	}
	public double getTotal()
	{
		return total;
	}
	public void setName(String strName)
	{
		name = strName;
	}
	public void setQuantity(int iQuantity)
	{
		quantity = iQuantity;
		total = quantity * price ;
	}
	public void setPrice(double dPrice)
	{
		price = dPrice;
		total = quantity * price ;
	}
	public void printItemLine()
	{
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", this.getName(), this.getQuantity(), this.getPrice(), this.getTotal());
	}

}
