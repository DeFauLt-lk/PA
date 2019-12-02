package lista6;

import java.math.*;
import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner ler=new Scanner (System.in)		;
		final int  Const=10;
		int i,a[];
		double b[];
		
		b= new double [Const];
		a= new int [Const];
		
		
		for(i=0; i<Const; i++) {
			
			System.out.println("digite o numero na raiz "+(i+1)+ "que deseja");
			a[i]= ler.nextInt();
			
			b[i]= a[i];
			
			b[i] = Math.sqrt(b[i]);
			System.out.println(b[i]);
		}
		
	}

}