/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonoffpatroncommand;

import java.util.Scanner;
import percistence.*;

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
//        String bandera = "uno";
        int entero = 1, cont = 0, IdBoton;
        Boton miBoton;
        BotonSelecionar miBotonSelec = new BotonSelecionar();
        Command encendido;
        Command apagado;
                
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&  Controlador de LED  &&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
        
        try {
            
            //        while (bandera.equals("uno")) { 
            while (entero == 1) {
            System.out.println("--- Para agregar un nuevo boton digite :: 2");
            System.out.println("--- Para cambiar de estado a un boton digite :: 3");
            System.out.println("--- Para imprimir la lista de botones digite :: 4");
            System.out.println("--- Para sair del programa digite :: 1");
            System.out.println();
            System.out.println();
            Scanner miSca = new Scanner(System.in);
//            bandera = miSca.next();
            entero = miSca.nextInt();
            
            switch(entero){
                case 1: entero = 5; break;
                    
                case 2: 
                    cont++;
                    miBoton = new Boton(cont, Boolean.FALSE);
                    miBotonSelec.agregarBoton(miBoton);
                    entero = 1;
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 3:
                    miBotonSelec.listaBotones();
                    System.out.print("Digite el numero del boton que desea cambiar su estado :: ");
                    IdBoton = miSca.nextInt();
                    miBotonSelec.cambiarEstadoBoton(IdBoton);
                    System.out.println();
                    System.out.println();
                    miBotonSelec.listaBotones();
                    entero = 1;
                    break;
                    
                case 4:
                    System.out.println();
                    System.out.println();
                    miBotonSelec.listaBotones();
            }
            
        }
            
        } catch (Exception e) {
            System.out.println("Argumentos requeridos");
        }
   
    }
    
}
