import java.util.Scanner;

public class OnlineOrder extends OrderProcessing {
	Cycle menu;
	Scanner sc = new Scanner(System.in);
	@Override
	Item selectItem() {
		
		menu=new Cycle();
		menu.displayMenu();
		System.out.print("Enter Your Choice: ");
		int c=sc.nextInt();
		
		switch(c) {
		
		case 1:
			return menu.al.get(0);
		case 2:
			return menu.al.get(1);
		case 3:
			return menu.al.get(2);
		case 4:
			return menu.al.get(3);
			
		}
		return null;
		
				
		
	}

	@Override
	String doPayment(Item item) {
		System.out.println("You have selected "+item);
		System.out.println("Make payment of:"+item.price+" through:\n1:Card\n2:Paytm\n");
		System.out.print("Enter Your Choice: ");
		int i = sc.nextInt();
		switch(i) {
		case 1:card();
			System.out.println("Card Transaction Successful");
			break;
		case 2:payTm();
			System.out.println("Paytm Transaction Successful");
			break;
		
		}
		return "thanks";
	}

	@Override
	void doDelivery() {
		System.out.println("Item will be delivered");
	}
	void card() {
		System.out.println("You have selected Card");
	}
	void payTm() {
		System.out.println("You have selected Paytm");
	}
}
