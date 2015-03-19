package Models;

/**
 * Modelo de datos de la calculadora
 * rcristoball(raucrili@gmail.com)
 */
public class CalculadoraModel {
    private double calcResult;
    
    public double getCalcResult(){
        return this.calcResult;
    }
    
    public CalculadoraModel(){
        this.calcResult=0;
    }
    
    public void sumaDosNumeros(double num1, double num2){
        this.calcResult=num1+num2;
    }
}