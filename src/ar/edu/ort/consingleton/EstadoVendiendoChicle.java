package ar.edu.ort.consingleton;

public class EstadoVendiendoChicle implements Estado {
	
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
			maquinaDeChicles.setEstado(new EstadoSinMoneda());
		} else {
			System.out.println("\nUps, ya no hay más chicles!");
			maquinaDeChicles.setEstado(new EstadoSinStock());
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