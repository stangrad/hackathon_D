/**
 * 
 */
package user.model;

import java.io.BufferedReader;
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

		loadData(dataPath);
		//get the data of single user
		String id="6848";
		singleUser(id);
	}
	
	
	private void loadData(String filePath) throws IOException {
		String line ="";
		BufferedReader bfReader = new BufferedReader(new FileReader(filePath));
		//header
		line = bfReader.readLine();
		//data starting
		line = bfReader.readLine();
		while(line != null) {
			String field [] = line.split(",");
			userList.add(new UserList(field[0],field[1],field[2],field[3],field[4],field[5], field[6], Double.parseDouble(field[7]), Double.parseDouble(field[8])));
			line = bfReader.readLine();
		}
		//printOut();
	}

	
	private ArrayList<UserList> singleUser(String id){
		ArrayList <UserList> singleUser = new ArrayList <>();
		for(int i=0; i<userList.size(); i++) {
			if(userList.get(i).getId().matches(id)){
				singleUser.add(userList.get(i));				
			}			
		}
		return singleUser;		
	}
	
/*	
	private void verifyUser(String id) throws IOException {
		String line ="";
		BufferedReader bfReader = new BufferedReader(new FileReader(dataPath));
		// header
		line = bfReader.readLine();
		// data starting
		line = bfReader.readLine();

		while(line != null) {
			String field [] = line.split(",");
			if(field[0].equals(id)) {
					userList.add(new UserList(field[0],field[1],field[2],field[3],field[4],field[5], field[6], Double.parseDouble(field[7]), Double.parseDouble(field[8])));
	
				}
			}
			line = bfReader.readLine();
	}
	*/		


	private void printOut() {
		for (UserList e : userList) {
			System.out.println(e);

		}
	}
}
