package Calculos;

public  class Calculando implements Calculos {
	
	@Override
	public int div(double a, double b) {
		return (int) (a/b);
	}
	@Override
	public double mult(double a, double b) {
		return a*b;
	}
	@Override
	public int exp(double a, double b) {
		return (int)(a/b);
	}
	@Override
	public double sub(double a, double b) {
		return a-b;
	}
	@Override
	public double soma(double a, double b) {
		return a+b;
	}

}
