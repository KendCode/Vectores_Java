package vectores;
import java.util.Scanner;
public class Ejercio_19_compararNumeros {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector();
		
		int N, M, i, j, L;
		
		System.out.print("ingrese la cantidad para el Vector A: ");
		N = leer.nextInt();
		int[] A = new int[N];
		FV.llenarVector2(N, A);
		FV.mostrarVector(N, A);
		
		System.out.print("\n ingrese la cantidad para el Vector B: ");
		M = leer.nextInt();
		int[] B = new int[M];
		FV.llenarVector2(M, B);
		FV.mostrarVector(M, B);
		
		if(N > M)
			L = N;	
		else
			L = M;
		int[] C = new int[L];
		int X = -1;
		
		for(i = 0; i<N; i++)
			for(j=0; j<M; j++)
				if(A[i] == B[j])
				{
					X++;
					C[X] = A[i];
				}
		System.out.print("\n El vector C es: ");
		FV.mostrarVector(X+1, C);
			

	}

}
