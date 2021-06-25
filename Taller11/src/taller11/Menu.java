/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author usuario
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double costoMenu;
    protected double costoInicialMenu;

    public Menu(String np, double cI) {
        nombrePlato = np;
        costoInicialMenu = cI;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public abstract void calcularCostoMenu();

    public void establecerCostoInicialMenu(double n) {
        costoInicialMenu = n;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerCostoMenu() {
        return costoMenu;
    }

    public double obtenerInicialMenu() {
        return costoInicialMenu;
    }
}
