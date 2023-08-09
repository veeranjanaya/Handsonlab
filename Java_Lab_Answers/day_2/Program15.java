/*
 * 15. Accept the item code, description, qty and price of an item. Compute the total for the item. 
a. Accept the user’s choice. If the choice is ‘y’ then accept the next set of inputs for a new item and compute the total. In this manner, compute the grand total for all the items purchased by the customer. 
b. If the grand total is more than Rs. 10,000‐ then, the customer is allowed a discount of 10%. 
c. If the grand total is less than Rs. 1,000‐ and the customer chooses to pay by card,then a surcharge of 2.5% is levied on the grand total. 
d. Display the grand total for the customer in number form and in words. 
 */
package day_2;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        double grandTotal = 0.0;

	        // Accept inputs for items
	        char choice;
	        do {
	            System.out.print("Enter item code: ");
	            String itemCode = scanner.nextLine();

	            System.out.print("Enter item description: ");
	            String itemDescription = scanner.nextLine();

	            System.out.print("Enter quantity: ");
	            int quantity = scanner.nextInt();

	            System.out.print("Enter price per item: ");
	            double price = scanner.nextDouble();

	            // Compute total for the item
	            double itemTotal = quantity * price;
	            grandTotal += itemTotal;

	            scanner.nextLine(); // Clear the newline character

	            System.out.print("Do you want to add another item? (y/n): ");
	            choice = scanner.nextLine().charAt(0);
	        } while (choice == 'y');

	        // Apply discounts or surcharges
	        if (grandTotal > 10000) {
	            grandTotal *= 0.9; // Apply 10% discount
	        } else if (grandTotal < 1000) {
	            System.out.print("Do you want to pay by card? (y/n): ");
	            choice = scanner.nextLine().charAt(0);

	            if (choice == 'y') {
	                grandTotal *= 1.025; // Apply 2.5% surcharge
	            }
	        }
	        System.out.println("Grand Total: Rs. " + grandTotal);
			int temp=(int)grandTotal;
			int rev=0;
			while(temp!=0) {
				int ld=temp%10;
				rev=rev*10+ld;
				temp/=10;
			}
			while(rev!=0) {
				int ld=rev%10;
				switch(ld) {
				case 0:
					System.out.print("zero ");
					break;
				case 1:
					System.out.print("One ");
					break;
				case 2:
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eight ");
					break;
				case 9:
					System.out.print("Nine ");
					break;
				}
				rev/=10;
			}
			scanner.close();
	    }


	}
