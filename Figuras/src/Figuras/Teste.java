package Figuras;

public class Teste {

	public static void main(String[] args) {
		
		//Chamando as classes.
		
		Quadrado figura1 = new Quadrado();
		figura1.setNome("Quadrado");
	    figura1.setLado(6);
	    
	    Circulo figura2 = new Circulo();
	    figura2.setNome("Círculo");
	    figura2.setRaio(7);
	    
	    Triangulo figura3 = new Triangulo();
	    figura3.setNome("Triângulo");
	    figura3.setAltura(8);
	    figura3.setBase(10);
	    
	    Cubo figura4 = new Cubo();
	    figura4.setNome("Cubo");
	    figura4.setAresta(6);
	    
	    Cilindro figura5 = new Cilindro();
	    figura5.setNome("Cilindro");
	    figura5.setAltura(10);
	    figura5.setRaio(5);
	    figura5.setBase(6);
	    
	    // Criando o vetor.
	    FigurasGeometricas [] figurasG = new FigurasGeometricas [5];
	    
	    
	    figurasG [0] = figura1;
	    figurasG [1] = figura2;
	    figurasG [2] = figura3;
	    figurasG [3] = figura4;
	    figurasG [4] = figura5;
	    
	    
	    System.out.println("Figuras Geometricas");
	    for(FigurasGeometricas figura: figurasG) {
	    	
	    	
	    	
	    	System.out.println(".................................");
	    	
	    	if(figura instanceof Figuras2D) {
	    		
	    		//doncast
	    		Figuras2D fig2 = (Figuras2D) figura;
	    		System.out.println("Figura Geometrica Selecionada: " + figura.getNome());
	    		System.out.println();
	    		System.out.println("Cálculo da área da figura: " + fig2.calcularArea());
	    	}
	    	
	    	
	    	if(figura instanceof Figuras3D) {
	    		
	    		//doncast
	    		Figuras3D fig3 = (Figuras3D) figura;
	    		System.out.println("Figura Geometrica Selecionada: " + figura.getNome());
	    		System.out.println();
	    		System.out.println("Cálculo da área da figura: " + fig3.calcularArea());
	    		System.out.println();
	    		System.out.println("Cálculo do volume da figura: " + fig3.calcularVolume());
	    		
	    	}
	    	
	    	
	    }
	    		
		
		
	}
	
	

}
