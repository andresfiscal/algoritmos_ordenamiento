import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Merge {
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] Numbers;//numeros digitados por el usuario
		int[] Array;//arreglo con los numero separados
		int[] Ordenado;//arreglo ordenado
		
		
		//leer los numeros
		bw.write("digite los numeros separados por comas\n");
		bw.flush();
		Numbers = br.readLine().split(",");//numeros separados
		Array = new int[Numbers.length];
		Ordenado = new int[Numbers.length];
		
		//pasar el arreglo de caracteres a enteros
		for(int i=0; i<Numbers.length; i++)
		{
			Array[i]= Integer.parseInt(Numbers[i]);
		}
		
		Ordenado=Merge_Sort(Array);
		bw.write("numeros en orden: \n");
		bw.flush();
		for(int i=0; i<Numbers.length; i++)
		{
			System.out.print(Ordenado[i]+" ");
		}
		System.out.println();
		
		
		
		
		
	}
	
	public static int[] Merge_Sort(int[] Array)
	{
		
		int[] LeftSubArray = new int[Array.length/2]; 
		int[] RightSubArray = new int[Array.length-(Array.length/2)];
		
		int[] SortedL = new int[Array.length/2];
		int[] SortedR = new int[Array.length-(Array.length/2)];
		
		if (Array.length == 1)
		{
			
			return Array;
		}
		else 
		{
			int i=0;
			for(i=0; i<Array.length/2; i++)
			{
				LeftSubArray[i]=Array[i];
			}
			for(i=Array.length/2; i<Array.length; i++)
			{
				RightSubArray[i-(Array.length/2)]=Array[i];
			}
			
			SortedL = Merge_Sort(LeftSubArray);
			SortedR = Merge_Sort(RightSubArray);
			
			return Merge(SortedL,SortedR);
		}
	}
	
	public static int[] Merge(int[]A, int[] B) {
		
		int length = A.length+B.length;
		int[] C = new int[length];
		int IndexA=0, IndexB=0, IndexC=0;
		
		
		while(A.length != IndexA && B.length != IndexB)
		{
			if(A[IndexA]<B[IndexB])
			{
				
				C[IndexC]=A[IndexA];
				IndexA++;
				IndexC++;
			}
			else
			{
				
				C[IndexC] = B[IndexB];
				IndexB++;
				IndexC++;
			}
		}
		
		
		while(A.length != IndexA)
		{
			C[IndexC] = A[IndexA];
			IndexA++;
			IndexC++;
		}
		while(B.length != IndexB)
		{
			C[IndexC] = B[IndexB];
			IndexB++;
			IndexC++;
		}
		return C;
	}
}
