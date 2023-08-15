package avaliacoes;
public class Questao08 {
	String nomeAluno;
	int diaNasc, mesNasc, anoNasc;
	
	int calcIdade(int anoAtual, int anoNasc) {
		int idade = anoAtual - anoNasc;
		return idade;
	}
}
