/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistence;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author adiseño.2015
 */
public class BotonSelecionar {
    
    public int cont = 0;
    Accion miAccion = new Accion();
    ArrayList<Boton> miLista = new ArrayList<>();
    
    public BotonSelecionar(){
        
    }
    
    public void agregarBoton(Boton nuevo){
        miLista.add(nuevo);
        cont++;
        System.out.println("Se agrego el Boton " + cont);
    }
    
    public void cambiarEstadoBoton(int Id){
        Boton miBoton = new Boton();
        Iterator<Boton> miIterador = miLista.iterator();
        while (miIterador.hasNext()) {            
             miBoton = miIterador.next();
             if (miBoton.getId() == Id) {
                 
                 if (miBoton.getEstado() != miAccion.On()) {
                     miBoton.setEstado(Boolean.TRUE);
                     System.out.println("Se cambio el estado del Boton " + Id + " a On");
                 } else{
                    if (miBoton.getEstado() != miAccion.Off()) {
                        miBoton.setEstado(Boolean.FALSE);
                        System.out.println("Se cambio el estado del Boton " + Id + " a Off");
                    }
                 }
                 
            }
        }
    }
    
    public void quitarBoton(int Id){
        Boton miBoton = new Boton();
        Iterator<Boton> miIterador = miLista.iterator();
        while (miIterador.hasNext()) {            
             miBoton = miIterador.next();
             if (miBoton.getId() == Id) {
                miIterador.remove();
                System.out.println("Se elimino el Boton " + Id);
            }
        }
    }
    
    public void listaBotones(){
        Boton miBoton = new Boton();
        Iterator<Boton> miIterador = miLista.iterator();
        while (miIterador.hasNext()) {            
             miBoton = miIterador.next();
             if (miBoton.getEstado() == Boolean.TRUE) {
                 System.out.println("Boton " + miBoton.getId() + ", estado = On" + " / ");
            } else {
                 System.out.println("Boton " + miBoton.getId() + ", estado = Off" + " / ");
            }
        }
    }
}
