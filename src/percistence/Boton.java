/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistence;

/**
 *
 * @author adiseño.2015
 */
public class Boton {
    
    private int id;
    private Boolean estado;
    
    public Boton(){  
    }
    
    public  Boton(int id, Boolean estado){
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
