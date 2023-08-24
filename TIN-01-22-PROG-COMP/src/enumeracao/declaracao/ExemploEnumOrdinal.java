package enumeracao.declaracao;
public class ExemploEnumOrdinal {
	public static void main(String[] args) {
		EstacoesDoAno estacaoAtual[] = EstacoesDoAno.values();
		
		for (EstacoesDoAno estacao : estacaoAtual) {
			System.out.println("\nA Estação: " 
					+ estacao 
					+ " corresponde ao índice " 
					+ estacao.ordinal());
		}
	}
}