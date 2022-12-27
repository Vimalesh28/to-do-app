package jsonnew;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Json {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String[] input = name.split("#");
		
		JSONObject json = new JSONObject();
		json.put("name", input[0]);
		try {
			Date date = new SimpleDateFormat("DD.MM.YY").parse(input[1]);
			SimpleDateFormat format = new SimpleDateFormat("DD.MM.YY");
			String output = format.format(date);
			json.put("duedate", output);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Enum.Level level1 = Enum.Level.valueOf(input[2]);
			
			json.put("severity", level1.toString());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try (PrintWriter out = new PrintWriter(
				new FileWriter("C:\\Users\\HP\\eclipse-workspace\\jsonfile\\file.txt"))) {
			out.write(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
