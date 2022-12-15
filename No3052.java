import java.util.*;
public class No3052 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a[]=new int[42];
		for(int i=0;i<10;i++) {
			int b=sc.nextInt();
			a[b%42]+=1;
		}
		int c=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				c+=1;
			}
		}
		System.out.println(c);
		sc.close();
	}
}
