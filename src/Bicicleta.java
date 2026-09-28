public abstract class Bicicleta {

    private String codigoBicicleta;
    private int añoFabricacion;
    private double peso;

    public Bicicleta(String codigoBicicleta, int añoFabricacion, double peso) {
        this.codigoBicicleta = codigoBicicleta;
        this.añoFabricacion = añoFabricacion;
        this.peso = peso;
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBicicleta='" + codigoBicicleta + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                '}';
    }

    public abstract double calcularCostoMantencion();
}
