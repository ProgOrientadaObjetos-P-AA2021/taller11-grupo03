/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

public class MenuNiños extends Menu{
    protected double valorHelado;
    protected double valorPastel;
    
    public MenuNiños(String n, double vM, double vI, double vH, double vP){
        super(n, vM, vI);
        valorHelado = vH;
        valorPastel = vP;
    }
    
    public void establecerValorHelado(double vH){
        valorHelado = vH;
    }
    
    public void establecerValorPastel(double vP){
        valorPastel = vP;
    }
    
    public double obtenerValorHelado(){
        return valorHelado;
    }
    
    public double obtenerValorPastel(){
        return valorPastel;
    }
    
    public String toString() {
        String cadena = String.format("Menú del Día\n"
                + "Nombre del plato: %s\n"
                + "Valor del menú: %.2f\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor del helado: %.2f\n"
                + "Valor del pastel: %.2f\n",
                obtenerNombrePlato(),
                obtenerCostoMenu(),
                obtenerCostoMenu(),
                valorHelado,
                valorPastel);

        return cadena;
    }
}
