package TodoApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Readfile {

	public String getValue() throws IOException {

		FileReader file = new FileReader("C:\\Users\\HP\\TodoFile.txt");
		BufferedReader sc1 = new BufferedReader(file);
		String value = null;
		String s = null;

		try {
			while ((value = sc1.readLine()) != null) {
				s = value;
			}
		} catch (IOException e) {
			System.out.print("user does not give input");
		}

		return s;
	}
}