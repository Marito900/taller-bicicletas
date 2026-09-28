public class Main {
    public static void main(String[] args) {
        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5,
                60, false, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24,
                45, true, false);
        BicicletaMontanya m1 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontanya m2 = new BicicletaMontanya("BIC-M02", 2020, 12, 1);

        e1.activarGarantiaExtendida();

        gestor.registrarBicicleta(e1);
        gestor.registrarBicicleta(e2);
        gestor.registrarBicicleta(m1);
        gestor.registrarBicicleta(m2);


        for (Bicicleta b : gestor.buscarPorCodigo("BIC-E01")) {
            System.out.println(b);
        }
        for (Bicicleta b : gestor.getBicicletas()){
            System.out.println(b);

        }
    }
}