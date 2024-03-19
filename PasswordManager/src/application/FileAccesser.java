package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileAccesser {
	static public ArrayList<Account> loadFile(File file) throws FileNotFoundException{
		ArrayList<Account> accounts = new ArrayList<>(100);
		Scanner fileIn = new Scanner(file);
		
		while (fileIn.hasNextLine()) {
			accounts.add(new Account(decrypt(fileIn.nextLine()), decrypt(fileIn.nextLine()), decrypt(fileIn.nextLine())));
		}
		
		fileIn.close();
		
		return accounts;
	}
	
	static public void saveFile(File file, ArrayList<Account> accounts) throws FileNotFoundException {
		PrintWriter fileOut = new PrintWriter(file);
		
		for (int i = 0; i < accounts.size(); i++) {
			fileOut.printf("%s%n%s%n%s%n", encrypt(accounts.get(i).getUsername()), encrypt(accounts.get(i).getPassword()), encrypt(accounts.get(i).getDomain())); // Saves ArrayList to file
		}
		
		fileOut.close();
	}
	
	static String encrypt(String s) {
		String encrypted = "";
		
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			
			if (c >= 33 && c <= 94) {
				encrypted += (char) (c + 31);
			} else if (c >= 96 && c <= 126) {
				encrypted += (char) (c - 63);
			} else if (c == 95) {
				encrypted += (char) (c - 62);
			} else {
				encrypted += (char) c;
			}
		}
		
		return encrypted;
	}
	
	static String decrypt(String s) {
		String decrypted = "";
		
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			
			if (c == 33) {
				decrypted += (char) (c + 62);
			} else if (c >= 34 && c <= 63) {
				decrypted += (char) (c + 63);
			} else if (c >= 64 && c <= 126) {
				decrypted += (char) (c - 31);
			} else {
				decrypted += (char) c;
			}
		}
		
		return decrypted;
	}
	
	static ArrayList<Account> searchByUsername(String username,  ArrayList<Account> accounts) {
		ArrayList<Account> results = new ArrayList<>();
		
		for (Account a : accounts) {
			if (a.getUsername().equals(username))
				results.add(a);
		}
		
		return results;
	}
	
	static ArrayList<Account> sharePasswords(String password,  ArrayList<Account> accounts) {
		ArrayList<Account> results = new ArrayList<>();
		
		for (Account a : accounts) {
			if (a.getPassword().equals(password))
				results.add(a);
		}
		
		return results;
	}
	
	static ArrayList<Account> searchByDomain(String domain, ArrayList<Account> accounts) {
		ArrayList<Account> results = new ArrayList<>();
		
		for (Account a : accounts) {
			if (a.getDomain().equals(domain))
				results.add(a);
		}
		
		return results;
	}
}
