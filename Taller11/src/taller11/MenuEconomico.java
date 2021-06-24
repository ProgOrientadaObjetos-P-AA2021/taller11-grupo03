/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

public class MenuEconomico extends Menu{
    protected double porcentajeDescuento;
    
    public MenuEconomico(String n, double vM, double vI, double pD){
        super(n, vM, vI);
    }
    
    public void establecerPorcentajeDescuento(double pD){
        porcentajeDescuento = pD;
    }
    
    public double obtenerPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    public String toString() {
        String cadena = String.format("Menú Económico\n"
                + "Nombre del plato: %s\n"
                + "Valor del menú: %.2f\n"
                + "Porcentaje de descuento: %.2f\n",
                obtenerNombrePlato(),
                obtenerCostoMenu(),
                obtenerCostoInicialMenu(),
                porcentajeDescuento);

        return cadena;
    }
}
