public class ActividadLudica {
    private Persona persona;
    private CondicionesMeteorologicas condiciones;
    private boolean aforoPermitido;
    private boolean restriccionesCiudad;

    public ActividadLudica(Persona persona, CondicionesMeteorologicas condiciones, boolean aforoPermitido, boolean restriccionesCiudad) {
        this.persona = persona;
        this.condiciones = condiciones;
        this.aforoPermitido = aforoPermitido;
        this.restriccionesCiudad = restriccionesCiudad;
    }

    public String recomendarActividad() {
        if (!persona.puedeRealizarActividades()) {
            return "No puede realizar ninguna actividad.";
        }

        if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && condiciones.isPrecipitaciones()) {
            return "Quedarse en casa.";
        } else if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && !condiciones.isPrecipitaciones() && aforoPermitido) {
            return "Ir a esquiar.";
        } else if (condiciones.getTemperatura() >= 0 && condiciones.getTemperatura() < 15 && !condiciones.isPrecipitaciones() && aforoPermitido) {
            return "Hacer senderismo.";
        } else if (condiciones.getTemperatura() >= 15 && condiciones.getTemperatura() <= 25 && !condiciones.isPrecipitaciones() && !condiciones.isNublado() && condiciones.getHumedad() <= 60 && !restriccionesCiudad) {
            return "Hacer turismo al aire libre.";
        } else if (condiciones.getTemperatura() > 30 && !condiciones.isPrecipitaciones() && aforoPermitido) {
            return "Ir a la playa o a la piscina.";
        } else if (condiciones.getTemperatura() > 25 && condiciones.getTemperatura() <= 30 && !condiciones.isPrecipitaciones() && aforoPermitido) {
            return "Irse de cañas.";
        } else {
            return "No hay actividades recomendadas.";
        }
    }

}
