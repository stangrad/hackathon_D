package user.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestPowerUsage
{

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("inser user id: ");
		int id = in.nextInt();
		
		ArrayList<PowerUsage> data = loadHistoricUsage(id);
		
		for (PowerUsage pu: data)
			System.out.println(pu);
		
	}
	
	
	public static ArrayList<PowerUsage> loadHistoricUsage(int userId) throws IOException
	{
		ArrayList<PowerUsage> historicUsage = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("res/HistoricUsage.txt"));
		String line = br.readLine();
		line = br.readLine();
		while(line != null)
		{
			String[] column = line.split(",");
			if (Integer.parseInt(column[0]) == userId)
				historicUsage.add(new PowerUsage(Integer.parseInt(column[0]), column[1], column[2], Double.parseDouble(column[3]), Double.parseDouble(column[4])));
			
			line = br.readLine();
		}
		br.close();
		return historicUsage;
	}
	

}
