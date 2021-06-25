/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author macbookair
 */
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuCarta menucarta = new MenuCarta("Arroz Marinero", 2.00, 0.5, 7.50);
        menucarta.establecerPorcentajeAdicional();

        MenuNiños menuniños1 = new MenuNiños("Combo Caramelo", 4.00, 5.50, 7.00);
        MenuNiños menuniños2 = new MenuNiños("Combo Nutellla", 3.50, 6.00, 8.00);

        MenuEconomico menueconomico = new MenuEconomico("Agachados", 3.25);
        menueconomico.establecerPorcentajeDescuento();

        MenuDia menudia = new MenuDia("Cecina Entera", 1.50, 0.75, 4.00);

        listaMenus.add(menucarta);
        listaMenus.add(menuniños1);
        listaMenus.add(menuniños2);
        listaMenus.add(menueconomico);
        listaMenus.add(menudia);

        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).calcularCostoMenu();
        }

        Cuenta cuentas = new Cuenta("Marshall D. Teach", listaMenus, 0.12);
        cuentas.establecerSubtotal();
        cuentas.establecerTotal();
        System.out.println(cuentas);
    }

}
