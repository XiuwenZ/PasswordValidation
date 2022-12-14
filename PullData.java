/* Author: Xiuwen Zhu
 * This interactive program is used to verify the users' passwords by check if they meets
 * the following requirements: 
   * 	The password should be at least 8 characters
   *	The password should contain at least one uppercase and at least one lowercase letter
   *	The password should contain at least one digit
   *	The password should contain at least one of the following symbols: @*#$%?!
   * 	The password MAY NOT contain a blank
*/

public class PasswordValidation {
	
	public static void main(String[] args) throws Exception {		

		PrintWriter output = new PrintWriter("output.txt");
		
		String[] passwords = new String[50];
		
		int count = readData(passwords);
		
		String password="";
		
		//print corresponding message
		for (int i = 0; i<count;i++) {
			password = passwords[i];
			if (isValid(password,count,output))
				output.print(passwords[i]+" \tThe password is valid.\n");
			else 
				output.print(passwords[i]+" \tThe password is invalid.\n");
		}
			
		output.println("Finished reading and processing all the data.");
		output.close();
		
	}
	
}
