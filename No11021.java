import java.util.Scanner;
public class No11021 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int i,j;
        int b[] = new int[a];
        int c[] = new int[a];
        		
        for(i=0; i<a; i++) {
        	b[i] = sc.nextInt();
        	c[i] = sc.nextInt();
        }
        
        for(j=0; j<a; j++) {
        	System.out.println("Case #"+(j+1)+": "+(b[j]+c[j]));
        }
        
        sc.close();
    }
}
