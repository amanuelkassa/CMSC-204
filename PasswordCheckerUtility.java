import java.util.ArrayList;

public class PasswordCheckerUtility {
	
	public static boolean isValidPassword(java.lang.String passwordString)
            throws LengthException,
                   NoDigitException,
                   NoUpperAlphaException,
                   NoLowerAlphaException,
                   InvalidSequenceException
            {
		boolean validity=true;
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		
		if(passwordString.length()>=6) {
		
		}else {
			
			validity=false;
			throw new LengthException("Your password is too short");
		}
		
		char password[]=passwordString.toCharArray();
		for(int i=0;i<password.length;i++) {
			if(Character.isUpperCase(password[i])) {
			uppercase++	;
			}
			if(Character.isLowerCase(password[i])) {
				
			lowercase++;	
			}
			if(Character.isDigit(password[i])) {
				digit++;
			}
			
			
		}

		
		if(uppercase==0) {
			validity=false;
			throw new NoUpperAlphaException("Uppercase required");	
		}
		else if(lowercase==0) {
			validity=false;
			throw new NoLowerAlphaException("Lowercase required");
		}
		else if(digit==0) {
			validity=false;
			throw new NoDigitException("A digit is required");
		}
	
         return validity;
         }
	public static boolean isWeakPassword(java.lang.String passwordString)  {
		boolean weak=false;
		if(passwordString.length()>=6 &&  passwordString.length()<=9) {
			weak=true;	
		}
		
		
	
	return weak;	
	}
	public static ArrayList<String> validPasswords(ArrayList<String> passwords){
		ArrayList<String> Password =new ArrayList();
		for(String passwordString:passwords) {
			try {
				
				isValidPassword(passwordString);
			}catch(LengthException|
                   NoDigitException|
                   NoUpperAlphaException|
                   NoLowerAlphaException|
                   InvalidSequenceException e) {
				Password.add(passwordString+"-----"+ e.getMessage());
			}
				
				
			
		}
		
		return Password;
		
	
	}
	}

