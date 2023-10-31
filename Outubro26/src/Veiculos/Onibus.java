package Veiculos;

public class Onibus extends Veiculos{
	
	public Onibus(String placa, String modelo, String cor,String ano) {
		super(placa, modelo, cor,ano);
	}
	@Override
	public void acelerar() {
		System.out.println("Acelerando o busao");
	}
	@Override
	public void frear() {
		System.out.println("Acelerando o busao");
	}
	@Override
	public void virar() {
		System.out.println("Virando o onibus");
	}
	@Override
	public void ligar() {
		System.out.println("LIgando o Onibus");
	}
}
