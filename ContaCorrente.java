
public class ContaCorrente {
	private int numero;
	private String pessoa;
	private double saldo;
	
	public void SetNumero(int num) {
		this.numero = num;
	}

	public int GetNumero() {
		return this.numero;
	}
	
	public void SetPessoa(String pessoa) {
		this.pessoa=pessoa;
		
	}
	
	public String GetPessoa() {
		return this.pessoa;
		
	}
	
	public void SetSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public double GetSaldo() {
		return this.saldo;
		
	}
	
	public void Deposita(double valor) {
		this.saldo=this.saldo+valor;
	}
	
	public void Saque(double valor) {
		this.saldo=this.saldo-valor;
	}

}
