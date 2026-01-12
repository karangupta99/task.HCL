package seleniumDemo;

public class OOps {
	
	public int dd;
	int mm;
	int yy;
	
	private int  roll;
	private String name;
	
	public void setData(int roll , String name ) {
		this.roll = roll;
		this.name = name;
	}
	public static void printData(int r, String n) {
		System.out.println(r);
		System.out.println(n);
		
		
	}
	
	OOps(int dd, int mm, int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	 void getDate(int ddd, int mm , int yy) {
		System.out.println(dd);

		System.out.println(mm);

		System.out.println(yy);
	}
	
	 static void  getDates(int dd, int mm, int yy) {

			System.out.println(dd);

			System.out.println(dd);

			System.out.println(dd);
	 }
public static void main(String[] args) {
	
	OOps o = new OOps(26,5,2025); 
	OOps.getDates(25,5,2025);
	o.getDate(25,5,2025);
	o.setData(106, "karan");
	OOps.printData(106, "karan");
}
}
