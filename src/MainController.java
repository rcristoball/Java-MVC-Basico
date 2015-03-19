
import Models.CalculadoraModel;
import cli.controllers.CLIController;

/**
 * Controlador principal de la aplicación.
 * Decide que controlador cargar según la vista pasada en el constructor
 * rcristoball(raucrili@gmail.com)
 */
public class MainController {
    
    public MainController(){
        //Carga el controlador de la vista CLI
        new CLIController(new CalculadoraModel());
    }
}
