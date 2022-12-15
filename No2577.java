import java.util.Scanner;
public class No2577 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt() * sc.nextInt() * sc.nextInt();
			int b[] = new int[10];
			
			while(a>0) {
				b[a%10]=b[a%10]+1;
				a = a /10;			
			}
	
			sc.close();
			
			for(int i=0; i<10; i++) {
				System.out.println(b[i]);
			}
		}
}
