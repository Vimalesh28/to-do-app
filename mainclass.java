package jsonnew;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONObject;

import jsonnew.Main.severity;

public class mainclass {
	public enum Severity {
		HIGH, LOW, MEDIUM
	}

	private static class Todo {
		String name;
		Date duedate;
		Severity severity;

		@Override
		public String toString() {
			return "Todo [name=" + name + ", duedate=" + duedate + ", severity=" + severity + "]";
		}

	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			Todo todo = convertStringToTodo(input);
			JSONObject todoJson = convertTodoToJSON(todo);
			writeFile(todoJson);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void writeFile(JSONObject todoJson) {

		try {
			BufferedWriter f_writer = new BufferedWriter(
					new FileWriter("C:\\Users\\HP\\eclipse-workspace\\jsonfile\\file.text"));
			f_writer.write(todoJson.toString());
			f_writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static JSONObject convertTodoToJSON(Todo todo) {
		// TODO Auto-generated method stub
		System.out.println(todo.toString());
		JSONObject json = new JSONObject();
		json.put("name", todo.name);
		json.put("date", todo.duedate.toString());
		json.put("Sevity", todo.severity.toString());
		return json;
	}
private static Todo convertStringToTodo(String input)  {
		Todo todo = new Todo();
		
		String[] array = input.split("#");
		SimpleDateFormat Dateformat;
		todo.name = array[0];
		Dateformat = new SimpleDateFormat("DD.MM.YY");
		try {
			todo.duedate = Dateformat.parse(array[1]);
		} catch (Exception e) {
		 
			e.printStackTrace();
			System.exit(0);
			}

		try {
		todo.severity = Severity.valueOf(array[2]);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return todo;
}}
		//return todo;}}