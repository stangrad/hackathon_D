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
		loadData(dataPath);
		if(loing()) {
			System.out.println("Login Success");
			System.out.println("Welcome to Initial Power.");
		}else{
			System.out.println("Sorry, id or password is incorrect. Please check it.");
			System.out.println("If you are not our customer, welcome to join Initial Power for createing your income.");
		}
	}
	private boolean loing() {
		// TODO Auto-generated method stub
		return false;
	}
	private void loadData(String filePath) throws IOException {
		String line ="";
		BufferedReader bfReader = new BufferedReader(new FileReader(filePath));
		line = bfReader.readLine();
		while(line != null) {
			
			
		}
		
	}
}
