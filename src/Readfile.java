package TodoApp;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Readfile {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\TodoApp\\src\\TodoApp\\Todoclass.java");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}