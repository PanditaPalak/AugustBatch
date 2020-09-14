package exceptions;

public class UserRegMains {

	public static void main(String[] args) throws InvalidCountryNameException, InvalidAgeException {
		
		UserReg  user = new UserReg();
		user.registerationProfile();
	}

}
