package treinament;

import java.util.Scanner;

public class exercicio2 {

	
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		final int Const=5;
		int a[],i,multiplicador=1,resultado;
		
		a=new int [Const];
		
		for( i = 0; i <Const; i++) {
			System.out.println("digite o "+(i+1)+"ª numero");
			a[i]=ler.nextInt();		
		}
		
	}
}


