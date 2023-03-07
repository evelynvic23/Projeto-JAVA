package Figuras;

public class Circulo extends Figuras2D {
	
	private double raio;

	@Override
	public double calcularArea() {
		return raio*raio*Math.PI;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
