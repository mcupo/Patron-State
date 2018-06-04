package ar.edu.ort.consingleton;

public class Test {
	
	public static void main(String[] args) {
		MaquinaDeChicles maquinaDeChicles = new MaquinaDeChicles(2);

		System.out.println(maquinaDeChicles);

		maquinaDeChicles.insertarMoneda();
		maquinaDeChicles.girarManivela();

		System.out.println(maquinaDeChicles);

		maquinaDeChicles.insertarMoneda();
		maquinaDeChicles.girarManivela();
		
		maquinaDeChicles.insertarMoneda();
		maquinaDeChicles.girarManivela();
		
		maquinaDeChicles.recargar(5);
		maquinaDeChicles.insertarMoneda();
		maquinaDeChicles.girarManivela();

		System.out.println(maquinaDeChicles);
	}
}