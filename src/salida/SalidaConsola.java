package salida;

public class SalidaConsola {
    public String texto;
    public SalidaConsola (String texto) {
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Usted ingreso: " + this.texto);
    }
}
