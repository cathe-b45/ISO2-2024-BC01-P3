import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        // Leer datos de la persona
        String nombre = IOHelper.leerCadena("Introduce tu nombre");
        String apellidos = IOHelper.leerCadena("Introduce tus apellidos");
        boolean estaSano = IOHelper.leerBooleano("¿Estás sano? (true/false)");
        boolean contactoCovid = IOHelper.leerBooleano("¿Has estado en contacto con alguien infectado? (true/false)");
        boolean pasaporteCovid = IOHelper.leerBooleano("¿Tienes pasaporte COVID en regla? (true/false)");

        Persona persona = new Persona(nombre, apellidos, estaSano, contactoCovid, pasaporteCovid);

        // Leer condiciones meteorológicas
        double temperatura = IOHelper.leerDouble("Introduce la temperatura actual");
        double humedad = IOHelper.leerDouble("Introduce la humedad relativa (%)");
        boolean precipitaciones = IOHelper.leerBooleano("¿Está lloviendo o nevando? (true/false)");
        boolean nublado = IOHelper.leerBooleano("¿Está nublado? (true/false)");

        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(temperatura, humedad, precipitaciones, nublado);

        // Leer aforo y restricciones
        boolean aforoPermitido = IOHelper.leerBooleano("¿Hay aforo permitido? (true/false)");
        boolean restriccionesCiudad = IOHelper.leerBooleano("¿La ciudad tiene restricciones de confinamiento? (true/false)");

        ActividadLudica actividad = new ActividadLudica(persona, condiciones, aforoPermitido, restriccionesCiudad);

        // Mostrar la actividad recomendada
        String recomendacion = actividad.recomendarActividad();
        IOHelper.escribirCadena("La actividad recomendada es: " + recomendacion);
    }
}
