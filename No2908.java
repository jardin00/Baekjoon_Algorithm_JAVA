import java.util.*;
public class No2908 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]=new int[2];
		int b=sc.nextInt();
		int c=sc.nextInt();
		a[0]=(b/100)+((b/10)%10)*10+(b%10)*100;
		a[1]=(c/100)+((c/10)%10)*10+(c%10)*100;
		if(a[0]<a[1]) {
			System.out.println(a[1]);
		}else {
			System.out.println(a[0]);
		}
		sc.close();
	}
}
