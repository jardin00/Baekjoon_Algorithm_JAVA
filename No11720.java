import java.util.*;
public class No11720 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum =0;
		String n = new String();
		
		n = sc.next();
		char m[] = n.toCharArray();
		
		for(int i=0; i<m.length;i++) {
			sum+=((int)m[i]-48);
		}
		System.out.println(sum);
		sc.close();
	}

}
