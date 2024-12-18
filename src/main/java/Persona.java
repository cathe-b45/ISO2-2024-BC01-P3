public class Persona {
    private String nombre;
    private String apellidos;
    private boolean estaSano;
    private boolean contactoCovid;
    private boolean pasaporteCovid;

    public Persona(String nombre, String apellidos, boolean estaSano, boolean contactoCovid, boolean pasaporteCovid) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estaSano = estaSano;
        this.contactoCovid = contactoCovid;
        this.pasaporteCovid = pasaporteCovid;
    }

    public boolean puedeRealizarActividades() {
        return estaSano && !contactoCovid && pasaporteCovid;
    }
}
