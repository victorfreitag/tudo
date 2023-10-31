package Animal;

public class Gato extends Animal{
	
	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("Miauuuu");
	}
	@Override
	public void dormir() {
		System.out.println("Gato Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Gato Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("Gato Correndo");
	}
}
