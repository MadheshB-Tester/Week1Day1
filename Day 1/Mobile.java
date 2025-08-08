package week1.day1;

public class Mobile {
    
	 public void makeCall() {
	        String mobileModel = "Samsung Galaxy S24";
	        float mobileWeight = 180.5f;
	        
	        System.out.println("Making a call...");
	        System.out.println("Mobile Model: " + mobileModel);
	        System.out.println("Mobile Weight: " + mobileWeight + " grams");
	    }

	    public void sendMsg() {
	        boolean isFullCharged = true;
	        int mobileCost = 75000;
	        
	        System.out.println("Sending a message...");
	        System.out.println("Is Fully Charged: " + isFullCharged);
	        System.out.println("Mobile Cost: ₹" + mobileCost);
	    }

	    public static void main(String[] args) {
	       
	        Mobile myMobile = new Mobile();
	        
	        myMobile.makeCall();
	        myMobile.sendMsg();
	        
	        System.out.println("This is my mobile");
	    }
	
}
