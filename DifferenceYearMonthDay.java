//Pre-Assignment #6// 
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.Period; 


public class DifferenceYearMonthDay {
	private static Scanner in;
	private static SimpleDateFormat dayMonthYear;

	public static void main(String[] args) {
		int year1, year2, month1, month2, day1, day2;
		in = new Scanner(System.in);
		
		System.out.println("Enter the first date ");
		//captured input and stored in year1, month1, day1
		year1 = in.nextInt();
		month1 = in.nextInt();
		day1 = in.nextInt();
		//formating the dates
		dayMonthYear = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter the second date ");

		//captured input and stored in year2, month2, day2
		year2 = in.nextInt();
		month2 = in.nextInt();
		day2 = in.nextInt();
		
		//using LocalDate class to store date1 and date2
		LocalDate date1 = LocalDate.of(day1, month1, year1);
		
		LocalDate date2 = LocalDate.of(day2,  month2,  year2);
		
        //Using Period class to find the difference in dates
		Period p = Period.between(date1,  date2);
		
		//used to print out number of days, months and years after finding the difference
		System.out.println(p.getDays() + "days," + p.getMonths() + "months," + p.getYears() + "years");
	
	}
		
}