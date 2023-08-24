package testa.ap01;

import java.util.Scanner;

public class Classe10 {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[] = new int[A.length];
		int C[] = new int[A.length];
		int i;
		Scanner LerNum = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print("Digite o valor " + (i + 1) + " para o vetor A: ");
			A[i] = LerNum.nextInt();
			System.out.print("Digite o valor " + (i + 1) + " para o vetor B: ");
			B[i] = LerNum.nextInt();
			for (i = 0; i < 10; i++) {
				C[i] = A[i] - B[i];
				System.out.println("Posicao " + i + " Elemento de C: " + B[i]);
			}
		}
	}
}
