package ar.edu.ort.sinsingleton;

//Clase Contexto
public class MaquinaDeChicles {
 
	Estado estado;
	int cantidad = 0;
 
	public MaquinaDeChicles(int numeroDeChicles) {
		this.cantidad = numeroDeChicles;
 		if (numeroDeChicles > 0) {
			estado = new EstadoSinMoneda(this);
		} else {
			estado = new EstadoSinStock(this);
		}
	}
 
	public void insertarMoneda() {
		estado.insertarMoneda();
	}
 
	public void sacarMoneda() {
		estado.sacarMoneda();
	}
 
	public void girarManivela() {
		estado.girarManivela();
		estado.entregarChicle();
	}
 
	void soltarChicle() {
		System.out.println("Un chicle viene rodando...");
		if (cantidad != 0) {
			cantidad = cantidad - 1;
		}
	}
 
	int getCantidad() {
		return cantidad;
	}
 
	void recargar(int count) {
		this.cantidad += count;
		System.out.println("La máquina acaba de ser recargarda; su nueva cantidad es: " + this.cantidad);
		estado.recargar();
	}

	void setEstado(Estado estado) {
		this.estado = estado;
	}
    public Estado getState() {
        return estado;
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