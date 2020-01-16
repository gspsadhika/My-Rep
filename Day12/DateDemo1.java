import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo1 
{
	public static void main(String[] args)
	{
	LocalDate date=LocalDate.now(); //This will give today's date.
	System.out.println("today's date is :"+date);
	
	int day= date.getDayOfMonth(); //For Today's day name
	int month = date.getMonthValue(); //For Today's month
	int year= date.getYear(); //For Today's Year
	System.out.println("Today is : " +day);
	System.out.println("year is :" +year);
	System.out.println("Month is: " +month);
	
	LocalDate OrientationDay= LocalDate.of(2019, 12, 28);
	System.out.println("Orientation was on: " +OrientationDay);
	if(date.equals(OrientationDay))
	{
		System.out.println("The day is same, Welcome to Cognizant");
	}
	else
	{
		System.out.println("BYE BYE");
	}
	LocalTime current= LocalTime.now(); //This will give the current time
	System.out.println("The current time is: " +current);
	
	LocalTime addTime= current.plusHours(5); //Adding 5 hours to the current time.
	System.out.println("After few hours, time will be : " +addTime); 
	
	LocalDate newDate = date.plus(2, ChronoUnit.WEEKS); //Adding 2 weeks to the current date.
	System.out.println("The date after 2 weeks from local date is : " +newDate);
	
	LocalDate yearAgo= date.minus(1, ChronoUnit.YEARS); //Removing 1 year
	System.out.println("The date an year ago is: " +yearAgo);
	
	LocalDate yearAfter= date.plus(1, ChronoUnit.YEARS); //Adding 1 year
	System.out.println("The date after an year will be: " +yearAfter);
	
	Instant instant = Instant.now(); //Current Timestamp
	System.out.println("The current timestamp is :" +instant);
	
	LocalDate myBirthday= LocalDate.of(2020, 04, 10); //Giving a date
	Period months=Period.between(myBirthday, date);
	int timeperiod= months.getMonths(); //Calculating difference between months
	System.out.println("Months between my birthday and today: " +timeperiod);
	
	Clock clock=Clock.systemUTC();
	System.out.println("This is printing the clock :"+clock);
	
	Clock defaultClock=Clock.systemDefaultZone();
	System.out.println("Default Clock: " +defaultClock);
	
	LocalDate tomorrow= LocalDate.of(2020, 01, 15);
	if(date.isBefore(tomorrow))
	{
		System.out.println("Develop"); //This statement will be printed.
	}
   if(date.isAfter(tomorrow))
   {
	System.out.println("Keep Developing");
   }
   
   if(date.isLeapYear()) //Trying to find if its a leap year
   {
	   System.out.println("This is a leap year");
   }
   else
	   System.out.println("This is not a leap year");
   

   
	
}
	
}

