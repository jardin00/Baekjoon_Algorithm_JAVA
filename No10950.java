import java.util.Scanner;
public class No10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int i;
        int b[] = new int[a];
        int c[] = new int[a];
        
        for(i=0; i<a; i++) {
        	b[i] = sc.nextInt();
        	c[i] = sc.nextInt();
        }
        for(i=0; i<a; i++) {
        	System.out.println(b[i]+c[i]);
        }
    }
}
