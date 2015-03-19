
import Models.CalculadoraModel;
import gui.controller.GUIController;

/**
 * Controlador principal de la aplicación.
 * Decide que controlador cargar según la vista pasada en el constructor
 * rcristoball(raucrili@gmail.com)
 */
public class MainController {
    
    public MainController(){
        new GUIController(new CalculadoraModel());
    }
}
