import java.util.*;
public class No10872 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=0;i<a;i++) {
			b = b*(i+1);
		}
		System.out.println(b);
		sc.close();
	}
}
