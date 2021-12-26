package week1.day1;

public class Mobile {

		String mobileModel = "iPhone";
		int mobileWeight = 180;
		boolean isFullCharge = false;
		double mobileCost = 125000.75; 
		
		public void makeCall() {
			System.out.println("Calling");
		}
		public void sendMsg() {
			System.out.println("Message sent");
		}
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMsg();
		
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}

	}