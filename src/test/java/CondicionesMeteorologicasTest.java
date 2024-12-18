import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondicionesMeteorologicasTest {

    @Test
    void testEsClimaAptoParaEsquiar_Correcto() {
        CondicionesMeteorologicas clima = new CondicionesMeteorologicas(-5, 10, false, false); // Temperatura baja, humedad baja, sin precipitaciones
        assertTrue(clima.esClimaAptoParaEsquiar(), "El clima debería ser apto para esquiar.");
    }

    @Test
    void testEsClimaAptoParaEsquiar_TemperaturaAlta() {
        CondicionesMeteorologicas clima = new CondicionesMeteorologicas(5, 10, false, false); // Temperatura alta
        assertFalse(clima.esClimaAptoParaEsquiar(), "El clima no debería ser apto si la temperatura es alta.");
    }

    @Test
    void testEsClimaAptoParaEsquiar_HumedadAlta() {
        CondicionesMeteorologicas clima = new CondicionesMeteorologicas(-5, 20, false, false); // Humedad alta
        assertFalse(clima.esClimaAptoParaEsquiar(), "El clima no debería ser apto si la humedad es alta.");
    }

    @Test
    void testEsClimaAptoParaEsquiar_ConPrecipitaciones() {
        CondicionesMeteorologicas clima = new CondicionesMeteorologicas(-5, 10, true, false); // Con precipitaciones
        assertFalse(clima.esClimaAptoParaEsquiar(), "El clima no debería ser apto si hay precipitaciones.");
    }
}
