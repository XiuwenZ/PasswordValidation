  /*testing if the password is valid by testing the conditions
	 */
	public static boolean isValid(String password, int count, PrintWriter output) {
		boolean hasDigit=false;
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean noSpace = true;
		boolean hasSpecial = false;
		boolean isValid = false;
		
		for(int i = 0; i<password.length();i++) {
			if(password.indexOf(" ") != -1)
				noSpace = false;
		}
		
		if(password.length()>=8) {
			for(int i = 0; i<password.length();i++) {
				char check = password.charAt(i);
				if(Character.isDigit(check)) 
					hasDigit= true;
					
				else if(Character.isUpperCase(check)) 
					hasUppercase = true;
					
				else if(Character.isLowerCase(check)) 
					hasLowercase = true;
				
				else if(check=='@'||check=='*'||check=='#'||check=='$'
||check=='%'||check=='?'||check=='!')
					hasSpecial = true;

			}
		}
		
		//check if the password meets all the conditions and return to the main program 
		if(hasDigit && hasUppercase && hasLowercase && noSpace && hasSpecial) {
			isValid = true;
			return isValid;
		}
		else {
			isValid = false;
			return isValid;
		
		}
	}
		
