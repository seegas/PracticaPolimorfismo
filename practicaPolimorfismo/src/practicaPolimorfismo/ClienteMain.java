package practicaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteMain {
	 /**
	 * Arreglo polimórfico de clsViajes
	 */
	 public static List<clsViaje> clsViajes = new ArrayList();
	 public static void main(String[] args) {
	 leerclsViajes();
	 mostrarclsViajes();
	 }
	 /**
	 * Lee clsViajes en el arreglo polimórfico
	 */
	 public static void leerclsViajes() {
	 try {
	 clsViaje clsViaje1 = new clsViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
	 clsViajes.add(clsViaje1);
	 clsViaje clsViaje2 = new clsViajeIncentivo("Popayán", "Medellin", 2100000, new
	SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
	SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
	 clsViajes.add(clsViaje2);
	 clsViaje clsViaje3 = new clsViajeIndividual("Popayán", "San Andres", 4250000,
			 new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
			 SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
			  clsViajes.add(clsViaje3);
			  clsViaje clsViaje4 = new clsViajeTodoIncluido("Popayán", "Cartagena", 7350000,
			 new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
			 SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
			  clsViajes.add(clsViaje4);
			  } catch (ParseException ex) {
			  Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null,
			 ex);
			  }
			  }
			  /**
			  * Recorre e imprime datos del arreglo polimófico
			  */
			  public static void mostrarclsViajes() {
			  // En este caso vemos que todos los clsViajes ejecutan el método "descripcion()" de forma diferente
			  // ya que al ser este método abstracto en la clase padre, les forzamos a las clases hijas a que
			  // implementen ese método.
			  for (clsViaje clsViaje : clsViajes) {
			  System.out.println("Origen: " + clsViaje.getOrigen());
			  System.out.println("Destino: " + clsViaje.getDestino());
			  System.out.println("Fecha salida: " + clsViaje.getFechaSalida());
			  System.out.println("Fecha llegada: " + clsViaje.getFechaLlegada());
			  System.out.println("Costo: " + clsViaje.getCosto());
			  System.out.println("Descripción: " + clsViaje.descripcion());
			  System.out.println("Cualquier método: " + clsViaje.cualquierMetodo());
			  System.out.println("Cualquier método2: " + clsViaje.cualquierMetodo2());
			  System.out.println("");
			  }
			  }
			 }
