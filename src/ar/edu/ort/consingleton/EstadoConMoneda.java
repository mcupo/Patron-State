package ar.edu.ort.consingleton;

//Clase EstadoConcreto
public class EstadoConMoneda implements Estado {
  
	@Override
	public void insertarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No podes insertar otra moneda");
	}
	@Override
	public void sacarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Moneda devuelta");
		maquinaDeChicles.setEstado(new EstadoSinMoneda());
	}
	@Override
	public void girarManivela(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Giraste la manivela...");
		maquinaDeChicles.setEstado(new EstadoVendiendoChicle());
	}
	@Override
    public void entregarChicle(MaquinaDeChicles maquinaDeChicles) {
        System.out.println("No se entrego chicle");
    } 
	@Override
    public void recargar(MaquinaDeChicles maquinaDeChicles) { 
		System.out.println("Solo se puede recargar cuando no haya mas stock");
	}
	@Override
	public String toString() {
		return "esperando que giren la manivela";
	}
}