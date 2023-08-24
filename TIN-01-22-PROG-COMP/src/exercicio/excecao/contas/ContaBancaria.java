package exercicio.excecao.contas;

public class ContaBancaria {
	private double saldo; // Determina o saldo da conta.
	private double limite; // Determina o limite de crédito do cheque especial.

	// Construtor padrão da classe.
	public ContaBancaria(double valorSaldo, double valorLimite) {
	}

	// Retorna o saldo da conta.
	public double getSaldo() {
		
	}

	// Retorna o limite da conta.
	protected double getLimite() {
		
	}

	// Retorna o saldo da conta somado ao limite.
	public double getSaldoComLimite() {
		
	}

	// Deve decrementar o valor do saque da Conta. Retorna "true" caso a operação
	// tenha sido bem sucedida, ou seja, a conta possui este valor (lembre-se de
	// considerar o limite).
	public boolean sacar(double valor) throws ContaException {
		
	}

	// Deve incrementar o valor a Conta.
	public void depositar(double valor) throws ContaException {
		
	}
}
