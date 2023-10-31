package Veiculos;

public class Carro extends Veiculos{
	
	public Carro(String placa, String modelo, String cor,String ano) {
		super(placa, modelo, cor,ano);
	}
	@Override
	public void acelerar() {
		System.out.println("Acelerando Carro");
	}
	@Override
	public void frear() {
		System.out.println("Acelerando o carro");
	}
	@Override
	public void virar() {
		System.out.println("Virando o carro");
	}
	@Override
	public void ligar() {
		System.out.println("LIgando o carro");
	}
}
