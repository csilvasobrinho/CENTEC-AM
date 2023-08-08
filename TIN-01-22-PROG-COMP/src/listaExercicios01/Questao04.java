package listaExercicios01;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		String nomeProd;
		int quantProd;
		double valorUnitProd, totalCompra;
		
		Scanner lerProd = new Scanner(System.in);
		Scanner lerQuantProd = new Scanner(System.in);
		Scanner lerValorProd = new Scanner(System.in);
		
		System.out.println("Produto: ");
		nomeProd = lerProd.nextLine();
		System.out.println("Quant.: ");
		quantProd = lerQuantProd.nextInt();
		System.out.println("Valor Unit.: ");
		valorUnitProd = lerValorProd.nextDouble();
		
		totalCompra = quantProd * valorUnitProd;
		
		if (totalCompra <= 100) {
			System.out.println("\nProduto: " + nomeProd);
			System.out.println("Quant.: " + quantProd);
			System.out.printf("Unit.: %.2f", valorUnitProd);
			System.out.printf("\nTotal: %.2f", totalCompra);
		}else {
			System.out.println("\nProduto: " + nomeProd);
			System.out.println("Quant.: " + quantProd);
			System.out.printf("Unit.: %.2f", valorUnitProd);
			System.out.printf("\nTotal: %.2f", totalCompra);
			System.out.printf("\nDesc. %.2f", totalCompra * 0.1);
			System.out.printf("\nTotal Final: %.2f", totalCompra - (totalCompra * 0.1));
		}
		lerProd.close();
		lerQuantProd.close();
		lerValorProd.close();
	}

}
