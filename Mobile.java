package week1.day1;

public class Mobile 
{
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.saveContact();
		mob.sendMessage();
		mob.makeCall();
		
	}
	public void saveContact() {
		System.out.println("contact saved sucessfully");		
	}

	void sendMessage() {
		String message = "Hi All";
		System.out.println(message);
				
	}
	public long makeCall() {
		long number = 9876543210L;
		System.out.println("dialing number");
		return number;		
	}
}
