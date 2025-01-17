package Test;

public class SwapThePairsOfCharactersOfAString {
    public static void main(String [] args) {
    	String str = "Javar";
    	char b[] = str.toCharArray();
    	String rev = "";
        for (int i=0;i<b.length;i++) {
        	char temp = b[i];
        	b[i] = b[i+1];
        	b[i+1] = temp;
        	rev = rev + b[i] + b[i+1];
        	i++;
        	if ()
        }
        System.out.println(rev);
    }
}
