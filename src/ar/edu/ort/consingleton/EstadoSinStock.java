package ar.edu.ort.consingleton;

//Clase EstadoConcreto
public class EstadoSinStock implements Estado {

    @Override
	public void insertarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No podes insergar una moneda, la máquina no tiene más chicles");
	}
    @Override
	public void sacarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No podes sacar la moneda, no hay ninguna moneda insertada");
	}
    @Override
	public void girarManivela(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No hay chicles");
	}
    @Override
	public void entregarChicle(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No se entrego chicle");
	}
    @Override
	public void recargar(MaquinaDeChicles maquinaDeChicles) { 
    	maquinaDeChicles.setEstado(new EstadoSinMoneda());
	}
    @Override
	public String toString() {
		return "sin stock!";
	}
}