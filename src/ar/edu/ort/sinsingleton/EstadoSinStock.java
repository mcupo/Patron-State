package ar.edu.ort.sinsingleton;

//Clase EstadoConcreto
public class EstadoSinStock implements Estado {

    MaquinaDeChicles maquinaDeChicles;
    
    public EstadoSinStock(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }
    @Override
	public void insertarMoneda() {
		System.out.println("No podes insergar una moneda, la máquina no tiene más chicles");
	}
    @Override
	public void sacarMoneda() {
		System.out.println("No podes sacar la moneda, no hay ninguna moneda insertada");
	}
    @Override
	public void girarManivela() {
		System.out.println("No hay chicles");
	}
    @Override
	public void entregarChicle() {
		System.out.println("No se entrego chicle");
	}
    @Override
	public void recargar() { 
    	maquinaDeChicles.setEstado(new EstadoSinMoneda(maquinaDeChicles));
	}
    @Override
	public String toString() {
		return "sin stock!";
	}
}