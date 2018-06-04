package ar.edu.ort.consingleton;

//Clase EstadoConcreto declarada como Singleton
public class EstadoVendiendoChicle implements Estado {
	
	private static Estado instancia;
	private EstadoVendiendoChicle() {}
	
	public static Estado instancia() {
	if (instancia==null) {
		instancia = new EstadoVendiendoChicle();
	}
		return instancia;
	}
    @Override
	public void insertarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Por favor espere, su chicle esta saliendo");
	}
    @Override
	public void sacarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Lo lamentamos, usted ya giro la manivela");
	}
    @Override
	public void girarManivela(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Girar la manivela dos veces no le va a dar otro chicle!");
	}
    @Override
	public void entregarChicle(MaquinaDeChicles maquinaDeChicles) {
		maquinaDeChicles.soltarChicle();
		if (maquinaDeChicles.getCantidad() > 0) {
			maquinaDeChicles.setEstado(EstadoSinMoneda.instancia());
		} else {
			System.out.println("\nUps, ya no hay más chicles!");
			maquinaDeChicles.setEstado(EstadoSinStock.instancia());
		}
	}
    @Override
	public void recargar(MaquinaDeChicles maquinaDeChicles) { 
    	System.out.println("Solo se puede recargar cuando no haya mas stock");
    }
    @Override
	public String toString() {
		return "entregando un chicle";
	}
}