/**
 * 
 */
package user.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yunting Wang
 *
 */
public class UserInfomation {
	ArrayList <UserList> userList = new ArrayList <>();
	Scanner kb = new Scanner(System.in);
	String dataPath = "res\\userData.txt";
	public UserInfomation() throws IOException {
		//loadData(dataPath);
		if(loing()) {
			System.out.println("Login Success");
			System.out.println("Welcome to Initial Power.");
		}else{
			System.out.println("Sorry, id or password is incorrect. Please check it.");
			System.out.println("If you are not our customer, welcome to join Initial Power for createing your income.");
		}
	}
	private boolean loing() throws IOException {
		//get userID;
		System.out.println("Typing userID:");
		String id = kb.nextLine();
		while( id.isEmpty() || !id.matches("[0-9] {4}")) {
			System.out.println("Please typing 4 digits: ");
			id = kb.nextLine();
		}
		if(searchingUser(id)) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean searchingUser(String id) throws IOException {
		String line ="";
		BufferedReader bfReader = new BufferedReader(new FileReader(dataPath));
		line = bfReader.readLine();
		while(line != null) {
			String field [] = line.split(",");
			if(field[0].equals(id)) {
				userList.add(new UserList(field[0],field[1],field[2],field[3],field[4],field[5], field[6], field[7], field[8]));
			}
		}
		if(!userList.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
			
	}
		
}
