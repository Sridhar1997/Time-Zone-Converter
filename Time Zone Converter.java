import java.util.*;
import java.text.*;


public class DateDemo {

   public static void main(String args[]) {
      
      SimpleDateFormat indiafmt = new SimpleDateFormat ("yyy-MM-dd HH:mm:ss z");
      indiafmt.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

      SimpleDateFormat ukfmt = (SimpleDateFormat) indiafmt.clone();
      ukfmt.setTimeZone(TimeZone.getTimeZone("Europe/London"));
      
      SimpleDateFormat lafmt = (SimpleDateFormat) indiafmt.clone();
      lafmt.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
      
      SimpleDateFormat nyfmt = (SimpleDateFormat) indiafmt.clone();
      nyfmt.setTimeZone(TimeZone.getTimeZone("America/New_York"));
      
      SimpleDateFormat bkkfmt = (SimpleDateFormat) indiafmt.clone();
      bkkfmt.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
      
      SimpleDateFormat japfmt = (SimpleDateFormat) indiafmt.clone();
      japfmt.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
      
      SimpleDateFormat perfmt = (SimpleDateFormat) indiafmt.clone();
      perfmt.setTimeZone(TimeZone.getTimeZone("Australia/Perth"));
      
      SimpleDateFormat sydfmt = (SimpleDateFormat) indiafmt.clone();
      sydfmt.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
      
      SimpleDateFormat nzfmt = (SimpleDateFormat) indiafmt.clone();
      nzfmt.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
      
      Date dnow = new Date();
      
      System.out.println("    LA Time: " + lafmt.format(dnow));
      System.out.println("    NY Time: " + nyfmt.format(dnow));
      System.out.println("    UK Time: " + ukfmt.format(dnow));
      System.out.println(" India Time: " + indiafmt.format(dnow));
      System.out.println("  Thai Time: " + bkkfmt.format(dnow));
      System.out.println(" Japan Time: " + japfmt.format(dnow));
      System.out.println(" Perth Time: " + perfmt.format(dnow));
      System.out.println("Sydney Time: " + sydfmt.format(dnow));
      System.out.println("    NZ Time: " + nzfmt.format(dnow));
   }
}
