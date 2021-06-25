/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Cuenta {

    private String nombre;
    private ArrayList<Menu> menus = new ArrayList<>();
    private double subtotal;
    private double total;
    private double iva;

    public Cuenta(String n, ArrayList<Menu> lista, double i) {
        nombre = n;
        menus = lista;
        iva = i;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerMenus(ArrayList<Menu> lista) {
        menus = lista;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < obtenerMenus().size(); i++) {
            subtotal = subtotal + obtenerMenus().get(i).costoMenu;
        }
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public void establecerTotal() {
        total = subtotal + (subtotal * iva);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Menu> obtenerMenus() {
        return menus;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cuenta\n"
                + "Nombre del Cliente: %s\n"
                + "Lista de Menus\n\n", obtenerNombre());
        for (int i = 0; i < obtenerMenus().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerMenus().get(i));
        }
        cadena = String.format("\n%sSubtotal de cuenta: %.2f\n"
                + "Iva: %.2f\n"
                + "Total de cuenta: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerTotal());
        return cadena;
    }

}
