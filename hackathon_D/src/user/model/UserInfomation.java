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
	ArrayList<UserList> userList = new ArrayList<>();
	Scanner kb = new Scanner(System.in);
	String dataPath = "res\\userData.txt";

	public UserInfomation() throws IOException {
<<<<<<< HEAD
		// loadData(dataPath);
		if (loing()) {
			System.out.println("Login Success");
			System.out.println("Welcome to Initial Power.");
		} else {
			System.out.println("Sorry, id or password is incorrect. Please check it.");
			System.out.println("If you are not our customer, welcome to join Initial Power for createing your income.");
=======
		//loadData(dataPath);
		if(loing()) {
			//System.out.println("Login Success");
			//System.out.println("Welcome to Initial Power.");
		}else{
			//System.out.println("Sorry, id or password is incorrect. Please check it.");
			//System.out.println("If you are not our customer, welcome to join Initial Power for createing your income.");
>>>>>>> refs/remotes/origin/master
		}
	}

	public String UserInfomation1() throws IOException {
		// loadData(dataPath);
		if (loing()) {
			return "Login Success\n" + "Welcome to Initial Power.";
		} else {
			return "Sorry, id or password is incorrect. Please check it.\n"
					+ "If you are not our customer, welcome to join Initial Power for createing your income.";
		}
	}

	private boolean loing() throws IOException {
<<<<<<< HEAD
		// get userID;
		System.out.println("Typing userID:");
=======
		//get userID;
		//System.out.println("Typing userID:");
>>>>>>> refs/remotes/origin/master
		String id = kb.nextLine();
<<<<<<< HEAD
		while (id.isEmpty() || !(id.matches("[0-9]{4}"))) {
			System.out.println("Please typing 4 digits: ");
=======
		while( id.isEmpty() || !(id.matches("[0-9]{4}"))) {
			//System.out.println("Please typing 4 digits: ");
>>>>>>> refs/remotes/origin/master
			id = kb.nextLine();
		}
		//System.out.println("Please typing pw, 6 digits:");
		String pw = kb.nextLine();
<<<<<<< HEAD
		while (!pw.matches("[a-zA-Z0-9]{6}")) {
			System.out.println("Please type 6 digits(Caption, small letter, and number is mixed.");
		}
		if (verifyUser(id, pw)) {
=======
		while(!pw.matches("[a-zA-Z0-9]{6}")) {
			//System.out.println("Please type 6 digits(Caption, small letter, and number is mixed.");
		}		
		if(verifyUser(id, pw)) {
>>>>>>> refs/remotes/origin/master
			return true;
		} else {
			return false;
		}
	}

	private boolean verifyUser(String id, String pw) throws IOException {
		String line = "";
		BufferedReader bfReader = new BufferedReader(new FileReader(dataPath));
		// header
		line = bfReader.readLine();
		// data starting
		line = bfReader.readLine();
<<<<<<< HEAD
		while (line != null) {
			String field[] = line.split(",");
			// System.out.printf("[TP_1]id=%s, pw=%s\n",id,pw);
			// System.out.printf("[TP_2]id=%s, pw=%sn",field[0], field[8]);
			if (field[0].equals(id)) {

				if (field[8].equals(pw)) {
					userList.add(new UserList(field[0], field[1], field[2], field[3], field[4], field[5], field[6],
							field[7], field[8]));
=======
		while(line != null) {
			String field [] = line.split(",");
			if(field[0].equals(id)) {
				
				if(field[8].equals(pw)) {
					userList.add(new UserList(field[0],field[1],field[2],field[3],field[4],field[5], field[6], field[7], field[8]));
>>>>>>> refs/remotes/origin/master
				}
			}
			line = bfReader.readLine();
		}
		if (!userList.isEmpty()) {
			bfReader.close();
			return true;
		} else {
			bfReader.close();
			return false;
		}

	}

	private void printOut() {
		for (UserList e : userList) {
			System.out.println(e);

		}
	}
}
