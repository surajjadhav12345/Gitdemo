package newpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDmo {
	public static void main(String[]args) {
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat sdm= new SimpleDateFormat();
	  System.out.println(sdm.format(cd.getTime()));
		
	}

}
 