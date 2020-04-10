public class RentalContract {
	public static void main(String[] args) {
	}  

	double RentPerHour = 40.00;
	double RentForMinuteOverHour = 1.00;

	String contractNumber;
	int hoursOfRental;
	int minutesOverAnHour;
	double totalPrice;

	public RentalContract()   {
	       totalPrice = (hoursOfRental * RentPerHour) +
	               (minutesOverAnHour * RentForMinuteOverHour);
	   }

	   public void setHoursOfRental(int hours) {
	       if(hours > 0) {
	           hoursOfRental = hours;
	           totalPrice = (hoursOfRental * RentPerHour) +
	                   (minutesOverAnHour * RentForMinuteOverHour);
	       }
	   }

	   public void setMinutesOverAnHour(int minutes) {
	       if(minutes > 0) {
	    	   minutesOverAnHour = minutes;
	           totalPrice = (hoursOfRental * RentPerHour) +
	                   (minutesOverAnHour * RentForMinuteOverHour);
	       }
	   }
	  

	   public String getContractNumber() {
	       return contractNumber;
	   }
	  
	   public int getHoursOfRental() {
	       return hoursOfRental;
	   }
	  
	   public int getMinutesOverHour() {
	       return minutesOverAnHour;
	   }
	  
	   public double getTotalPrice() {
	       return totalPrice;

		
	}
}