/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAuto;
import Vista.FRM_Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseAdolfo
 */
public class Controlador_FRM_Registro implements ActionListener{
    
    FRM_Registro registro;
    MetodosAuto metodos;

    public Controlador_FRM_Registro(FRM_Registro registro) {
        this.registro=registro;
        metodos = new MetodosAuto();
        
        
        
    }

    public void actionPerformed (ActionEvent e)
    {
        
        if(e.getActionCommand().equals("Buscar"))
        {
           if (metodos.existeAuto(registro.devolverNumeroRegistro()))
           {
               registro.mostrarInformacion(metodos.devolverArregloMostrar(registro.devolverNumeroRegistro()));
               registro.estadoModificar();
           }
           else
           {
               metodos.mensajeNoExiste();
               registro.estadoAgregar();
           }
           
        }
        
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarAuto(registro.devolverInformacion());
            registro.estadoInicial();
           
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarAuto(registro.devolverInformacion());
            
            registro.estadoInicial();
            
            
        }
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.borrarAuto(registro.devolverNumeroRegistro());
            registro.estadoInicial();
        }
    }
    
    
    
    
    
    
}
