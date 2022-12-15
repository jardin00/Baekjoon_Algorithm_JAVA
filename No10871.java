import java.util.*;
public class No10871 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c[]=new int[a];
		for(int i=0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		for(int j=0; j<c.length;j++) {
			if(b>c[j]) {
				System.out.print(c[j]+" ");
			}
		}
		
		sc.close();
	}
}
