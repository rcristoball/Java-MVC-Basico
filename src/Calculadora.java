/**
 * Punto de entrada de la aplicación java
 * Esta aplicación es un ejemplo básico de java usando el patrón MVC
 * La aplicación se inicializa con un parámetro que idica si se quiere lanzar
 * en modo línea de comando o en modo gráfico.
 * @author rcristoball(raucrili@gmail.com)
 */
public class Calculadora {   
    /**
     * La aplicación solo admite un parámetro que pude ser:
     * --cli: para ejecutar la aplicación en modo línea de comandos
     * --gui: para lanzar la aplicación en modo gráfico
     * --help: muestra la ayuda de los parámetros para inicializar la aplicación
     * @param args parámetros de la aplicación
     */
    public static void main(String[] args){
        new MainController();
    }
}
