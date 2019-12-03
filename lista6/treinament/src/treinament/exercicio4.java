package treinament;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
	Scanner ler= new Scanner (System.in);
		
		final int Const = 10;
		
		int a[],i,aux;
	
		a= new int[Const];
	
		
		for(i=0;i<Const;i++ ) {
			System.out.println("escreva o "+(i+1)+"ª número:");
			a [i] =ler.nextInt();	
		}
			for(i=0;i<Const;i++) {
				if(a[i]%2==0) {
					System.out.println(a[i]+" ");
					
					System.out.println("número par: "+a[i]);
				}	
			}
	}
}
