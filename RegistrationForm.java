import java.util.Scanner;



public class RegistrationForm {
	private String name;
	private String dateOfBirth;
	private String streetNumberAndName;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private String phoneNumber;
	private String bloodType;
		
// Default Constructor	
public RegistrationForm (){
		name = null;
		dateOfBirth = null;
		streetNumberAndName = null;
		city = null;
		state = null;
		zipcode = null;
		country = null;
		phoneNumber = null;
		bloodType = null;
	}

// Constructor that takes in name, date of birth, address number, street name, gender, and phone number	
public RegistrationForm(String n, String d, String s, String c, String st, String z, String co, String p, String b) {
		name = n;
		dateOfBirth = d;
		streetNumberAndName = s;
		city = c;
		state = st;
		zipcode = z;
		country = co;
		phoneNumber = p;
		bloodType = b;
				
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

public String getCountry() {
	return country;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public String getBloodType() {
	return bloodType;
}

public String toString() {
	
	// Get count of city to format next line
	int cityCount = 0;
	for (int i = 0; i < city.length(); i++) {
		cityCount++;
	}
	cityCount += 9;
	
	// Get count of Country to format next line
		int countryCount = 0;
		for (int i = 0; i < country.length(); i++) {
			countryCount++;
		}
		countryCount += 9;
		
	return "Name: " + name + "\nAddress: " + streetNumberAndName + String.format("\n%" + cityCount + "s" , city)  + ", " + state + " " + zipcode + String.format("\n%" + countryCount + "s" , country) + "\nPhone Number: " + phoneNumber + "\nBlood Type: " + bloodType;
}

public static void main (String [] args) {
	String userName;
	String userDateOfBirth;
	String userStreetNumberAndName;
	String userCity;
	String userState;
	String userZipcode;
	String userCountry;
	String userPhoneNumber;
	String userBloodType;
	
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
	
	// Get user country
		System.out.println("What is your country?");
		userCountry = scnr.nextLine();
	
	// Get user phone number
	System.out.println("What is your phone number (enter in the formmat ***-***-****)?");
	userPhoneNumber = scnr.nextLine();
	
	// Get user blood type
	System.out.println("What is your Blood Type?");
	userBloodType = scnr.nextLine();
	
	RegistrationForm mine = new RegistrationForm (userName, userDateOfBirth, userStreetNumberAndName, userCity, userState, userZipcode, userCountry, userPhoneNumber, userBloodType);
	
	System.out.println(mine);
	

}
}
