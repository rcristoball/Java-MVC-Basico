/**
 * Punto de entrada de la aplicación java
 * Esta aplicación es un ejemplo básico de java usando el patrón MVC
 * La aplicación se inicializa con un parámetro que idica si se quiere lanzar
 * en modo línea de comando o en modo gráfico.
 * @author rcristoball(raucrili@gmail.com)
 */
public class CalculadoraMVC {   
    /**
     * La aplicación solo admite un parámetro que pude ser:
     * --cli: para ejecutar la aplicación en modo línea de comandos
     * --gui: para lanzar la aplicación en modo gráfico
     * --help: muestra la ayuda de los parámetros para inicializar la aplicación
     * @param args parámetros de la aplicación
     */
    public static void main(String[] args){

        //Comprueba que solo se ha introducido un solo parámetro
        if(args.length==1){
            //Según el parámetro lanza el controlador correspondiente
            run(args[0]);
        }
        
        // Si no se pasan parámetros lanza la ayuda
        if(args.length!=1)
            help();
    }

    /**
     * Muestra la ayuda de como ejecutar la aplicación
     */
    private static void help() {
        String str="CalculadoraMVC --cli | --gui | --help\n";
        str+="--cli: Se ejecuta en línea de comando\n";
        str+="--gui: Se ejecuta mediante una interfaz gráfica\n";
        System.out.println(str);
    }

    /**
     * Ejecuta las acciones segun el comando pasado.
     * @param cmd comando a ejecutar
     */
    private static void run(String cmd) {
        String param;
        boolean showHelp=false;
        switch(cmd){
            case "--cli":
                param="cli: línea de comandos: No implementada";
                break;
            case "--gui":
                param="gui: interfaz gráfica: No implementada";
                break;
            case "--help":
                param="help";
                showHelp=true;
                break;
            default:
                param= cmd+" es un parámetro incorrecto";
                showHelp=true;
        }
        
        System.out.println("Calculadora MVC: ("+param+")" );
        
        if(showHelp)
            help();
    }
}
