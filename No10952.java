import java.util.Scanner;
public class No10952 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String s = "";
			
			while(true) {
				int b = sc.nextInt();
				int c = sc.nextInt();
				if(b==0 && c==0) {
					System.out.println(s);
					break;
				}
				else {
					s = s + (b+c) + "\n";
					
				}
			}
			
			sc.close();
		}
}
