package arrays;

import java.util.Scanner;

public class Desplazamiento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo [] = new int[10];
		int pos, num;
		
		for(int i=0; i<8; i++) {
			
			System.out.print("Digita el n�mero: "+(i+1)+" ");
			arreglo[i]= entrada.nextInt();
			
		}
		
		for(int i =0; i<10; i++) {
		System.out.println("Posici�n - "+i+" n�mero "+arreglo[i]);
		}
		
		System.out.println("Digita un n�mero ");
		num= entrada.nextInt();
		System.out.println("Digita una posici�n ");
		pos= entrada.nextInt();
				
		
		int j=1;
		for(int i=9; i>pos; i--) {
			
			arreglo[(10-j)]=arreglo[(9-j)];
			j++;
		}
		
		arreglo[pos]=num;
		
		
	
		for(int i=0; i<10; i++) {
			System.out.println("Posici�n - "+(i)+" n�mero - "+(arreglo[i]));
		}
		

	}

}
