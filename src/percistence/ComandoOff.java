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
public class ComandoOff implements Command{
    
    private int IdBoton;
    private BotonSelecionar miBotonSelec = new BotonSelecionar();
    private Accion miAccion = new Accion();
    
    public ComandoOff(int Id){
        this.IdBoton = Id;
    }

    @Override
    public void Execute() {
        miBotonSelec.cambiarEstadoBoton(IdBoton, miAccion.Off());
    }
    
    
}
