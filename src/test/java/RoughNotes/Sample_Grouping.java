package RoughNotes;

import org.testng.annotations.Test;

public class Sample_Grouping {
	@Test(groups = "social")
     private void whatsApp() {
	 System.out.println("WhatsApp");
	}
	@Test(groups = "social")
     private void teleGram() {
	System.out.println("Telegram");
	}
	@Test(groups = "shopping")
     private void amazon() {
	System.out.println("Amazon");
	}
	@Test(groups = "shopping")
     private void flipkart() {
	System.out.println("Flipkart");
	}
	@Test(groups = "wallet")
     private void gPay() {
		System.out.println("GooglePay");
	}
	@Test(groups = "wallet")
     private void mobiKwik() {
	System.out.println("Mobikwik");
	}
}
