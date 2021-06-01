package arrays;

import java.util.Scanner;

public class Desplazamiento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo [] = new int[10];
		int pos, num;
		
		for(int i=0; i<8; i++) {
			
			System.out.print("Digita el número: "+(i+1)+" ");
			arreglo[i]= entrada.nextInt();
			
		}
		
		for(int i =0; i<10; i++) {
		System.out.println("Posición - "+i+" número "+arreglo[i]);
		}
		
		System.out.println("Digita un número ");
		num= entrada.nextInt();
		System.out.println("Digita una posición ");
		pos= entrada.nextInt();
				
		
		int j=1;
		for(int i=9; i>pos; i--) {
			
			arreglo[(10-j)]=arreglo[(9-j)];
			j++;
		}
		
		arreglo[pos]=num;
		
		
	
		for(int i=0; i<10; i++) {
			System.out.println("Posición - "+(i)+" número - "+(arreglo[i]));
		}
		

	}

}
