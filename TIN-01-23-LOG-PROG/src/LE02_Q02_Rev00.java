import java.util.Scanner;
public class LE02_Q02_Rev00 {
	public static void main(String[] args) {
		String nomeAluno;
		float n1=0; float n2=0; float n3=0;	float media=0;
		
		Scanner lerNome = new Scanner(System.in);
		Scanner lerNotas = new Scanner(System.in);
		
		System.out.println("Nome do Aluno: ");
		nomeAluno = lerNome.nextLine();
		
		System.out.println("Nota 01: ");
		n1 = lerNotas.nextFloat();
		
		System.out.println("Nota 02: ");
		n2 = lerNotas.nextFloat();
		
		System.out.println("Nota 03: ");
		n3 = lerNotas.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		
		if(media >= 7) {
			System.out.println("Aprovado! com média: " + media);
		}else {
			System.out.println("Reprovado! com média: " + media);
		}
	}
}