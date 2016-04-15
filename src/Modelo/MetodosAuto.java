/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Controlador_FRM_Registro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseAdolfo
 */
public class MetodosAuto {
    
    private ArrayList <Auto> arrayAuto;
    
    Controlador_FRM_Registro controlador;
    
    
    public MetodosAuto()
    {
        arrayAuto=new ArrayList <Auto>();
    }
    
    public boolean existeAuto (String registro)
    {
        boolean existe = false;
        
        for (int contador=0;contador<arrayAuto.size(); contador++)
        {
            if (arrayAuto.get(contador).getNumeroRegistro().equals(registro))
            {
                existe=true;
            }
            else
            {
                existe=false;
                
            }
            
        }
        return existe;
    }
    
    public void agregarAuto(String arreglo[])
    {
        
        Auto temporal=new Auto (arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
        arrayAuto.add(temporal);
        JOptionPane.showMessageDialog(null, "Informacion de Auto Agregada exitosamente");
    }
    
    public String[] devolverArregloMostrar (String numeroRegistro)
    {
        String[] arregloMostrar=new String[4];
        for (int contador=0;contador<arrayAuto.size(); contador++)
        {
            if (arrayAuto.get(contador).getNumeroRegistro().equals(numeroRegistro))
            {
                arregloMostrar[0]=arrayAuto.get(contador).getNumeroRegistro();
                arregloMostrar[1]=arrayAuto.get(contador).getNombre();
                arregloMostrar[2]=arrayAuto.get(contador).getCedula();
                arregloMostrar[3]=arrayAuto.get(contador).getPlaca();
            }
            
        }
        return arregloMostrar;
    }
    
    public void modificarAuto(String autoModificado[])
    {
        for (int contador=0;contador<arrayAuto.size(); contador++)
        {
            if (arrayAuto.get(contador).getNumeroRegistro().equals(autoModificado[0]))
            {
                arrayAuto.get(contador).setNombre(autoModificado[1]);
                arrayAuto.get(contador).setCedula(autoModificado[2]);
                arrayAuto.get(contador).setPlaca(autoModificado[3]);
                JOptionPane.showMessageDialog(null, "La informacion del Auto ha sido Modificada");
            }
        }
        
    }
    public void borrarAuto (String registro)
    {
         for (int contador=0;contador<arrayAuto.size(); contador++)
        {
            if (arrayAuto.get(contador).getNumeroRegistro().equals(registro))
            {
             
                arrayAuto.remove(contador);
                JOptionPane.showMessageDialog(null, "La informacion ha sido borrada");
                
            }
        }
    }
    
    public void mensajeNoExiste()
    {
        JOptionPane.showMessageDialog(null, "El numero de registro no existe, agreguelo");
    }
    
    
}
