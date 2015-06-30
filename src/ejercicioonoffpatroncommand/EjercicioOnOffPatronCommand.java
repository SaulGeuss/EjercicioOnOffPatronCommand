/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonoffpatroncommand;

import percistence.Boton;
import percistence.BotonSelecionar;

/**
 *
 * @author adiseño.2015
 */
public class EjercicioOnOffPatronCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boton miBoton = new Boton(1, true);
        Boton miBoton2 = new Boton(2, true);
        Boton miBoton3 = new Boton(3, true);
        BotonSelecionar miBotonSelec = new BotonSelecionar();
        miBotonSelec.agregarBoton(miBoton);
        miBotonSelec.agregarBoton(miBoton2);
        miBotonSelec.agregarBoton(miBoton3);
        miBotonSelec.listaBotones();
        miBotonSelec.quitarBoton(3);
        miBotonSelec.listaBotones();
    }
    
}
