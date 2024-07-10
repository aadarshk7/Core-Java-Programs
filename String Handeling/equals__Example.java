// for equals()
// and equalIgnoreCase()
public class equals__Example {
	public static void main(String[] args) {
		String namee="Aadarsh";
		String name = "aadu";
		String name2 = "padu";
		String name3 = "AADU";
		String name4 = "sadu";
		String name5 = "PADU";
		String name6 = "padu";
		String name7 = "aadu";
		System.out.println(name.equals(name7));    //true
		System.out.println(name.equalsIgnoreCase(name3));    //true
		System.out.println(name2.compareTo(name7));     //true
		if(name.startsWith(name7)) {
			System.out.println(name7+"true");
		}
		if(name.endsWith(name7)) {
			System.out.println(name4+"false");
		}
		System.out.println(name==name7);
		System.out.println(name.equals(name3)); //false
		System.out.println(name.equals(name5)); // false
		System.out.println(name2.equalsIgnoreCase(name3)); //false
		System.out.println(name.equalsIgnoreCase(name3));   //true
		// System.out.println(name4.equals(name));
		System.out.println("It is " +(name==name3));   //false
		System.out.println(name.compareTo(name));    //true 
		
		if (name2.startsWith(name6)) {
			System.out.println(name2);
		} else {
			System.out.println("error");
		}
		if(name2.endsWith(name5)) {
			System.out.println(name2);
		}else
			System.out.println("Can't find");
	}
}
