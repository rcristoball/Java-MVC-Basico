package gui.controller;

import Models.CalculadoraModel;
import gui.views.GUIView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;

/**
 * Controlador de la vista GUI
 * rcristoball(raucrili@gmail.com)
 */
public class GUIController {
    
    private GUIView view;
    private CalculadoraModel model;
    
    public GUIController(CalculadoraModel model){
        this.model=model;
        this.view=new GUIView();
        
        //Método que se ejecuta cuando se produce el evento click en el boton
        //calcular de la vista. Es el mediador entre la vista y el modelo
        this.view.AddBtnCalcularListener((ActionEvent e) -> {
            try {
                //Calcula la suma, ejecutando el método del modelo.
                this.model.sumaDosNumeros(
                        this.view.getSumando1(),
                        this.view.getSumando2()
                );
                //Actualiza la vista con el resultado de la vista
                this.view.setCalcResult(this.model.getCalcResult());
            } catch (Exception ex) {
                //si se produce un error actualiza la vista para mostrar 
                //el error
                this.view.setErrorMessage(ex.getMessage());
            }
        });
        
        this.view.setVisible(true);
    }
}
