import java.util.*;
public class No10817 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0; i<3;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[1]);
		sc.close();
	}
}
