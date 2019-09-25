package practicaPolimorfismo;

import java.util.Date;

public class clsViajeFamiliar extends clsViaje 
{
	 
	/**
	 * Cantidad de integrantes de la familia
	 */
	 private int familia;
	 //Constructor getters and setters
	 public clsViajeFamiliar(String Origen, String Destino, int costo, Date fechaSalida, Date fechaLlegada,int familia) {
			super(Origen, Destino, costo, fechaSalida, fechaLlegada);
			this.familia=familia;
		}
	 @Override
	 public String descripcion() {
	 return "Viaje para disfrutar con toda tu familia";
	 }
	 public int getFamilia() {
		return familia;
	}
	public void setFamilia(int familia) {
		this.familia = familia;
	}
	@Override
	 public String cualquierMetodo2() {
	 return "Método implementado en la clase hija viaje familiar";
	 }
	}
