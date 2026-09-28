public class BicicletaElectrica extends Bicicleta  implements ConGarantiaExtendida{


    private int autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    public BicicletaElectrica(String codigoBicicleta,
                              int añoFabricacion, double peso, int autonomiaKm, boolean bateriaCertificada, boolean garantiaExtendidaActiva) {
        super(codigoBicicleta, añoFabricacion, peso);
        this.autonomiaKm = autonomiaKm;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    public void setGarantiaExtendidaActiva(boolean garantiaExtendidaActiva) {
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    @Override
    public boolean tieneGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        garantiaExtendidaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;
        if (!bateriaCertificada) {
            costo = costo * 1.25;
        }
        return costo;
    }
}


