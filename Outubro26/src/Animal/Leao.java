package Animal;

public class Leao extends Animal{
	
	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("Rugindo");
	}
	@Override
	public void dormir() {
		System.out.println("Leao Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Leao Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("Leao Correndo");
	}
}
