package treinament;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int Const=10;
		int i, a[], num[];

		a=new int [Const];
		num= new int[Const];	

		for (i=0;i<Const;i++) {
			System.out.println("entre com  "+(i+1)+"° que deseja");
			a[i]= ler.nextInt();
			num[i]=0;

			for (int j = 1; j <=a[i]; j++) {
				if(a[i]%j==0) {
					num[i]++;
				}
			}
		}
		for(i=0; i<Const;i++) {
			if(num[i]==2){


				System.out.println(a[i]+"  é um número primo!");
			}else {

				System.out.println(a[i]+"  Não é primo");
			}
		}

	}
}

