
public class UsedCar extends Car {
	
	private int miles;
	
	public int getMiles(){
		return miles;
	}
	
	public void setMiles(int miles){
		this.miles = miles;
	}

	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		this.miles = miles;

	}
	
	

}
