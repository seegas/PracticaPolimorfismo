package practicaPolimorfismo;

import java.util.Date;

public abstract class clsViaje
{
	 protected String origen;
	 protected String destino;
	 protected int costo;
	 protected Date fechaSalida;
	 protected Date fechaLlegada;
	 
	 // Constructores, getters y setters
	
	 
	public clsViaje (String Origen, String Destino, int costo, Date fechaSalida,Date fechaLlegada) {
		this.origen=Origen;
		this.destino=Destino;
		this.costo=costo;
		this.fechaSalida=fechaSalida;
		this.fechaLlegada=fechaLlegada;
		
	}
	 
	protected String getOrigen() {
		return origen;
	}



	protected void setOrigen(String origen) {
		this.origen = origen;
	}



	protected String getDestino() {
		return destino;
	}



	protected void setDestino(String destino) {
		this.destino = destino;
	}



	protected int getCosto() {
		return costo;
	}



	protected void setCosto(int costo) {
		this.costo = costo;
	}



	protected Date getFechaSalida() {
		return fechaSalida;
	}



	protected void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	protected Date getFechaLlegada() {
		return fechaLlegada;
	}



	protected void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}


	//METODOS PARA SOBRESCRIBIR
	
	public abstract String descripcion();
	 
	public String cualquierMetodo()
	 {
	 return "Cualquier método implementado en la clase base";
	 }
	 
	 public String cualquierMetodo2()
	 {
	 return "Cualquier método2 implementado en la clase base";
	 }
	
}

//LabIngSw2