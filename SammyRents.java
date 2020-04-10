import java.util.Scanner;

public class SammyRents {
	public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         
         String contractNumber;
         int hoursOfRental;
         int minutesOverAnHour;
         double totalPrice;

         System.out.print("Enter the rental contract number: ");
         contractNumber = input.nextLine();

         System.out.print("Enter hours rented: ");
         hoursOfRental = input.nextInt();

         System.out.print("Enter the minutes over the hours rented: ");
         minutesOverAnHour = input.nextInt();
         
         
         RentalContract rental = new RentalContract();
         
         System.out.println("\nContract Number: " + rental.getContractNumber());
         System.out.println("Hours Rented: " + rental.getHoursOfRental());
         System.out.println("Minutes over the hours rented: " + rental.getMinutesOverHour());
         System.out.printf("Total price for the contract: $%.2f\n", rental.getTotalPrice());
         input.close();
	
          
	}
}