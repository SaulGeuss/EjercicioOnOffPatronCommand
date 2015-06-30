/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistence;

import java.util.ArrayList;


/**
 *
 * @author adiseño.2015
 */
public class BotonSelecionar {
    
    ArrayList<Boton> miLista = new ArrayList<>();
    
    public void agregarBoton(Boton nuevo){
        miLista.add(nuevo);
    }
    
    public void quitarBotn(int Id){
        
    }
}
