public class ArraySearch {
	public static void main(String args[]) {
		String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};
		String result = searchStringArray("polymorphism", concepts);
		System.out.println(result);
		result = searchStringArray("inheritance", concepts);
		System.out.println(result);	
		
		String[] pasttimes = {"long walks", "sunrises", "sunsets", "skipping rocks"};
		System.out.println(searchStringArray("sunsets", pasttimes));
		System.out.println(searchStringArray("breakdancing", pasttimes));
		
	}
	
	public static String searchStringArray(String target, String[] array) {
		// can also use a boolean value
		// boolean result = false;
		// result = true;
		String result = "not found";
		for (String element : array) {
			if (element.equals(target)) {
				result = "found";
				break;
			}
		}
		return result;
	}
}
