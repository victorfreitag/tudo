package Animal;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("AUUUUUUUU");
	}
	@Override
	public void dormir() {
		System.out.println("Cachorro Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Cachorro Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("Cachorro Correndo");
	}
}
