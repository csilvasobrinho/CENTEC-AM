package listaExercicios07;

import java.util.Scanner;

public class TestaParOuImpar {
	public static void main(String[] args) {
		int num;
		ParOuImpar valorChecar = new ParOuImpar();
		
		Scanner lerValor = new Scanner(System.in);
		System.out.println("Nº. ");
		num = lerValor.nextInt();
		valorChecar.checaValor(num);

	}
}
