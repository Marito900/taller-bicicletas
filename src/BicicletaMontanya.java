public class BicicletaMontanya extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta, int añoFabricacion, double peso, int cantidadSuspensiones) {
        super(codigoBicicleta, añoFabricacion, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }
    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion(){
        double costo = 30000;
        if (cantidadSuspensiones > 1 ){
            costo = costo * 1.15; // +15%
        }
        return costo;
    }
}
