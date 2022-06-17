/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Matricula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public class MatriculaServicio implements IMatriculaServicio {
     private final List<Matricula> matriculaList = new ArrayList<>();
     
     @Override
    public Matricula crear(Matricula matricula) {
        this.matriculaList.add(matricula);
        return matricula;
    }

     @Override
    public List<Matricula> listar() {
        return this.matriculaList;
    }
    @Override
    public Matricula modificar(int codigoMatricula,Matricula matriculaNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoMatricula));
        this.listar().get(posicion).setMatricula(matriculaNuevo.getFechaMatricula());
        this.listar().get(posicion).setChasis(matriculaNuevo.getChasis());
        this.listar().get(posicion).setDuracionMatricula(matriculaNuevo.getDuracionMatricula());
        this.listar().get(posicion).setAuto(matriculaNuevo.getAuto());
        this.listar().get(posicion).setPropietario(matriculaNuevo.getPropietario());
        return matriculaNuevo;
    }

    @Override
    public Matricula eliminar(int codigoMatricula) {
        Matricula matricula=this.buscarPorCodigo(codigoMatricula);
        var posicion=this.buscarPosicion(matricula);
        this.listar().remove(posicion);
        return matricula;
    }

    @Override
    public Matricula buscarPorCodigo(int codigoMatricula) {
        Matricula matricula=null;
        for(var m:this.matriculaList){
            if(codigoMatricula==m.getNumero()){
                matricula=m;
                break;
            }
        }
        return matricula;
    }

    @Override
    public int buscarPosicion(Matricula matricula) {
        int posicion=-1;
        for(var m:this.matriculaList){
            posicion++;
            if(m.getNumero()==matricula.getNumero()){
                break;
            }
        }
        return posicion;
    }

}
    

