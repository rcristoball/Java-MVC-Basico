package cli.controllers;

import Models.CalculadoraModel;
import cli.views.CLIView;

/**
 * Controlador de la vista CLI.
 * rcristoball(raucrili@gmail.com)
 */
public class CLIController {
    private CLIView view;
    private CalculadoraModel model;
    
    public CLIController(CalculadoraModel model){
        try {
            this.model=model;
            this.view=new CLIView();
        } catch (Exception ex) {
            this.view.setErrorMessage(ex.getMessage());
        }
    }

    public void sumaDosNumeros() {
        try {
            this.model.sumaDosNumeros(this.view.getSumando1(),this.view.getSumando2());
            this.view.setCalcResult(this.model.getCalcResult());
        } catch (Exception ex) {
           this.view.setErrorMessage(ex.getMessage());
        }
    }
}
