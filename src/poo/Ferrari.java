package poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2022;
		ferrari.cor = "Amarelo";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
	}

}
