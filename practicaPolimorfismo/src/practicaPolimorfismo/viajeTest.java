package practicaPolimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

public class viajeTest {

    public viajeTest() {
    }

    /**
     * Test de la clase clsclsViajeFamiliar.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testclsclsViajeFamiliar() throws ParseException {
        System.out.println("Viaje familiar");
        clsViajeFamiliar clsViaje = new clsViajeFamiliar("Popay�n", "Bogot�", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
        assertEquals("Popay�n", clsViaje.getOrigen());
        assertEquals("Bogot�", clsViaje.getDestino());
        assertEquals(1250000, clsViaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), clsViaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), clsViaje.getFechaLlegada());
        assertEquals(5, clsViaje.getFamilia());
        assertEquals("Viaje para disfrutar con toda tu familia", clsViaje.descripcion());
        assertEquals("Cualquier m�todo implementado en la clase base", clsViaje.cualquierMetodo());
        assertEquals("M�todo implementado en la clase hija viaje familiar", clsViaje.cualquierMetodo2());
    }

    /**
     * Test de la clase clsclsViajeIncentivo.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testclsclsViajeIncentivo() throws ParseException {
        System.out.println("Viaje incentivo");
        clsViajeIncentivo clsViaje = new clsViajeIncentivo("Popay�n", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
        assertEquals("Popay�n", clsViaje.getOrigen());
        assertEquals("Medellin", clsViaje.getDestino());
        assertEquals(2100000, clsViaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), clsViaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), clsViaje.getFechaLlegada());
        assertEquals("Emtel", clsViaje.getEmpresa());
        assertEquals("Viaje incentivo que te envia la empresa Emtel", clsViaje.descripcion());
        assertEquals("Cualquier m�todo implementado en la clase base", clsViaje.cualquierMetodo());
        assertEquals("M�todo implementado en la clase hija viaje de incentivo", clsViaje.cualquierMetodo2());
    }

    /**
     * Test de la clase clsclsViajeIndividual.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testclsclsViajeIndividual() throws ParseException {
        System.out.println("Viaje individual");
        clsViaje clsViaje = new clsViajeIndividual("Popay�n", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popay�n", clsViaje.getOrigen());
        assertEquals("San Andres", clsViaje.getDestino());
        assertEquals(4250000, clsViaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), clsViaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), clsViaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje individual", clsViaje.descripcion());
        assertEquals("Cualquier m�todo implementado en la clase base", clsViaje.cualquierMetodo());
        assertEquals("Cualquier m�todo2 implementado en la clase base", clsViaje.cualquierMetodo2());

    }

    /**
     * Test de la clase clsViajeTodoIncluido.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testclsViajeTodoIncluido() throws ParseException {
        System.out.println("Viaje todo incluido");
        clsViaje clsViaje = new clsViajeTodoIncluido("Popay�n", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popay�n", clsViaje.getOrigen());
        assertEquals("Cartagena", clsViaje.getDestino());
        assertEquals(7350000, clsViaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), clsViaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), clsViaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje todo incluido", clsViaje.descripcion());
        assertEquals("Cualquier m�todo implementado en la clase base", clsViaje.cualquierMetodo());
        assertEquals("Cualquier m�todo2 implementado en la clase base", clsViaje.cualquierMetodo2());
    }

}


