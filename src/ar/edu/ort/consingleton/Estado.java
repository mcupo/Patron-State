package ar.edu.ort.consingleton;

//Clase Estado
public interface Estado {

	public void insertarMoneda(MaquinaDeChicles maquinaDeChicles);
	public void sacarMoneda(MaquinaDeChicles maquinaDeChicles);
	public void girarManivela(MaquinaDeChicles maquinaDeChicles);
	public void entregarChicle(MaquinaDeChicles maquinaDeChicles);
	public void recargar(MaquinaDeChicles maquinaDeChicles);
	
}