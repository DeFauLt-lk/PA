package treinament;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class exercicio1 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner (System.in);
		
		final int Const = 20;
		
		int b[],a[],i,aux;
	
		a= new int[Const];
		b= new int [Const];
		
		for(i=0;i<Const;i++ ) {
			System.out.println("escreva o "+(i+1)+"ª número:");
			a [i] =ler.nextInt();
			b [i]= a[i];
			
			if(a[i]%2==0) {
			
				System.out.println("número par: "+a[i]);
			} else {
				System.out.println("número inpar: "+b[i]);
			}
			
		}
		
	}

}
