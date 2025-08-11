package labsession;

class PaymentEg {
	public void pay() {
		System.out.println("Payment is not specified");
		
	}
class Creditcard extends PaymentEg{
	

	public void pay() {
		System.out.println("Payment is not specified");
		
	}
}
class Upi extends PaymentEg{	
	public void pay() {
		System.out.println("Payment is not specified");
		
	}
}
class Netbanking extends PaymentEg{
	public void pay() {
		System.out.println("Payment is not specified");
		
	}
}
public class TestMethods{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentEg p1 = new Creditcard();
		PaymentEg p2 = new Upi();
		PaymentEg p3 = new Netbanking();
		
		p1.pay();
		p2.pay();
		p3.pay();
	}
}
}
