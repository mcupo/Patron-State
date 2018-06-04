package ar.edu.ort.sinsingleton;

//Clase EstadoConcreto
public class EstadoConMoneda implements Estado {

	MaquinaDeChicles maquinaDeChicles;
	 
	public EstadoConMoneda(MaquinaDeChicles maquinaDeChicles) {
		this.maquinaDeChicles = maquinaDeChicles;
	}
  
	@Override
	public void insertarMoneda() {
		System.out.println("No podes insertar otra moneda");
	}
	@Override
	public void sacarMoneda() {
		System.out.println("Moneda devuelta");
		maquinaDeChicles.setEstado(new EstadoSinMoneda(maquinaDeChicles));
	}
	@Override
	public void girarManivela() {
		System.out.println("Giraste la manivela...");
		maquinaDeChicles.setEstado(new EstadoVendiendoChicle(maquinaDeChicles));
	}
	@Override
    public void entregarChicle() {
        System.out.println("No se entrego chicle");
    } 
	@Override
    public void recargar() { }
	@Override
	public String toString() {
		return "esperando que giren la manivela";
	}
}