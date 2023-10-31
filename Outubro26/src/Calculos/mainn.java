package Calculos;

public class  mainn {
public static void main(String[] args) {
	
	Calculando ev = new Calculando();
	
	System.out.println("Numero A: "+50+"\nNumero B: "+20);
	System.out.println("\nSubtração: "+ev.sub(50, 20));
	System.out.println("Somaa: "+ev.soma(50,20));
	System.out.println("Multiplicação: "+ev.mult(50,20));
	System.out.println("Divisão: "+ev.div(50, 20));
	System.out.println("Expoente: "+ev.exp(50, 20));
	
	
	
}
}