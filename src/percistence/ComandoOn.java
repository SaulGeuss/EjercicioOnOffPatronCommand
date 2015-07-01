/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistence;

/**
 *
 * @author Saul
 */
public class ComandoOn implements Command{
    
    private int IdBoton;
    private BotonSelecionar miBotonSelec = new BotonSelecionar();
    private Accion miAccion = new Accion();
    
    public ComandoOn(int id){
        this.IdBoton = id;
    }
            
    @Override
    public void Execute() {
        miBotonSelec.cambiarEstadoBoton(IdBoton);
    }
    
    
    
    
    
}
