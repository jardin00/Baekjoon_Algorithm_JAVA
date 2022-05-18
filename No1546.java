import java.util.*;
public class No1546 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		double b[]=new double[a];
		for(int i =0; i<b.length;i++) {
			b[i]=sc.nextDouble();
		}
		Arrays.sort(b);
		double c = b[a-1];
		double d =0;
		for(int j=0; j<b.length;j++) {
			b[j] = (b[j]/c)*100;
			d = d + b[j];
		}				
		System.out.println(d/a);
		
		sc.close();

	}

}
