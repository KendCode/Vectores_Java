package vectores;
import java.util.Scanner;
public class Ejer_11_Capicua {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		Vector FV = new Vector();
		
		int N, cc = 0;
		int[] V = new int[100];
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		
		FV.llenarVector2(N, V);
		FV.mostrarVector(N, V);
		
		for(int i=0; i<N; i++)
		{
			if(V[i] == FV.invertir(V[i]))
			{
				cc++;
				System.out.print("\n"+V[i]+", posicion: "+i);
			}
		}
		System.out.print("\n Cantidad de capicuas: "+cc);

	}

	

}
