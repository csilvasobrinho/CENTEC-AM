package listaExercicios04;
import java.util.Scanner;
import java.lang.Math;
public class Questao04 {
	public static void main(String[] args) {
		int i;
		Scanner lerValor = new Scanner(System.in);
		
		int[] vetorA = new int[2];
		double[] vetorB = new double[2];
		
		for(i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			vetorA[i] = lerValor.nextInt();
		}
		
		for(i = 0; i < vetorA.length; i++) {
			vetorB[i] = (double) Math.sqrt(vetorA[i]);
			System.out.println("Posição: " + i + " - Raiz Quadrada de Vetor A = " + vetorB[i]);
		}
		lerValor.close();
	}
}
