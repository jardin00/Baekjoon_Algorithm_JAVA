import java.util.*;
public class No2480 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		if(a[0]==a[1] && a[1]==a[2]) {
			System.out.println(10000+a[0]*1000);
		}else if(a[0]==a[1] || a[0]==a[2]) {
			System.out.println(1000+a[0]*100);
		}else if(a[1]==a[2]) {
			System.out.println(1000+a[1]*100);
		}else {
			Arrays.sort(a);
			System.out.println(a[2]*100);
		}
		
		
		sc.close();
	}
}
