import java.time.LocalTime;
import java.time.LocalDate;

public class TodayDate{
public static void main(String args[])
{
LocalDate date= LocalDate.now();
System.out.println("Today's date is:" +date);
LocalTime time= LocalTime.now();
System.out.println("Current time is:" +time);
}
}