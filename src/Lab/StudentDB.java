package Lab;

public class StudentDB {

	private String name;
	private String email;
	private static String id = "123";
	private String ssn;
	private String phone = "not communicated";
	private String city = "not communicated";
	private String state = "not communicated";
	private String userId;
		
    StudentDB(String name, String ssn){
    this.email = name.toLowerCase()+"@lab2.edu";
    	this.name = name;
    	this.ssn = ssn;
    	double randomNumber = (Math.random())*10000;
    	String randomNumber2 = Double.toString(randomNumber);
    userId = id + randomNumber2;
    	
    }
		
    public void enroll(String Id) {
    	
    
   
    	
    }
    
    public void pay() {
    	
    	System.out.println("Your tuition has been PAID");
    }
    
    public void showCourses() {
    	System.out.println("You are now enrolled with the following\n Name: " + name + "\n User Id: "+ userId +" \n email: " + email + " \n Phone: "+ phone +" \n City: " + city +" \n" );
    	System.out.println("You will following courses: Economics, Entrepreneurship, Maths");
    }
    
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		StudentDB.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
   
    

}
