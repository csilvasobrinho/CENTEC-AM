package aulaPOOBasico;

public class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Cleverson";
		minhaConta.saldo = 1000;
		minhaConta.numero = 1508;
				
		System.out.println("Saldo Atual: " + minhaConta.saldo);
	
	}

}
