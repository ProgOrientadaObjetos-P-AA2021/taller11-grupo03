
package taller11;

public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String np, double v, double vb) {
        super(np);
        valorPorcionGuarnicion = v;
        valorBebida = vb;
    }

    @Override
    public void calcularCostoMenu() {
        costoInicialMenu = valorBebida + valorPorcionGuarnicion;
        costoMenu = costoInicialMenu + porcentajeAdicional;
    }
    public void establecerValorPorcionGuarnicion(double n) {
        valorPorcionGuarnicion = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = (costoInicialMenu*0.10);
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    @Override
    public String toString(){
        String cadena = String.format("Menú A la Carta\n"
                + "Nombre del plato: %s\n"
                + "Valor del menu: %2.f\n"
                + "Valor inicial del menu: %2.f\n"
                + "Valor porcion de guarnicion: %2.f\n"
                + "Valor de bebida: %2.f\n"
                + "Porcentaje de servicio: %2.f\n",
                obtenerNombrePlato(),
                obtenerCostoMenu(),
                obtenerInicialMenu(),
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional());
        return cadena;
    
    }
}
