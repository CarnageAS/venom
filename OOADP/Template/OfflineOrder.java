import java.util.Scanner;

public class OfflineOrder extends OrderProcessing {
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
		System.out.println("Make payment of:"+item.price+" through:\n1:Card\n2:Paytm\n3:Cash\n");
		System.out.print("Enter Your Choice: ");
		int i = sc.nextInt();
		switch(i) {
		case 1:card();
			System.out.println("Card Transaction Successful");
			break;
		case 2:payTm();
			System.out.println("Paytm Transaction Successful");
			break;
		case 3:cash();
		System.out.println("Cash Transaction Successful");
		break;
		
		}
		return "thanks";
	}

	private void cash() {
		// TODO Auto-generated method stub
		System.out.println("You have selected Cash");
	}

	@Override
	void doDelivery() {
		System.out.println("Please collect from the Counter!");
	}
	void card() {
		System.out.println("You have selected Card");
	}
	void payTm() {
		System.out.println("You have selected Paytm");
	}
}
