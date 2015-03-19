package gui.views;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Vista de la aplicación ejecutada en modo gráfico
 * rcristoball(raucrili@gmail.com)
 */
public class GUIView extends JFrame {
    private JTextField txtSumando1;
    private JLabel lblOpSuma;
    private JTextField txtSumando2;
    private JButton btnCalucular;
    private JTextField txtResultado;
    
    public double getSumando1() throws Exception{
        try{
            return Double.parseDouble(txtSumando1.getText());
        }
        catch(Exception ex){
            throw new Exception("Sumando 1: <"+txtSumando1.getText()+
                    ">, no es válido" );
        }
    }
    public double getSumando2() throws Exception{
        try{
            return Double.parseDouble(txtSumando2.getText());
        }
        catch(Exception ex){
            throw new Exception("Sumando 2: <"+txtSumando2.getText()+
                    ">, no es válido" );
        }
    }
    
    public final void setCalcResult(double calcResult){
        txtResultado.setText(Double.toString(calcResult));
    }
    
    public final void setErrorMessage(String errorMessage){
       JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    public void AddBtnCalcularListener(ActionListener al){
        this.btnCalucular.addActionListener(al);
    }
    
    public GUIView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,75);
        this.setTitle("Calculadora");
        
        this.txtSumando1= new JTextField(10);
        calcPanel.add(txtSumando1);
        this.lblOpSuma = new JLabel("+");
        calcPanel.add(lblOpSuma);
        this.txtSumando2 = new JTextField(10);
        calcPanel.add(txtSumando2);
        this.btnCalucular=new JButton("Calculate");
        calcPanel.add(btnCalucular);
        this.txtResultado= new JTextField(10);
        calcPanel.add(txtResultado);     

        this.add(calcPanel);
    }    

}
