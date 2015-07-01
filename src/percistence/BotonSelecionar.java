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
    ArrayList<Boton> miLista = new ArrayList<>();
    
    public BotonSelecionar(){
        
    }
    
    public void agregarBoton(Boton nuevo){
        miLista.add(nuevo);
        cont++;
        System.out.println("Se agrego el Boton " + cont);
    }
    
    public void cambiarEstadoBoton(int Id, Boolean estado){
        Boton miBoton = new Boton();
        Iterator<Boton> miIterador = miLista.iterator();
        while (miIterador.hasNext()) {            
             miBoton = miIterador.next();
             if (miBoton.getId() == Id) {
                miBoton.setEstado(estado);
                 if (estado == true) {
                     System.out.println("Se cambio el estdo del Boton " + Id + " On");
                 } else {
                     System.out.println("Se cambio el estdo del Boton " + Id + " Off");
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
             System.out.println("Boton " + miBoton.getId() + " / ");
        }
    }
}
