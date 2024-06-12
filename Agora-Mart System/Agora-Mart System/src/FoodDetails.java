public class FoodDetails extends Process{
	int burger;
	int pizza;
	int shake;                       
//All the variables should be private, also add two more variables for a string and a double type data
	
	public FoodDetails() {}
	public FoodDetails(int burger,int pizza,int shake)
	{
		this.burger = burger;
		this.pizza = pizza;
		this.shake = shake;
		
	}
	public double price()
	{
		return (200*burger)+ (1350*pizza) + (150*shake);
	}

}