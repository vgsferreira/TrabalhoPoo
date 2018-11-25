import javax.swing.JOptionPane;

public class CC {
	
	private String nome = ""; 
	private int conta;
	private double saldo;
	private double limite = saldo + 1000;
	private boolean limiteContratado = false;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		this.saldo += valor;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean getLimiteContratado() {
		return limiteContratado;
	}

	public void setLimiteContratado(double valor, boolean limiteContratado) {
		this.limiteContratado = limiteContratado;
	}

	CC (String nome, int conta, double saldo){
		this.nome = nome;
		this.saldo = saldo;
		this.conta = conta;
		this.limite = 1000;
		
	}
	
	public void saque(double valor, ATM atm){
		
		if (atm.getSaldo() >= valor){			
		
			if (this.saldo >= valor){
				
				this.saldo -= valor;
				atm.setSaldo(atm.getSaldo() - valor);				
				
				
				JOptionPane.showMessageDialog(null,"Saque realizado");	
				
					
				
			}else{
				JOptionPane.showMessageDialog(null,"Saldo insuficiente");
				
			}
		}else{
			JOptionPane.showMessageDialog(null,"ATM sem dinheiro");
			
		}
			
	}
	
	public void deposito (double valor, ATM atm){
		
		setSaldo(getSaldo() + valor);
		
	}
	
	public void defineLimiteEspecial(boolean limiteContratado, double valor){
		
		if (limiteContratado == true){
			
			saldo += valor;
			
		}else{
			JOptionPane.showMessageDialog(null,"Sem Limite Especial Contratado");
		}
		
	}

}
