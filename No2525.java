import java.util.Scanner;
public class No2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int a = h*60 + m + s;
		
		if((a/60)>=24) {
			System.out.println((a/60-24)+" "+a%60);
		}
		else {
			System.out.println(a/60+" "+a%60);			
		}

  }
}
