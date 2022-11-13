/**
* Name: Frances Loise Quijano
* Section: Devotion 
* Year: 4nd Year
*/

package hardcoding;
import java.util.Scanner;

public class Main{

  public static void main(String[]args) {
  
  Scanner console = new Scanner(System.in);
  
  
  String orderCart = "Your orders are the following: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("==========WELCOME TO KULAFS TAMBAYAN! ========");
  System.out.println("| DO YOU WANT TO ORDER? [1-YES, 2-NO]            |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  respondToOrder = console.nextInt(); 
  
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("==========WELCOME TO MISERY SHOT TAMBAYAN! ========");
	  System.out.println("|WHAT TO ORDER? [1-FOODS, 2- BEVERAGES , 3-SNACKS|");
	  System.out.println("| Enter the number for your choice below         |");
	  System.out.println("==================================================");
	  System.out.print  ("Choice:");
	  orderCategory = console.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("==========WELCOME TO KULAFS TAMBAYAN!  ========");
	    System.out.println("|***************ORDER FOOD***********************|");
	    System.out.println("| [1] Spicy Chicken + 1 Rice         : P150.00   |");
	    System.out.println("| [2] Unli Sisig + Pork Barbeque     : P250.00   |");
	    System.out.println("| [3] LECHON MANOK                   : P400.00   |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    float Spicy Chicken + 1 Rice = 150, Unli Sisig + Pork Barbeque = 250, LECHON MANOK = 400;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Spicy Chicken + 1 Rice: P150.00 added to cart");
		  totalPayment+=Spicy Chicken + Unli-Rice;
		  String order1 = "Spicy Chicken + Unli-Rice: P150.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Unli Sisig + Pork Barbeque  : P250.00  added to cart");
		  totalPayment+=Unli Sisig + Pork Barbeque ;
		  String order2 = "Unli Sisig + Pork Barbeque         : P250.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("LECHON MANOK      : P400.00 added to cart");
		  totalPayment+=Crispy Pata;
		  String order3 = "Crispy Pata     : P400.00 \n";
		  orderCart+=order3;
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("==========WELCOME TO MISERY SHOT TAMBAYAN! ========");
	    System.out.println("|***************ORDER BEVERAGE********************|");
	    System.out.println("| [1] 1-Case of Red Horse Jumbo      : P500.00    |");
	    System.out.println("| [2] 1-Tower of Gsm Blue            : P250.00    |");
	    System.out.println("| [3] Gin Mix                        : P150.00    |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float redhorse = 500 , Gsmblue = 250, Gin = 150;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1-Case of Red Horse Jumbo : P500.00 added to cart");
		  totalPayment+=redhorse;
		  String order1 = "1-Case of Red Horse Jumbo : P500.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1-Tower of Gsm Blue  : P250.00 added to cart");
		  totalPayment+=bnbp;
		  String order2 = "1-Tower of Gsm Blue  : P250.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Gin Mix     : P150.00  added to cart");
		  totalPayment+=kulafu;
		  String order3 = "Gin Mix        : P150.00 \n";
		  orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    System.out.println("==========WELCOME MISERY SHOT TAMBAYAN! ========");
	    System.out.println("|*************ORDER SNACKS / PULUTAN*************|");
	    System.out.println("| [1] Sisig                         : P120.00    |");
	    System.out.println("| [2] Crispy Chicken Skin           : P150.00    |");
	    System.out.println("| [3] Crispy Fried Isaw             : P100.00    |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float Sisig = 150 ,  Crispy Chicken Skin = 150, Crispy Fried Isaw  = 100;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Sisig                         : P120.00  added to cart");
		  totalPayment+=Sisig
		  String order1 = "Sisig                         : P120.00  \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Crispy Chicken Skin           : P150.00  added to cart");
		  totalPayment+=Crispy Chicken Skin;
		  String order2 = "Crispy Chicken Skin           : P150.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println(" Crispy Fried Isaw             : P100.00 added to cart");
		  totalPayment+= Crispy Fried Isaw;
		   String order3 = "Crispy Fried Isaw             : P100.00 \n";
		   orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Okay! Have a safe shots!~ ??");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = console.nextInt();
   
    
  } while(respondToOrder == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = console.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(orderCart);
     System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you come again!");
  
  
  
  
  

  }


}