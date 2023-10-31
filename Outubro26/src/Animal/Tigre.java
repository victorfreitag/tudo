package Animal;

public class Tigre extends Animal{
	
	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("Rugindo");
	}
	@Override
	public void dormir() {
		System.out.println("tigre Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("tigre Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("tigre Correndo");
	}
}
