/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conterolador;

import Modelo.Auto;
import Servicio.AutoServicio;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public class AutoControlador {
    
private final AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(String [] params){
//        var auto = new Auto(Integer.valueOf(params[0]),params[1]);
        var auto = new Auto(params[0], params[1], Integer.valueOf(params[2]), 
                Integer.valueOf(params[3]), params[4]);
        this.autoServicio.crear(auto);
        return auto;                                                    
    }
    public Auto buscarAuto(String arg){
        return this.autoServicio.buscarPorPlaca(arg);
    }
    
    public Auto eliminar(String arg)
    {
        return this.autoServicio.eliminar(arg);
    }
    public Auto modificar(String [] args){
        Auto autoNuevo = new Auto(args[0],args[1],Integer.valueOf(args[2]),Integer.valueOf(args[3]),args[4]);
        this.autoServicio.modificar(args[0], autoNuevo);
        return autoNuevo;
    }
    public List<Auto> listar()
    {
        return this.autoServicio.listar();
    }
}
