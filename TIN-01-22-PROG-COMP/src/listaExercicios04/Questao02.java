package listaExercicios04;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		int i;
		Scanner lerValor = new Scanner(System.in);
		
		int[] vetorA = new int[6];
		int[] vetorB = new int[6];
		
		for(i = 1; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			vetorA[i] = lerValor.nextInt();
		}
		
		for(i = 1; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * 2;
			System.out.println("Posição: " + i + " - Vetor A X 2 = " + vetorB[i]);
		}
	}
}
