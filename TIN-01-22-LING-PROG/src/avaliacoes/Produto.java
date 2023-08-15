package avaliacoes;
public class Produto {
	String nomeProduto;
	double precoCusto;
	double calcPVenda(double pCusto) {
		double pVenda = pCusto + (pCusto * 0.1); 
		return pVenda;
	}
}
