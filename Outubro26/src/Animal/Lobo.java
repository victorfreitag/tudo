package Animal;

public class Lobo extends Animal{
	
	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("AUUUUUUUU");
	}
	@Override
	public void dormir() {
		System.out.println("Lobo Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Lobo Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("Lobo Correndo");
	}
}
