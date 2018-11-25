
public class Principal {

	public static void main(String[] args) {
		
		Bandeja b1 = new Bandeja(100, 10, true);
		Bandeja b2 = new Bandeja(100, 20, true);
		Bandeja b3 = new Bandeja(100, 50, true);
		Bandeja b4 = new Bandeja(100, 100, true);
		
		ATM a1 = new ATM (b1,b2,b3,b4);	
		
		CC c1 = new CC ("jose", 001, 500);
		
		c1.saque(100, a1);
		
		System.out.println(a1.consultaSaldo());
		
		
		
		

		
		
		
		
	
		

	}

}
