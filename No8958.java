import java.util.*;
public class No8958 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s;
		
		for(int i=0; i<a; i++) {
			s = sc.next();
			int c =0;		
			int sum=0;
			
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)=='O') {
					c++;
					sum += c;
				}else {
					c=0;
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
		
		}
}
