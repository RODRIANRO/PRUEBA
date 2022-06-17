/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public class AutoServicio  implements IAutoServicio {
     private final List<Auto> autoList = new ArrayList<>();
     
     @Override
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
    }

     @Override
    public List<Auto> listar() {
        return this.autoList;
    }
    @Override
    public Auto buscarPorPlaca(String placaAuto) {
        Auto auto=null;
        for(var a:this.autoList){
            if(placaAuto==a.getPlaca()){
                auto=a;
                break;
            }
        }
        return auto;
    }
    
    @Override
    public Auto modificar(String placaAuto, Auto autoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorPlaca(placaAuto));
        this.listar().get(posicion).setMarca(autoNuevo.getMarca());
        this.listar().get(posicion).setPrecio(autoNuevo.getPrecio());
        this.listar().get(posicion).setdesgaste(autoNuevo.getdesgaste());
        this.listar().get(posicion).setModelo(autoNuevo.getModelo());
        return autoNuevo;
    }

    @Override
    public Auto eliminar(String placaAuto) {
        Auto auto=this.buscarPorPlaca(placaAuto);
        var posicion=this.buscarPosicion(auto);
        this.listar().remove(posicion);
        return auto;
    }

    @Override
    public int buscarPosicion(Auto auto) {
        int posicion=-1;
        for(var a:this.autoList){
            posicion++;
            if(a.getPlaca()==auto.getPlaca()){
                break;
            }
        }
        return posicion;
    }
    
}