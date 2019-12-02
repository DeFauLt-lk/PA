package lista6;

import java.util.*;

public class exercicio5 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
	
		final int  Const=10;
	
		int  aux,i=0,j=0, a[], b[], c[];
	
		a=new int [Const];
		b=new int[Const];
		c=new int [Const];
		
		//leitura dos dados
	
		for (i=0;i<Const;i++) {
		System.out.println("Digite "+(i+1)+" numero");
		a[i]= ler.nextInt();
		b[i]=a[i];
		c[i]= a[i];
		}
		
		// colocando em ordem decrescente 
		
			for(i=0;i<Const;i++){
			
			for(j=0;j<Const-1;j++){
				
				if(b[i]>b[j]){
					aux= b[i];
					b[i]= b[j];
					b[j]= aux;
			
				}	
				
			}
		
		}
			
			for(i=0;i<Const;i++){
				
			for(j=0;j<Const-1;j++){
				
				if(c[i]<c[j]){
					aux= c[i];
					c[i]= c[j];
					c[j]= aux;
			
				}	
				
			}
		
		}
			//apresentando os valores
		for(i=0;i<Const; i++) {
		System.out.print(a[i]+"\n ");
		
		}
		System.out.println("\nordem decrescente  ");
		
		for(i=0;i<Const; i++) {
		System.out.print(b[i]+" ");
		
		}
		System.out.println("\nordem crescente");
		
		for(i=0;i<Const; i++) {
			System.out.print(c[i]+" ");
			
		}
		
	}
}