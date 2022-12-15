import java.util.Scanner;
public class No2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0) {
			if(m>=45) {
				System.out.println("0" + " " + (m-45));
			}
			else {
				int a = 24*60 + m - 45;
				System.out.println(a/60 + " " + a%60);
			}
		}
		else {
			int a = h*60 +m - 45;
			System.out.println(a/60 + " " + a%60);
		}
  }
}
