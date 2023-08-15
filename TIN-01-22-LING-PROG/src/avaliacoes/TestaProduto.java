package avaliacoes;
import java.util.Scanner;
public class TestaProduto {
	public static void main(String[] args) {
		double custo=0, venda=0;
		Scanner lerValor = new Scanner(System.in);
		Produto novoProduto = new Produto();
		System.out.println("Custo: ");
		custo = lerValor.nextDouble();
		venda = 2 * (novoProduto.calcPVenda(custo));
		System.out.println(venda);
	}
}
