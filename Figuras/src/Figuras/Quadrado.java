package Figuras;

public class Quadrado extends Figuras2D {
	
	 private double lado;

	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}



}
