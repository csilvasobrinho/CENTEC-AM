package listaExercicios02;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		int cont = 1, contPar = 0, contImpar = 0;
		double num = 0;

		Scanner lerNum = new Scanner(System.in);

		while (cont <= 10) {
			System.out.println("Numero: ");
			num = lerNum.nextDouble();
			if ((num % 2) == 0) {
				System.out.println("Par!");
				contPar++;
			} else {
				System.out.println("Impar!");
				contImpar++;
			}
			cont++;
		}
		System.out.println("Total de Pares: " + contPar);
		System.out.println("Total de Impares: " + contImpar);
	}

}
