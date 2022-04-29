import java.util.Scanner;



public class RegistrationForm {
	private String name;
	private String dateOfBirth;
	private String streetNumberAndName;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String gender;
	private int count = 0;
	
	
// Default Constructor	
public RegistrationForm (){
		name = null;
		dateOfBirth = null;
		streetNumberAndName = null;
		city = null;
		state = null;
		zipcode = null;
		phoneNumber = null;
		gender = null;		
	}

// Constructor that takes in name, date of birth, address number, street name, gender, and phone number	
public RegistrationForm(String n, String d, String s, String c, String st, String z, String p, String g) {
		name = n;
		dateOfBirth = d;
		streetNumberAndName = s;
		city = c;
		state = st;
		zipcode = z;
		phoneNumber = p;
		gender = g;
				
	}

//get methods for private instance variables
public String getName () {
	return name;	
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public String getStreetName() {
	return streetNumberAndName;
}

public String getCity() {
	return city;
}

public String getState() {
	return state;
}

public String getZipcode() {
	return zipcode;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public String getGender() {
	return gender;
}

public String toString() {
	
	// Get count of city to format next line
	for (int i = 0; i < city.length(); i++) {
		count++;
	}
	
	count += 9;
		
	return "Name: " + name + "\nAddress: " + streetNumberAndName + String.format("\n%" + count + "s" , city)  + ", " + state + " " + zipcode + "\nPhone Number: " + phoneNumber + "\nGender: " + gender;
}

public static void main (String [] args) {
	String userName;
	String userDateOfBirth;
	String userStreetNumberAndName;
	String userCity;
	String userState;
	String userZipcode;
	String userPhoneNumber;
	String userGender;
	
	// Create Scanner object
	Scanner scnr = new Scanner(System.in);
	
	// Get user input name
	System.out.println("What is your name?");
	userName = scnr.nextLine();
	
	// Get user input date of birth
	System.out.println("What is your date of birth (enter in the format mm/dd/yyyy)?");
	userDateOfBirth = scnr.nextLine();
	
	// Get user address number and street name
	System.out.println("What is your street address?");
	userStreetNumberAndName = scnr.nextLine();
	
	// Get user city
	System.out.println("What is your city?");
	userCity = scnr.nextLine();
	
	// Get user state
	System.out.println("What is your state?");
	userState = scnr.nextLine();
	
	// Get user zipcode
	System.out.println("What is your zipcode?");
	userZipcode = scnr.nextLine();
	
	// Get user phone number
	System.out.println("What is your phone number (enter in the formmat ***-***-****)?");
	userPhoneNumber = scnr.nextLine();
	
	// Get user gender
	System.out.println("What is your gender (M/F)?");
	userGender = scnr.nextLine();
	
	RegistrationForm mine = new RegistrationForm (userName, userDateOfBirth,userStreetNumberAndName, userCity, userState, userZipcode, userPhoneNumber, userGender);
	
	System.out.println(mine);
	

}
}
