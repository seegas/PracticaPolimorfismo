package practicaPolimorfismo;

import java.util.Date;

public class clsViajeTodoIncluido extends clsViaje {
	 

	// Constructores
	public clsViajeTodoIncluido(String Origen, String Destino, int costo, Date fechaSalida, Date fechaLlegada) {
		super(Origen, Destino, costo, fechaSalida, fechaLlegada);
		
	}
	 @Override
	 public String descripcion() {
	 return "Disfruta tu viaje todo incluido";
	 }
	 //No se sobreescribe cualquierMetodo2()
	}

