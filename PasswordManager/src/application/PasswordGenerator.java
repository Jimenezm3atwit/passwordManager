package application;

import java.util.Random;

public class PasswordGenerator {
	public String generatePassword(int length, boolean hasSpecialCharacters, Random gen) {
		String password = "";
		
		if (hasSpecialCharacters) {
			for (int i = 0; i < length; i++)
				password += (char) (gen.nextInt(97) + 33);
		} else {
			for (int i = 0; i < length; i++) {
				if (gen.nextInt(2) == 0)
					password += (char) (gen.nextInt(26) + 65);
				else
					password += (char) (gen.nextInt(26) + 97);
			}
		}
		
		return password;
	}
}
