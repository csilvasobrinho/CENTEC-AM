package aulaPOOBasico;

public class TestarAlgunsMetodos {
	public static void main(String[] args) {
		//criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		//alterando os valores de minhaConta
		minhaConta.numero = 10;
		//minhaConta.saldo = 500;
		
		//saca 200 reais
		//minhaConta.sacar(200);
		
		//depositar 500 reais
		//minhaConta.depositar(500);
				
		minhaConta.saca(10000);
		System.out.println(minhaConta.saldo);
	}
}