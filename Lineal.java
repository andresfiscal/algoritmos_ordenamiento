import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Lineal {
	public void linealSearch(int[] array, int num) throws IOException
	{
		Scanner leer = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int index=-1;
		bw.write("ingrese el numero que desea buscar: ");
		bw.flush();
		num = leer.nextInt();
		
		//se comparan todos los elementos en el arreglo
		for(int i =0; i <array.length;i++)
		{
			if(array[i] == num)
			{
				
				index = i;
				
				break;
			}
		}
		
		 bw.write("el numero esta en la posicion: " + index);
		 bw.flush();
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num=0;
		String line = br.readLine();
		String[] numbers = line.split(",");
		int[] array = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++)
			array[i] = Integer.parseInt(numbers[i]);
		
		Lineal lineal = new Lineal();
		lineal.printArray(array);
		lineal.linealSearch(array, num);
		
		
	}
	
	public void printArray(int[] array) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < array.length; i++)
			bw.write(array[i] + " "); 
		
		bw.write("\n");
		bw.flush();
	}
}
