package Figuras;

public class Cubo extends Figuras3D {
	
	private double aresta;

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return aresta*aresta*6;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return Math.pow(aresta, 3);
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

}
