import java.util.Scanner;
public class LE02_Q01_Rev00 {

	public static void main(String[] args) {
		//Declaração de variáveis
		int anoAtual = 0;
		int anoNasc = 0;
		int idade = 0;
		String nome;
		
		//Criando o objeto Scanner para captura de teclado
		Scanner lerDados = new Scanner(System.in);
		Scanner lerPessoa = new Scanner(System.in);
				
		//Lendo a variável anoAtual
		System.out.println("Entre com o Ano Atual: ");
		anoAtual = lerDados.nextInt();
		
		//Lendo a variável anoNasc
		System.out.println("Entre com o Ano Nascimento: ");
		anoNasc = lerDados.nextInt();
		
		//Calculando a idade
		idade = anoAtual - anoNasc;
		
		//Exibindo a idade calculada
		System.out.println("Idade Calculada: " + idade);
		
		//Testando a Idade
		if(idade >=18) {
			System.out.println("Nome:");
			nome = lerPessoa.nextLine();
			System.out.println("Sr. " + nome + ", sua entrada foi permitida!");
		}else {
			System.out.println("Entrada não permitida!");
		}
	}
}