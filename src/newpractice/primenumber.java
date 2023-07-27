package newpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class primenumber {
	public static void main(String[] args) {
	 Date d = new Date();
	 SimpleDateFormat sdm= new SimpleDateFormat("M/d/yyyy");
	 System.out.println(sdm.format(d));
	 System.out.println( d.toString());//to convert readbale text use tostring method
		
	}

}
