package ar.edu.ort.consingleton;

//Clase EstadoConcreto declarada como Singleton
public class EstadoSinMoneda implements Estado {
	
	private static Estado instancia;
	private EstadoSinMoneda() {}
	
	public static Estado instancia() {
	if (instancia==null) {
		instancia = new EstadoSinMoneda();
	}
		return instancia;
	}
	@Override
	public void insertarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Insertaste una moneda");
		maquinaDeChicles.setEstado(EstadoConMoneda.instancia());
	}
	@Override
	public void sacarMoneda(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("No insertaste ninguna moneda");
	}
	@Override
	public void girarManivela(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Giraste la manivela pero no hay moneda");	
	}
	@Override
	public void entregarChicle(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Primero tenes que pagar");
	}
	@Override
	public void recargar(MaquinaDeChicles maquinaDeChicles) {
		System.out.println("Solo se puede recargar cuando no haya mas stock");
	}
	@Override
	public String toString() {
		return "esperando una moneda";
	}
}