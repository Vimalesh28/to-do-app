package TodoApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class Readfile {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\TodoApp\\src\\TodoApp\\Todoclass.java");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			System.out.print("File not found Exception");
		}
	}
}
