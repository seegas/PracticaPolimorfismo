package practicaPolimorfismo;

import java.util.Date;

public class clsViajeIndividual extends clsViaje {
	 

	// Constructor
	public clsViajeIndividual(String Origen, String Destino, int costo, Date fechaSalida, Date fechaLlegada) {
		super(Origen, Destino, costo, fechaSalida, fechaLlegada);
		// TODO Auto-generated constructor stub
	}
	 @Override
	 public String descripcion() {
	 return "Disfruta tu viaje individual";
	 }
	 //No se sobreescribe cualquierMetodo2()
	}

