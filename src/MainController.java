/**
 * Controlador principal de la aplicación.
 * Decide que controlador cargar según la vista pasada en el constructor
 * rcristoball(raucrili@gmail.com)
 */
public class MainController {
    //Controladores según la distintas vistas
    public enum Controllers{CLI,GUI};
    
    protected Controllers ctrl;
    
    public Controllers getCtrl(){
        return this.ctrl;
    }
    
    public MainController(Controllers ctrls){
        this.ctrl=ctrls;
        
        switch(this.ctrl){
            case CLI:
                //Carga el controlador de la vista CLI
                System.out.println("Controlador CLI: No Implementado");
                break;
            case GUI:
                //Carga el controlador de la Vista GUI
                System.out.println("Controlador GUI: No Implementado");
                break;
        }
    }
}
