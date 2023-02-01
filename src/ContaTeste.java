
public class ContaTeste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Junior";
		System.out.println("Seu saldo inicial...");
		conta.saldo = 2500.00;
		conta.exibesaldo();
		System.out.println("");
		
		conta.saque(1000);
		System.out.println("Você realizou um saque.......");
		conta.exibesaldo();
		System.out.println("");
		
		conta.depositar(5000);
		System.out.println("Voçê realizou um depósito........");
		conta.exibesaldo();
		System.out.println("");
		
		Conta destino = new Conta();
		System.out.println("Transferencia de Valor para novo Cliente......");
		destino.cliente = "Luana";
		destino.saldo = 3000;
		destino.exibesaldo();

	}

}
