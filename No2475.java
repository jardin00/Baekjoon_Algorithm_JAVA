import java.util.*;
public class No2475 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a=0;
		int b[]=new int[5];
		
		for(int i=0; i<5;i++) {
			b[i]=sc.nextInt();
			a = a + (b[i]*b[i]);
		}
		System.out.println(a%10);
		sc.close();
	}
}
