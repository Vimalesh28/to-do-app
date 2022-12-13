package TodoApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SampleJava {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);

		enum level{
			HIGH,
			MEDIUM,
			LOW
		}
		String value=sc.nextLine();
		String[] array=value.split("#");


		System.out.println(array[0]);


		try {
			Date date = new SimpleDateFormat("DD.MM.YY").parse(array[1]);
			System.out.println(date);
		} catch (ParseException e) {
			
			//e.printStackTrace();
			System.out.print("invalid date");
		}
	

       try {			
		level levelEnum =  level.valueOf(array[2]);
		System.out.print(levelEnum);
       } catch (Exception e) {   
        	System.out.print("invalid enum");
        }


	}}