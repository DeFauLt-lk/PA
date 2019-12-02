package lista6;
import java.util.*;
public class exercicio3 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
	
		final int Const=10;	
		int x=0,i=0, a[],b[];
		
		a= new int[Const];
		b= new int [Const];
		
		for(i=0; i<Const;i++) {
			System.out.println("Digite o "+(i+1)+"° que deseja");
			a[x]= ler.nextInt();
			
			
			
			b[i]= a[x];
			
		}
		for( i = Const-1; i >= 0; i--) {
			System.out.print(b[i]+"  ");
		}

		}
	
}