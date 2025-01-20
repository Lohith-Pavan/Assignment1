package demo;
import java.util.*;
public class Replace {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first word :");
	  String a = sc.nextLine();
	  System.out.println("Enter Second word :");
	  String b = sc.nextLine();
	  System.out.println("Enter Third word :");
	  String c = sc.nextLine();
	  String d = a.replaceAll("[AEIOUaeiou]", "*");
	  String e = b.replaceAll("[BCDFGHIJKLMNPQRSTVWXYZbcdfghijklmnpqrstvwxyz]", "@");
	  String f = c.toUpperCase();
	  System.out.println(d+e+f);
	  
  }
}
