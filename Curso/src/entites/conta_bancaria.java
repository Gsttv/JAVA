package entites;

public class conta_bancaria {
	private String name;
	private int numero_conta;
	private double deposito;
	
	
	public conta_bancaria(String name, int numero_conta, double DepositoInicial) {
		super();
		this.name = name;
		this.numero_conta = numero_conta;
		add_deposito(DepositoInicial);
	}
	
	public conta_bancaria(String name, int numero_conta) {
		super();
		this.name = name;
		this.numero_conta = numero_conta;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public double getDeposito() {
		return deposito;
	}
	
	public void add_deposito(double entrada) {
		deposito += entrada;
	}
	
	public void saques(double saida) {
		deposito -= (saida+5);
	}

	@Override
	public String toString() {
		return "Dados da conta: [name =" + name + ", numero_conta =" + numero_conta + ", Saldo da conta =" + deposito + "]";
	}
	
	
	
}
