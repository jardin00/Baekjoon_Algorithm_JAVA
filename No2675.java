import java.util.*;
public class No2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int k=0; k<a; k++) {
			int R = sc.nextInt();
			String S =sc.next();
			
			for(int i=0; i<S.length();i++) {
				for(int j =0;j<R;j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
		sc.close();

	}
}
