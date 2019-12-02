package lista6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		 Scanner ler= new Scanner (System.in);
		 
		 final int Const=10;
		 
		 int aux,i,menor,a[];
		 
	
		 
		 a=new int [Const];
		 
		 ;
		 for(i=0;i<Const;i++) {
			 System.out.println("Digite o "+(i+1)+" valor");
			 a[i]= ler.nextInt();			 
		 }	 
		 
		 aux=a[0];
		 menor=a[0];
		 	
		 // Maior valor
		 for(i=1;i<Const;i++) {
			
			 if(aux<a[i]){
				 aux= a[i];
			 }
		 }	 
			 
		 //Menor valor
		 
		 for(i=1;i<Const;i++) {
					
				 if(menor>a[i]){
					 menor= a[i];
				}
		 }	
		 
		 for(i=0;i<Const;i++) {
			 System.out.println(a[i]+"/n ");
		 }		
			
		 System.out.println(aux+" maior valor");
		 
		 System.out.println(menor+ " menor valor ");
			

	}
}