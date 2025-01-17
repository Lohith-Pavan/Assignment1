package Test;

public class PrintWordsWithEvenLength {
     public static void main(String []args) {
    	 String a = "i am Geeks for Geeks and a Geek";
    	 String b[] = a.split(" ");
    	 for (int i=0;i<b.length;i++) {
    		 if (b[i].length() % 2 == 0) {
    			 System.out.print(b[i] + " ");
    		 }
    	 }
     }
}
