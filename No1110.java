import java.util.*;
public class No1110 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a =sc.nextInt();
		int b=a;
		int c=0;
		while(true) {
			b = (b%10)*10+(((b/10)+(b%10))%10);
			c+=1;
			if(a == b) {
				System.out.println(c);
				break;
			}
		}
		
		sc.close();		

	}

}
