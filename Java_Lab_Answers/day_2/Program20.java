/*
20. A vendor offers software services to a client. Each resource is billed at some dollar rate per hour. The total cost of the 
	project for the client is therefore,   the total number of hours contributed by all the vendor resources  
	the dollar rate  hour. There are however some variants. 
a. The vendor might have purchased hardware infrastructure or software licenses needed for the project. 
b. The vendor might have utilized external consultants for the project. 
c. The client looks at the vendor as a one stop solution and hence external resources employed by the vendor need to be paid
    by the vendor. 
d. It might however be possible that the vendor’s hardware and software purchases are borne by the client.
 In this case, the client pays the vendor 30% of the hardware infrastructure costs. In case of software licenses, 
 the client pays the vendor 50% of the cost, if they are commonly available and used, or 100% if the software is 
 infrequently used or is proprietary client technology. 
e. The external consultants employed by the vendor will come at a dollar rate per hour. 
f. Accept the suitable inputs and display the profits  loss realized by the vendor.
 */
package day_2;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of hours contributed by all vendor resources: ");
        int totalHours = sc.nextInt();

        System.out.print("Enter dollar rate per hour: ");
        double dollarRate = sc.nextDouble();

        System.out.print("Did the vendor purchase hardware infrastructure for the project? (yes/no): ");
        String hasHardware = sc.next();

        System.out.print("Did the vendor purchase software licenses for the project? (yes/no): ");
        String hasSoftware = sc.next();

        System.out.print("Did the vendor utilize external consultants for the project? (yes/no): ");
        String hasConsultants = sc.next();

        System.out.print("Enter the dollar rate per hour for external consultants: ");
        double ctRate = sc.nextDouble();

        System.out.print("Did the client pay for the vendor's hardware and software purchases? (yes/no): ");
        String cPFP = sc.next();

        double projectCost = totalHours * dollarRate;
        double hardwareCost = 0.0;
        double softwareCost = 0.0;

        if (hasHardware.equalsIgnoreCase("yes")) {
            System.out.print("Enter hardware infrastructure cost: ");
            hardwareCost = sc.nextDouble();
        }

        if (hasSoftware.equalsIgnoreCase("yes")) {
            System.out.print("Enter software licenses cost: ");
            softwareCost = sc.nextDouble();
        }

        if (cPFP.equalsIgnoreCase("no")) {
            
            projectCost += hardwareCost + softwareCost;
        } else {
            
            projectCost += hardwareCost * 0.3 + softwareCost * (hasSoftware.equalsIgnoreCase("yes") ? 0.5 : 1.0);
        }
        double consultantCost = 0.0;
        if (hasConsultants.equalsIgnoreCase("yes")) {
            System.out.print("Enter total number of hours contributed by external consultants: ");
            int consultantHours = sc.nextInt();
            consultantCost = consultantHours * ctRate;
            projectCost += consultantCost;
        }

        System.out.print("Enter revenue received from the client: ");
        double revenue = sc.nextDouble();
        
        double profitOrLoss = revenue - projectCost;

 
        System.out.println("Project Cost: " + projectCost);
        System.out.println("Revenue: " + revenue);
        System.out.println("Profit/Loss: " + profitOrLoss);
        sc.close();
    }

}
