
public class Sistema_Bancaria {
	
	public static void main(String[] args) {
		Especial conta = new Especial();
		conta.depositar(300.00);
		conta.sacar(200.00);
		conta.sacar(200.00);
		System.out.println(conta.imprime());
		System.out.println(conta.mostraLimite());
		
	}

}
