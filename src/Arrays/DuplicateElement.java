package Arrays;

public class DuplicateElement {
    public static void main(String [] args) {
    	int a[] = {1,2,3,4,2,7,8,8,3};
    	for (int i=0;i<a.length-1;i++) {
    		int count = 0;
    		for (int j=i+1;j<a.length;j++) {
    			if(a[i] == a[j]) {
       				count++;
    			}
    		}
    		if (count == 1) {
    			System.out.print(a[i] + " ");
    		}
    	}
    }
}
