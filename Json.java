package jsonnew;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Json {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String todoinput = sc.nextLine();
		String[] input = todoinput.split("#");
		Todo todo = new Todo();
		JSONObject json = new JSONObject();
		todo.name = input[0];
		json.put("name", input[0]);
		try {
			todo.duedate = new SimpleDateFormat("DD.MM.YY").parse(input[1]);
			SimpleDateFormat format = new SimpleDateFormat("DD.MM.YY");
			String output = format.format(todo.duedate);
			json.put("duedate", output);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			todo.severity = Severity.valueOf(input[2]);

			json.put("severity", todo.severity.toString());
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