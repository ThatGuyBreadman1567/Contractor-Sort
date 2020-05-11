import java.util.Scanner;

public class ContractorSort {

	public static void main(String[] args) 
	{
		/*
		 * In this program you will give the user to sort the list of rated contractors by
		 * name alphabetically ascending(A-Z), alphabetically descending(Z-A), rating 
		 * ascending (lowest to highest), and rating descending (highest to lowest)
		 * 
		 */
		
		/*
		 * create the list called allContractors
		 */
		
		String[] contractors = {"John Smith", "Danny Smith", "Joe and Sons", "Big Brothers", "Charly's", "Elaine and Barb",
				"Tommy Tubberson", "Jose and Family", "Jen's Crew", "Zach and Zeb", "Dante's Contracting"};
		
		int[] ratings = {5, 6, 4, 9, 3, 9, 7, 8, 2, 5, 8};
		
		RatedContractor[] allContractors= new RatedContractor[11];
		
		for(int i = 0; i < contractors.length; i++)
		{
			allContractors[i] = new RatedContractor(contractors[i],ratings[i]);
		}
		
		
		/*
		 * Interact with the user to determine how to sort
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Would you like to sort by (C)ontractor or (R)ating: ");
		String ratedBy = in.nextLine();
		
		System.out.print("Would you like to sort in (A)scending or (D)escending order: ");
		String sortOrder = in.nextLine();
		
		/*
		 * -----------------Read the above code to understand what is happening-----------------
		 * -----------------Don't edit the code above-------------------------------------------
		 * 
		 * Below you will use the responses from the user to sort the list and display the
		 * contractor name followed by two tabs followed by the rating
		 * They should be displayed one on each line.
		 * 
		 */

	}

}
