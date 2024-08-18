package vectores;
import java.util.Scanner;
public class Ejer_17_RotacionDerecha {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector();
		
		int N, K,i, j, aux = 0;
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		int[] V = new int[N];
		
		FV.llenarVector2(N, V);
		FV.mostrarVector(N, V);
		
		System.out.print("\n Ingrese la cantidad de rotaciones: ");
		K = leer.nextInt();
		
		for(j=0; j<K; j++)
		{
			aux = V[N-1];
			for(i=N-1; i>0; i--)
			{
				V[i] = V[i-1];
			}	
		V[0] = aux;
		
		System.out.print("\n Rotacion: "+(j+1)+": ");
		FV.mostrarVector(N, V);
		}
	}

}
