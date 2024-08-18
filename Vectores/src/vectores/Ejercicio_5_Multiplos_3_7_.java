package vectores;

import java.util.Scanner;

public class Ejercicio_5_Multiplos_3_7_ {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector();
		
		int N, cm = 0;
		int[] V = new int[100];
		
		System.out.print("Ingrese la cantidad: ");
		N = leer.nextInt();
		
		FV.llenarVector2(N, V);
		FV.mostrarVector(N, V);
		
		for(int i=0; i<N; i++)
		{
			if(V[i]%3 == 0 && V[i]%7 == 0 && V[i] != 0)
			{
				System.out.print("\n"+ V[i]);
				cm++;
			}
		}
		System.out.print("\n Cantidad de multiplos de 3 y 7 es: "+cm);
	}

}
