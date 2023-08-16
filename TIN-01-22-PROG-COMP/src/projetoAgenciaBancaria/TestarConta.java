package projetoAgenciaBancaria;

import java.util.Scanner;

public class TestarConta {
	public static void main(String[] args) {
		Conta contaCleverson; contaCleverson = new Conta();
		Data dataAbertura; dataAbertura = new Data();
		DataEncapsulada dtAbertura; dtAbertura = new DataEncapsulada();
		int dia;
		
		Scanner lerValor = new Scanner(System.in);
		
		System.out.println("Data de Abertura: ");
		dia = lerValor.nextInt();
		dtAbertura.setDia(dia);
		
		System.out.println("Dia: " + dtAbertura.getDia());
		contaCleverson.nomeTitular = "Danilo";
		contaCleverson.saldo = 1000;
		contaCleverson.dataAbertura = dataAbertura;

		contaCleverson.sacar(250);

		System.out.println(contaCleverson.recuperaDadosParaImpressao());

	}
}
