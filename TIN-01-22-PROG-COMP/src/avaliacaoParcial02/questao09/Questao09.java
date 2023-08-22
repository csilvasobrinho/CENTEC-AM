package avaliacaoParcial02.questao09;
import java.util.Scanner;
import java.lang.Math;
public class Questao09 {
	public static void main(String[] args) {
		int i;
		Scanner lerValor = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for(i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			vetorA[i] = lerValor.nextInt();
		}
		
		for(i = 0; i < vetorA.length; i++) {
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
			System.out.println("Posição: " + i + " - Vetor A ao Quadrado = " + vetorB[i]);
		}
		lerValor.close();
	}
}