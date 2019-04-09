import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.*;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		Date date= new Date();
//		LocalTime time=LocalTime.now();
//		String std="1515";
//		int x=Integer.parseInt(std);
//		float y=Float.parseFloat(std);
//		System.out.println(x);
//		System.out.println(y);
//		//System.out.println("Today date"+date.toString());
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//		DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm:ss");
//	    String strDate= formatter.format(date);  
//	    System.out.println("Date and Time:"+strDate); 
//	    Random rand = new Random();
//	    int n = rand.nextInt(100);
//	    n += 1;
//	    System.out.println("Random:"+n);
//	    System.out.println("Local Time:"+time);
//	    System.out.println("new time format: "+tf.format(time));
		
		String name[]=Student.array;
		String first=name[0].trim();
		String a=first.toLowerCase();
		boolean first1=a.startsWith("ra");
		boolean last=name[4].startsWith("017");
		boolean emp1=first.isEmpty();
		int ind=name[1].indexOf("e");
		String new1=name[1].replace("cse", "EEE");
		System.out.println(ind);
		System.out.println(new1);
		if(emp1==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(first1==true)
		{
			System.out.println("valid name!");
		}
		else
		{
			System.out.println("invalid name!");
		}
		
		for(int i=0;i<name.length;i++)
		{
		  System.out.println(name[i]);
		}
		
		 int number = 10;
	      String result;
	      
	      result = (number<0) ? "Operation successfull" : "dead";
	      System.out.println(number + " is " + result);
	
	}

}
