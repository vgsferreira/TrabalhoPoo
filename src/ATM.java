import javax.swing.JOptionPane;

public class ATM {

	private Bandeja b1;

	private Bandeja b2;

	private Bandeja b3;
	
	private Bandeja b4;

	private String []log;

	private double saldo;

	private Bandeja[] posicao;

	public Bandeja getB1() {

		return b1;

	}

	public void setB1(Bandeja b1) {

		this.b1 = b1;

	}

	public Bandeja getB2() {

		return b2;

	}

	public void setB2(Bandeja b2) {

		this.b2 = b2;

	}

	public Bandeja getB3() {

		return b3;

	}

	public void setB3(Bandeja b3) {

		this.b3 = b3;

	}

	public Bandeja getB4() {

		return b4;

	}

	public void setB4(Bandeja b4) {

		this.b4 = b4;

	}

	public double getSaldo() {

		return saldo;

	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;

	}

	public Bandeja[] getPosicao() {

		return getPosicao();

	}

	public void setPosicao(Bandeja[] posicao) {

		this.posicao = posicao;

	}

	


	public String[] getLog() {
		return log;
	}

	public void setLog(String[] log) {
		this.log = log;
	}
	
	public ATM() {
		
	}

	

	public ATM(Bandeja b1, Bandeja b2, Bandeja b3, Bandeja b4) {

		int totSaldo;

		this.b1 = new Bandeja(b1.getTipoNumerario(), b1.getQtdeNum(), true);

		this.b2 = new Bandeja(b2.getTipoNumerario(), b2.getQtdeNum(), true);

		this.b3 = new Bandeja(b3.getTipoNumerario(), b3.getQtdeNum(), true);

		this.b4 = new Bandeja(b4.getTipoNumerario(), b4.getQtdeNum(), true);

		posicao = new Bandeja[5];

		totSaldo = 	(b1.getTipoNumerario() * b1.getQtdeNum()) +

					(b2.getTipoNumerario() * b2.getQtdeNum()) +

					(b3.getTipoNumerario() * b3.getQtdeNum()) +

					(b4.getTipoNumerario() * b4.getQtdeNum());

		atualizaSaldoATM(totSaldo);

	}

	public void atualizaSaldoATM(int totSaldo) {

		saldo += totSaldo;

	}

	public double consultaSaldo() {

		return saldo;

	}

	// exibeExtratoLog()

	public void addBandeja(int pos, Bandeja b) {

		posicao[pos] = b;

		atualizaSaldoATM(b.getTipoNumerario() * b.getQtdeNum());

	}

	public void removeBandeja(int pos, Bandeja b){




		b.setAtiva(false);



		atualizaSaldoATM((b.getTipoNumerario() * b.getQtdeNum()) * -1);




	}
	
	public void atualizaSaldoCC(CC conta, double valor){
		
		conta.getSaldo() ;
		
	}
	
	public void saque (CC conta, double valor){
		
		
		if (getSaldo() >= valor){
			
			if (conta.getSaldo() >= valor){
				
				conta.setSaldo (conta.getSaldo() - valor);
				JOptionPane.showMessageDialog(null,"Saque realizado");
				
				
			}else{
				JOptionPane.showMessageDialog(null,"Saldo insuficiente na conta");
			}
		}else{
			JOptionPane.showMessageDialog(null,"Caixa sem saldo");
		}
			
			
	}
	

		
		

	
	public void deposito (CC conta, double valor){
		
		conta.setSaldo(conta.getSaldo() + valor);
		
	}

	





	//selecaoNumerario(valor)














}