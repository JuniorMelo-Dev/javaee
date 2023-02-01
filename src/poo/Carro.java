package poo;

import java.util.Random;

public class Carro {
	
	// atributos
	int ano;
	String cor;
	
	// construtor
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	// construtor com parâmetros
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	// métodos
	void ligar() {
		System.out.println("engine ON ......");
	}
	
	void desligar() {
		System.out.println("engine OFF ..");
	}
	
	void acelerar() {
		System.out.println("vrummmmmmm ... ligou");
	}
}
