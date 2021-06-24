/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

public class MenuEconomico extends Menu{
    private double porcentajeDescuento;
    
    public MenuEconomico(String n){
        super(n);
    }
    
    @Override
    public void calcularCostoMenu(){
        costoMenu = costoInicialMenu + porcentajeDescuento;
    }
    public void establecerPorcentajeDescuento(double pD){
        porcentajeDescuento = (costoInicialMenu*0.10);
    }
    
    public double obtenerPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    @Override
    public String toString() {
        String cadena = String.format("Menú Económico\n"
                + "Nombre del plato: %s\n"
                + "Valor del menú: %.2f\n"
                + "Porcentaje de descuento: %.2f\n",
                obtenerNombrePlato(),
                obtenerCostoMenu(),
                obtenerInicialMenu(),
                porcentajeDescuento);

        return cadena;
    }
}
