package listaExercicios04;
import java.util.Scanner;
public class Questao06 {
	public static void main(String[] args) {
		int i;
		Scanner lerValor = new Scanner(System.in);
		
		int[] vetorA = new int[2];
		int[] vetorB = new int[2];
		int[] vetorC = new int[2];
		
		for(i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição: " + i + " do Vetor A: ");
			vetorA[i] = lerValor.nextInt();
			System.out.println("Digite o valor da posição: " + i + " do Vetor B: ");
			vetorB[i] = lerValor.nextInt();
		}

		for(i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println("Posição: " + i + " - Vetor C = " + vetorC[i]);
		}
		lerValor.close();
	}
}