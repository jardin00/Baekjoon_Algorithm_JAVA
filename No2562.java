import java.util.Scanner;
public class No2562 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a[] = new int[9];
			int b=0;
			
			for(int i=0; i<9; i++) {
				a[i] = sc.nextInt();
			}
			
			int max = a[0];
			
			for(int j=0; j<9; j++) {
				if(a[j]>max) {
					max =a[j];
					b=j;
				}
			}
			
			System.out.println(max);
			System.out.println(b+1);
	
			sc.close();
		}
}
