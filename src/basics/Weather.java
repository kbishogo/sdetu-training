package basics;

public class Weather {
	
	public static void main(String[] args) {
		
		//|| for or
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			
			System.out.println("It's pleasant. Wear shorts and t-shirts");
		}
		else if((temperature > 60) && (sunCondition =="Sunny")) {
			
			System.out.println("It's a little cooler");
		}
		else {
			
			System.out.println("Looks like a cold day");
		}
		System.out.println("The program is ending");
	}

}
