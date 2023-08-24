package testa.ap01;

import java.lang.Math;
import java.util.Scanner;

public class Gabriel {
	public static void main(String[] args) {
		double A[] = { 1, 2, 3 };
		double B[] = new double[A.length];
		int i;
		Scanner LerNum = new Scanner(System.in);
		
		/*
		for(i=0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		*/
		
		for (i = 0; i < 10; i++) {
			System.out.print("Digite o valor " + (i + 1) + " para o vetor A: ");
			A[i] = LerNum.nextDouble();
		}
		for (i = 0; i < 10; i++) {
			B[i] = Math.pow(A[i], 2);
			System.out.println("Posicao " + i + " Elemento de B: " + B[i]);
		}
	}
}