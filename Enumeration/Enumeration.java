package enumeration;

enum Weekdays {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

public class Enumeration {

	public static void main(String[] args) {
		Weekdays wdd;
		//wd = Weekdays.Friday;
		Weekdays[] wde = Weekdays.values();
		for(Weekdays wd1: wde) {
			System.out.println(wd1);
			
			//for valueOf()
			
			wdd=Weekdays.valueOf("Monday");
			System.out.println(wdd);
		}
		//System.out.println(wd);
		//System.out.println(wde);
	}

}
