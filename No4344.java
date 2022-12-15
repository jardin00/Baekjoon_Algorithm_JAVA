import java.util.*;
public class No4344 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a[];
			int c = sc.nextInt();
			
			for(int i=0; i<c; i++) {
				int N =sc.nextInt();
				a = new int[N];
				
				double sum = 0;
				//성적입력
				for(int j=0; j<N; j++) {
					int score = sc.nextInt();
					a[j] = score;
					sum += score;
				}
				
				double avg = (sum/N);
				double count = 0;
				
				for(int k=0; k<N; k++) {
					if(a[k]>avg) {
						count+=1;
					}
				}
				System.out.printf("%.3f%%\n",(count/N)*100);
			}
			
			sc.close();
			
			}
}
