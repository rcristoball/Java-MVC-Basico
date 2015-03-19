package cli.views;

import java.util.Scanner;

/**
 * Vista de la aplicación ejecutada en línea de comandos.
 * rcristoball(raucrili@gmail.com)
 */
public class CLIView {
    
    public double getSumando1() throws Exception{
        return getSumando(1);
        
    }
    public double getSumando2() throws Exception{
        return getSumando(2);
    }
    
    private double getSumando(int index) throws Exception{
        System.out.print("Introduzca el sumando "+index+": ");
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextDouble();
        }catch(Exception ex){
            throw new Exception("Sumando "+index+ " no es válido" );
        }
    }
    
    public final void setCalcResult(double calcResult){
        System.out.println("Resultado:  "+calcResult);
    }
    
    public final void setErrorMessage(String errorMessage){
        System.out.println("Error: "+ errorMessage);
    }
}
