package ar.edu.ort.sinsingleton;

//Clase EstadoConcreto
public class EstadoSinMoneda implements Estado {

    MaquinaDeChicles maquinaDeChicles;
    
    public EstadoSinMoneda(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }
    
	@Override
	public void insertarMoneda() {
		System.out.println("Insertaste una moneda");
		maquinaDeChicles.setEstado(new EstadoConMoneda(maquinaDeChicles));
	}
	@Override
	public void sacarMoneda() {
		System.out.println("No insertaste ninguna moneda");
	}
	@Override
	public void girarManivela() {
		System.out.println("Giraste la manivela pero no hay moneda");	
	}
	@Override
	public void entregarChicle() {
		System.out.println("Primero tenes que pagar");
	}
	@Override
	public void recargar() {}
	@Override
	public String toString() {
		return "esperando una moneda";
	}
}
