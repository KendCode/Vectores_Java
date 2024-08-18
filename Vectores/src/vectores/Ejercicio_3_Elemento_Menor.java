package vectores;

import java.util.Scanner;

public class Ejercicio_3_Elemento_Menor {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		
		//Instanciando o creanto un objeto Fv de la clase Vector 
		Vector FV = new Vector();
		
		int N;
		int [] V = new int[100];
		
		System.out.print("Ingrese la cantida de elementos: ");
		N = leer.nextInt();
		
		FV.llenarVector(N, V);
		FV.mostrarVector(N, V);
		
		int menor = V[0];
		int posicion = 0;
		
		for(int i= 0; i < N; i++)
		{
			if(V[i] < menor)
			{
				menor = V[i];
				posicion = i;
			}
		}
		System.out.print("\n El menor es: "+ menor + ", esta en la posicion: "+ posicion);
	}

}
