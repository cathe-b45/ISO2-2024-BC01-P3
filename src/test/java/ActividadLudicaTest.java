import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActividadLudicaTest {

    @Test
    void testRecomendarActividad_QuedarseEnCasa() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-5, 10, true, false); // Condiciones para quedarse en casa
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false);

        assertEquals("Quedarse en casa.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_IrAEsquiar() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-5, 10, false, false); // Condiciones para esquiar
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false); // Aforo permitido

        assertEquals("Ir a esquiar.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_HacerSenderismo() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(10, 50, false, false); // Condiciones para senderismo
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false); // Aforo permitido

        assertEquals("Hacer senderismo.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_HacerTurismo() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 40, false, false); // Condiciones para turismo
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false); // Sin restricciones en la ciudad

        assertEquals("Hacer turismo al aire libre.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_IrDeCanas() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(30, 40, false, false); // Condiciones para ir de cañas
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false); // Aforo permitido

        assertEquals("Irse de cañas.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_IrALaPlaya() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(35, 40, false, false); // Condiciones para playa/piscina
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, false); // Aforo permitido

        assertEquals("Ir a la playa o a la piscina.", actividad.recomendarActividad());
    }

    @Test
    void testRecomendarActividad_NoActividades() {
        Persona persona = new Persona("Juan", "Pérez", true, false, true); // La persona puede realizar actividades
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(15, 70, false, true); // Condiciones que no cumplen para ninguna actividad
        ActividadLudica actividad = new ActividadLudica(persona, condiciones, true, true); // Restricciones de ciudad

        assertEquals("No hay actividades recomendadas.", actividad.recomendarActividad());
    }
}
