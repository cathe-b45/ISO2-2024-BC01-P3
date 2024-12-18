public class CondicionesMeteorologicas {
    private double temperatura;
    private double humedad;
    private boolean precipitaciones;
    private boolean nublado;

    public CondicionesMeteorologicas(double temperatura, double humedad, boolean precipitaciones, boolean nublado) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.precipitaciones = precipitaciones;
        this.nublado = nublado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public boolean isPrecipitaciones() {
        return precipitaciones;
    }

    public boolean isNublado() {
        return nublado;
    }

    public boolean esClimaAptoParaEsquiar() {
        return this.temperatura < 0 && this.humedad < 15 && !this.precipitaciones;
    }

}
