public class StringOperations {
public static void main(String[] args) {

	String name = "wali";
	name = name.replace("w", "A");
	name = name.replace("i" , "Z");

	String url = "www.google.com";
	url = new String("www.google.com");
	//System.out.println(url.length(0) + "a");
	//String url = new String("www.google.com");
	url = url.concat("1331");
	// Stings are immutable so must be re-assigned.
	//String newURL = url.substring(0, "1331");

	//System.out.println(url);	
	
	//System.out.println("url: " + url);
	System.out.println("name: " + name);
	}
}
