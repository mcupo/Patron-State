package ar.edu.ort.consingleton;

//Clase Contexto
public class MaquinaDeChicles {
 
	Estado estado;
	int cantidad = 0;
 
	public MaquinaDeChicles(int numeroDeChicles) {
		this.cantidad = numeroDeChicles;
 		if (numeroDeChicles > 0) {
			estado = EstadoSinMoneda.instancia();
		} else {
			estado = EstadoSinStock.instancia();
		}
	}
	public void insertarMoneda() {
		estado.insertarMoneda(this);
	}
	public void sacarMoneda() {
		estado.sacarMoneda(this);
	}
	public void girarManivela() {
		estado.girarManivela(this);
		estado.entregarChicle(this);
	}
	public void soltarChicle() {
		System.out.println("Un chicle viene rodando...");
		if (cantidad != 0) {
			cantidad = cantidad - 1;
		}
	}
	public void recargar(int count) {
		this.cantidad += count;
		System.out.println("\nLa máquina acaba de ser recargarda; su nueva cantidad es: " + this.cantidad);
		estado.recargar(this);
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
    public Estado getState() {
        return estado;
    }
	public int getCantidad() {
		return cantidad;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMáquina de chicles T2000");
		result.append("\nInventario: " + cantidad + " chicle");
		if (cantidad != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("La máquina esta " + estado + "\n");
		return result.toString();
	}
}