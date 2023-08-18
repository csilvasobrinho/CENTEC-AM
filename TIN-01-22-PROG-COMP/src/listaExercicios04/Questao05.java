package listaExercicios04;
import java.util.Scanner;
public class Questao05 {
	public static void main(String[] args) {
		int i;
		Scanner lerValor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			vetorA[i] = lerValor.nextInt();
		}
		
		for(i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
			System.out.println("Posição: " + i + " - Vetor A X " + i + " = " + vetorB[i]);
		}
		lerValor.close();
	}
}