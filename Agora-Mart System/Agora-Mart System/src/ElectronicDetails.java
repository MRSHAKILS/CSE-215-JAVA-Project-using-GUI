public class ElectronicDetails extends Process{
	 int tv;
	 int pc;
	 int ac;
	//Variables should be private
	public ElectronicDetails() {}
	public ElectronicDetails(int tv,int pc,int ac)
	{
		this.tv = tv;
		this.pc = pc;
		this.ac = ac;
		
	}
	public double price()
	{
		return (50000*tv)+ (80000*pc) + (60000*ac);
	}
	/*Modify this calculation for price for the following condition - If a person buy two tv's then the customer will
	get 20% discount. and the price will be shown after the discount.*/
	

}
