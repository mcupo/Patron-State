package ar.edu.ort.sinsingleton;

public class EstadoVendiendoChicle implements Estado {
		 
    MaquinaDeChicles maquinaDeChicles;
 
    public EstadoVendiendoChicle(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }
    @Override
	public void insertarMoneda() {
		System.out.println("Por favor espere, su chicle esta saliendo");
	}
    @Override
	public void sacarMoneda() {
		System.out.println("Lo lamentamos, usted ya giro la manivela");
	}
    @Override
	public void girarManivela() {
		System.out.println("Girar la manivela dos veces no le va a dar otro chicle!");
	}
    @Override
	public void entregarChicle() {
		maquinaDeChicles.soltarChicle();
		if (maquinaDeChicles.getCantidad() > 0) {
			maquinaDeChicles.setEstado(new EstadoSinMoneda(maquinaDeChicles));
		} else {
			System.out.println("Ups, ya no hay más chicles!");
			maquinaDeChicles.setEstado(new EstadoSinStock(maquinaDeChicles));
		}
	}
    @Override
	public void recargar() { }
    @Override
	public String toString() {
		return "entregando un chicle";
	}
}