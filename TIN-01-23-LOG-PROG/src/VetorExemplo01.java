import java.util.Scanner;

public class VetorExemplo01 {
	public static void main(String[] args) {
		int n = 4; //tamanho do vetor;
		double v[] = new double[n]; //Declaração e alocação de espaço para o vetor "v"
		int i; //índice ou posição
		double soma = 0;
		double media = 0;
		
		Scanner lerNum = new Scanner(System.in);
		//Processando os "n" elementos do vetor "v"
		for (i=0; i < n; i++) {
			v[i] = i; //na é-sima posição do vetor "v" armazena uma variável "i"
			System.out.println("Nota : " + i);
			v[i] = lerNum.nextDouble();
			soma = soma + v[i];
		}
		media = soma / i;
		for(i=0; i < n; i++) {
			System.out.println("Nota Lida: " + v[i]);
		}
		System.out.println("Média: " + media);
	}
}
