package Arrays;

public class String2InString1 {
     public static void main(String []args) {
    	 String a = "this is java";
    	 String b = "java";
    	 String c[] = a.split(" ");
    	 boolean flag = false;
    	 for (int i=0;i<c.length;i++) {
    		 if(c[i].equals(b)) {
    			 flag = true;
    		 }
    	 }
    	 System.out.println(flag);
     }
}
