import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    private Persona persona;

    @BeforeEach
    void setUp() {
        persona = new Persona(
                "Juan",
                "Pérez",
                true, // Está sano
                false, // No ha tenido contacto con personas con COVID
                true // Tiene pasaporte COVID
        );
    }

    @Test
    void testPuedeRealizarActividades_Correcto() {
        assertTrue(persona.puedeRealizarActividades(), "La persona debería poder realizar actividades.");
    }

    @Test
    void testPuedeRealizarActividades_NoSano() {
        persona = new Persona("Juan", "Pérez", false, false, true);
        assertFalse(persona.puedeRealizarActividades(), "La persona no debería poder realizar actividades si no está sana.");
    }

    @Test
    void testPuedeRealizarActividades_ContactoCOVID() {
        persona = new Persona("Juan", "Pérez", true, true, true);
        assertFalse(persona.puedeRealizarActividades(), "La persona no debería poder realizar actividades si tuvo contacto con alguien infectado.");
    }

    @Test
    void testPuedeRealizarActividades_SinPasaporteCOVID() {
        persona = new Persona("Juan", "Pérez", true, false, false);
        assertFalse(persona.puedeRealizarActividades(), "La persona no debería poder realizar actividades sin pasaporte COVID.");
    }
}
