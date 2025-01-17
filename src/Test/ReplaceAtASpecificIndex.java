package Test;

public class ReplaceAtASpecificIndex {
      public static void main(String [] args) {
    	  String a = "Geeks Gor Geeks";
    	  int index = 6;
    	  char ch = 'F';
    	  String b = a.substring(0,index);
    	  String d = a.substring(index+1);
    	  System.out.println(b + ch + d);
      }
}
