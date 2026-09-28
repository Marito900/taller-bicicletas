import java.util.ArrayList;

public class GestorTallerBicicletas {

    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void registrarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta registrada correctamente: " + bicicleta);
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> resultado = new ArrayList<>();
        for (Bicicleta b :  bicicletas) {
            if (b.getCodigoBicicleta().equals(codigo)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
