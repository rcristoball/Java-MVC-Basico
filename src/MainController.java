
import Models.CalculadoraModel;
import cli.controllers.CLIController;
import gui.controller.GUIController;

/**
 * Controlador principal de la aplicación.
 * Decide que controlador cargar según la vista pasada en el constructor
 * rcristoball(raucrili@gmail.com)
 */
public class MainController {
    //Controladores según la distintas vistas
    public enum Controllers{CLI,GUI};
    
    protected Controllers ctrl;
    protected CalculadoraModel model;
    
    public Controllers getCtrl(){
        return this.ctrl;
    }
    
    public MainController(Controllers ctrls){
        this.ctrl=ctrls;
        this.model=new CalculadoraModel();
        
        switch(this.ctrl){
            case CLI:
                //Carga el controlador de la vista CLI
                new CLIController(this.model);
                break;
            case GUI:
                //Carga el controlador de la Vista GUI
                new GUIController(this.model);
                break;
        }
    }
}
