import java.util.*;
public class No8393 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int i;
        int s = 0;
        
        for(i=0; i<a+1; i++) {
        	s = s + i;
        }
        System.out.println(s);
    }
}
