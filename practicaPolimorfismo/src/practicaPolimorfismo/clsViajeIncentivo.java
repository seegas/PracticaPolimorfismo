package practicaPolimorfismo;

import java.util.Date;

public class clsViajeIncentivo extends clsViaje {
	 

	/**
	 * Empresa que patrocina el viaje al empleado
	 */
	 private String empresa;
	 //Constructor, getters and setters
	 public clsViajeIncentivo(String Origen, String Destino, int costo, Date fechaSalida, Date fechaLlegada,String empresa) {
			super(Origen, Destino, costo, fechaSalida, fechaLlegada);
			this.empresa=empresa;
		}
	 public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	 public String descripcion() {
	 return "Viaje incentivo que te envia la empresa " + empresa;
	 }

	 public String cualquierMetodo2() {
	 return "Método implementado en la clase hija viaje de incentivo";
	 }
}
