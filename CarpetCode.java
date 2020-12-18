package assignment1;
import java.util.Scanner;
public class CarpetCode {

	   public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double price = 0.0, ExtraPrice = 0.0, totalsqmPrice = 0.0, CarpetPrice = 0.0, PricePersqm = 4.0, Finalcost = 0.0, PricewithLength = 0.0;
		String choice = "";
		int opt = 0, length = 0, noItems = 0;
		
		for (int i = 0; i < 3; i++)
		{System.out.print("\n\n\tPlease select the carpet you wish to order:");
		
		System.out.print("\n\n\t1  Vienna Sandstone     £12.59");
		System.out.print("\n\t2  Chicago Thunderstorm   £14.39");
		System.out.print("\n\t3  Seattle Latte          £17.59");
		System.out.print("\n\t4  Cairo Brushed Cotton   £19.59");
		System.out.print("\n\t5  Toronto Lavastone      £20.99");
		System.out.print("\n\n\t(Select 0 to quit menu)");
		System.out.print("\n\n\tPlease enter selection: ");
		opt = key.nextInt();
		if (opt != 0){noItems++;switch (opt)
		{case 0:price = 0.00;choice += "\tNo selection has been made";
		
		break;case 1:
		price = 12.59;
		choice += "\tVienna Sandstone";
		
		break;case 2:
		price = 14.39;
		choice += "\tChicago Thunderstorm";
		
		break;case 3:price = 17.59;
		choice += "\tSeattle Latte";
			
		break;case 4:price = 19.59;
		choice += "\tCairo Brushed Cotton";
		
		break;case 5:price = 19.59;
		choice += "\n\tToronto Lavastone";
		
		break;
		}CarpetPrice += price;}
		
		else if (opt == 0){
		System.out.printf("\n\n\tCarpetCost:  £%5.2f", CarpetPrice);
		
		break;
		
		}}if (noItems != 0)
		{
		 System.out.print("\n\tPlease enter the length of the carpet you wish to order in square metres (sq m): ");
		 length = key.nextInt();
		    
		 totalsqmPrice = length * PricePersqm;
		 
		 PricewithLength = totalsqmPrice * CarpetPrice;
		    
		 if (length <= 20)
		    totalsqmPrice = 125.00;
		    
		 if (length >= 20 && length <= 40)
			 totalsqmPrice = 200.00;
		    
		 else totalsqmPrice = 200.00 + PricePersqm * length;
		    
		 System.out.print("\n\tThe price for your carpet size is:" + PricewithLength);
		    
		System.out.printf("\n\n\tTotal Cost:  £%5.2f", CarpetPrice);
		System.out.print("\n\n\tWould you like any additional extras to your carpet? Please select one of the following options:");
		System.out.print("\n\n\t1  Super 8mm Underlay        £49.99");
		System.out.print("\n\t2  High Density 11mm Underlay  £89.99");
		System.out.print("\n\t3  Carpet Grippers             £9.95");
		System.out.print("\n\t4  None");
		System.out.print("\n\n\tPlease enter option required: ");
		opt = key.nextInt();
		
		if (opt == 1)
			{ExtraPrice = 49.99;
			choice += "\n\tSuper 8mm Underlay";}
			
		if (opt == 2)
			ExtraPrice = 89.99;
			choice += "\n\tHigh Density 11m Underlay";
			
		if (opt == 3)
			ExtraPrice = 9.95;
			choice += "\n\tCarpet Grippers";
			
	    if (opt ==4)
				ExtraPrice = 0;
		choice += "\n\tNone";
		
		}
		
		else
			System.out.print("\n\tInvalid option entered!");
		
		Finalcost = PricewithLength + ExtraPrice;
	    		
	    System.out.print("\n\tThe final cost for your carpet is: £" +Finalcost);
		}
		}
	
	
