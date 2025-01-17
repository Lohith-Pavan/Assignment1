package Arrays;
import java.util.Arrays;
public class Anagram {
	public static void main(String []args) {
		
		String a = "Ramu";
		String b = "umar";
		if (a.length() == b.length()) {
			String c = a.toUpperCase();
			String d = b.toUpperCase();
			char c1[] = c.toCharArray();
			char c2[]= c.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not a anagram");
			}
		}
		else {
			System.out.println("not a anagram because of length");
		}
	}
}
