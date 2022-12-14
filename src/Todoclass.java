package TodoApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Todoclass {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Readfile f=new Readfile();
		String StudentDetails = f.getValue();
		String[] array = StudentDetails.split("#");
		enum stay {
			dayscholers, hostellers
		}
		System.out.println(array[0]);
		try {
			Date date = new SimpleDateFormat("DD.MM.YY").parse(array[1]);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.print("invalid date");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("date is null");
		}
		try {
			stay levelEnum = stay.valueOf(array[2]);
			System.out.print(levelEnum);
		} catch (IllegalArgumentException e) {
			System.out.print("invalid enum");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("enum is null");
		}
		
	}
}