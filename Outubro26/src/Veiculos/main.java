package Veiculos;

public class main {
public static void main(String[] args) {
	Carro car = new Carro("Placa", "Modelo", "Cor", "Ano");
	Onibus bus = new Onibus("Placa", "Modelo", "Cor", "Ano");
	
	System.out.println(car.getAno());
	System.out.println(car.getCor());
	System.out.println(car.getModelo());
	System.out.println(car.getPlaca());
	car.acelerar();
	car.frear();
	car.virar();
	car.ligar();
	
	System.out.println("\n"+bus.getPlaca());
	System.out.println(bus.getModelo());
	System.out.println(bus.getCor());
	System.out.println(bus.getAno());
	bus.acelerar();
	bus.frear();
	bus.virar();
	bus.ligar();
	

	
}}