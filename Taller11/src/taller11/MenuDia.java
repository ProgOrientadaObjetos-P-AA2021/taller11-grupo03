/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

public class MenuDia extends Menu{
    protected double valorPostre;
    protected double valorBebida;
    
    public MenuDia(String n, double vM, double vI, double vP, double vB){
        super(n, vM, vI);
    }
    
    public void establecerValorPostre(double vP){
        valorPostre = vP;
    }
    
    public void establecerValorBebida(double vB){
        valorBebida = vB;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public String toString() {
        String cadena = String.format("Menú del Día\n"
                + "Nombre del plato: %s\n"
                + "Valor del menú: %.2f\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor del postre: %.2f\n"
                + "Valor de la bebida: %.2f\n",
                obtenerNombrePlato(),
                obtenerCostoMenu(),
                obtenerCostoInicialMenu(),
                valorPostre,
                valorBebida);

        return cadena;
    }
}
