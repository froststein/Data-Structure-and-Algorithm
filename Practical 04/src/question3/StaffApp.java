package question3;

public class StaffApp{

	public static void main (String[] args){

		StaffMember[] staffList = new StaffMember[6];
		double amount;
		double totalAmount=0;
		
		//------------------------------------------
		//  Sets up the list of staff members.
		//------------------------------------------
		staffList[0] = new Executive ("Sam", "123 Main Line","555-0469", "123-45-6789", 1923.07);
		staffList[1] = new Employee ("Carla", "456 Off Line","555-0101", "987-65-4321", 846.15);
		staffList[2] = new Employee ("Woody", "789 Off Rocker","555-0000", "010-20-3040", 769.23);
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 8.55);
		staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.","555-8374");
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane","555-7282");

		// invoke the awardBonus method to give $5000 to the first element
		((Executive) staffList[0]).awardBonus(5000);

		// invoke the addHours method add 40 hours to the hourly staff
		for(StaffMember staff:staffList){
			if(staff instanceof Hourly){
				((Hourly) staff).addHours(40);
			}
		}
		
		//------------------------------------------------------
		//  write the for loop to display output from the array.
		//------------------------------------------------------
		for (int count=0; count<staffList.length; count++){
			System.out.println (staffList[count]);
			amount = staffList[count].pay();
			totalAmount += amount;
			if (amount == 0.0){
				System.out.println("Thanks for working for free");
			} else{
				System.out.println ("Paid: " + amount);
			}
			if( staffList[count] instanceof Executive){

				System.out.println("Bonus: " +

                ((Executive)staffList[count]).getBonus());
			}
			else if( staffList[count] instanceof Hourly){

				System.out.println("Pay rate: " +

                ((Hourly)staffList[count]).getPayRate());
			}
			System.out.println ("---------------------------------");

		}

		// write the statement to print total pay for all staff
		System.out.printf("Total Pay for all staff: $%.2f",totalAmount);
		System.out.println ("\n"+"-----------------------------------");

	}

}
