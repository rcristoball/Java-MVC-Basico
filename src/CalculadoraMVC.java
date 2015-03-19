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
        //Comprueba que solo se ha introducido un solo parámetro
        if(args.length==1){
            //Según el parámetro lanza el controlador correspondiente
            run(args[0]);
        }else if(args.length>1){
            //Se han introducido más de un parámetro
            System.out.println("Ha introducido más de un parámetro en la orden."
                    + " Este comando solo admite un único parámetro.\n");
            help();
        }else {
            //No se han introducido parámetros
            System.out.println("No ha introducido ningún parámetro \n");
            help();
        }
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
                new MainController(MainController.Controllers.CLI);
                break;
            case "--gui":
                new MainController(MainController.Controllers.GUI);
                break;
            case "--help":
            default:
                System.out.println("<"+cmd+">"+" no es un parámetro válido.\n");
                help();
        } 
    }
}
