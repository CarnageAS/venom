import java.util.Scanner;
public class OrderTemplateDemo {

	public static void main(String[] args) {
		
		Item i;
		Scanner in=new Scanner(System.in);
		System.out.println("Order Mode:-\n1:Online\n2:Offline");
		System.out.print("Enter Your Choice:");
		int c=in.nextInt();
		
		switch(c) {
			case 1:
				OnlineOrder on=new OnlineOrder();
				i=on.selectItem();
				on.doPayment(i);
				on.doDelivery();
				break;
			
			case 2:
				OfflineOrder of=new OfflineOrder();
				i=of.selectItem();
				of.doPayment(i);
				of.doDelivery();
				break;
				
			default:
				System.out.println("Invalid Choice!Exiting...");
				
				
		}


	}

}