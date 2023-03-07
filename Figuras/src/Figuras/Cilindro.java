package Figuras;

public class Cilindro extends Figuras3D {
	
	private double base;
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	private double raio;
	private double altura;

	@Override
	public double calcularVolume() {
		return raio*raio*Math.PI + 2*raio*Math.PI*altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return raio*raio*Math.PI*altura;
	}



}
