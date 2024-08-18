package vectores;

import java.util.Scanner;

public class Ejer_7_ {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector ();
		int N;
		int[] V = new int [100];
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		
		 FV.llenarVector2(N, V);
		 FV.mostrarVector(N, V);
		 
		 for(int i=0; i<N; i++)
		 {
			 System.out.print("\n Elemento: "+V[i]+", divisores pares: ");
			 for(int j=2; j<=V[i]; j+=2)
			 {
				 if(V[i]%j==0)
					 System.out.print(j+", ");
			 }
		 }
		

	}

}
