package Super_keyword;

public class Sample2 extends Sample1 {// BLC sublass
int a = 45;//Global variable
public void Test1() {// Declarration of the nonstatic method
	int a = 60;// Local variable
	System.out.println(a);// 60
	System.out.println(this.a);// 45
	System.out.println(super.a);//
}
}


//
