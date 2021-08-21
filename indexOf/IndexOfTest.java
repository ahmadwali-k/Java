public class IndexOfTest {
	public static void main(String[] args) {
		String funnyString = "Computer!Science!long!walks!on!the!beach";
		//int a = funnyString.indexOf(33);
		//int b = funnyString.indexOf('!');
		//int c = funnyString.indexOf("!");
		//int d = funnyString.indexOf("!Science");
		//int e = funnyString.indexOf("!Science,!long");
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		//System.out.println(e);
		funnyString = funnyString.replace("!", "");
		funnyString = funnyString.replace("the beach","");
		funnyString = funnyString.replace(", long", "");
		funnyString = funnyString.replace("wal", "roc");
		funnyString = funnyString.toUpperCase();
		System.out.println(funnyString);

	}
}
