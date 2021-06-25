/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String n, double vH,
            double vP, double cI) {
        super(n, cI);
        valorHelado = vH;
        valorPastel = vP;
    }

    @Override
    public void calcularCostoMenu() {
        costoMenu = costoInicialMenu + valorHelado + valorPastel;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú del Día\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor del helado: %.2f\n"
                + "Valor del pastel: %.2f\n"
                + "Valor del menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerInicialMenu(),
                valorHelado,
                valorPastel,
                obtenerCostoMenu());

        return cadena;
    }
}
