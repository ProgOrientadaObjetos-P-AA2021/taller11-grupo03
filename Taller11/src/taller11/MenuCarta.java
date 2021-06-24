
package taller11;

public abstract class MenuCarta extends Menu {
    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;
    
    public MenuCarta(String n, String np, double v, double vb, double pa){
        super(np, np);
        valorPorcionGuarnicion = v;
        valorBebida = vb;
        porcentajeAdicional = pa; 
    }
    
    @Override
    public void CalcularCostoMenu(){
        costoMenu = valorBebida + valorPorcionGuarnicion;
    }
    public void establecerValorPorcionGuarnicion(double n){
        valorPorcionGuarnicion = n;
    }
    
    public void establecerValorBebida(double n){
        valorBebida = n;
    }
    
    public void establecerPorcentajeAdicional(double n){
        porcentajeAdicional = n;
    }
    
    public double obtenerValorPorcionGuarnicion(){
        return valorPorcionGuarnicion;
    }
    public double obtenerValorBebida(){
        return valorBebida;
    }
    public double obtenerPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
}
