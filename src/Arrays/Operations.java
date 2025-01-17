package Arrays;
import java.util.*;
public class Operations {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number :");
	   int n1 = sc.nextInt();
	   System.out.println("Enter Operation :");
	   char c = sc.next().charAt(0);
	   System.out.println("Enter the second number: ");
	   int n2 = sc.nextInt();
	   switch (c){
	   case '+':
		   System.out.println("Result is :" + (n1 + n2));
           break;
	   case '-':
		   System.out.println("Result is :" + (n1 + n2));
           break;
	   case '*':
		   System.out.println("Result is :" + (n1 * n2));
           break;
	   case '/':
		   System.out.println("Result is :" + (n1 / n2));
           break;
	   case '%':
		   System.out.println("Result is :" + (n1 % n2));
		   break;
	   default :
		   System.out.println("Invalid operator");
	   }
   }
}
