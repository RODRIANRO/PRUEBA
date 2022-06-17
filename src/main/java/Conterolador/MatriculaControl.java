/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conterolador;

import Modelo.Auto;
import Modelo.Matricula;
import Modelo.Propietario;
import Servicio.AutoServicio;
import Servicio.MatriculaServicio;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
public class MatriculaControl {
    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    private final AutoServicio autoServicio= new AutoServicio();
   // private final PropietarioServicio propietarioServicio= new PropietarioServicio();
    
    public Matricula crear(String [] args){
        Auto auto = this.autoServicio.buscarPorPlaca(args[4]);
        Propietario propietario = this.autoServicio.buscarPorPlaca(Integer.valueOf(args[5]));
        Matricula matricula = new Matricula(Integer.valueOf(args[0]),
                LocalDate.parse(args[1]),Integer.valueOf(args[2]),
                Integer.valueOf(args[3]),auto,propietario);
        this.matriculaServicio.crear(matricula);
        return matricula;                                                    
    }
    public Matricula buscarMatricula(String arg){
        return this.matriculaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Matricula eliminar(String arg)
    {
        return this.matriculaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Matricula modificar(String [] args){
        Auto auto = this.autoServicio.buscarPorPlaca(args[4]);
        Propietario propietario= this.autoServicio.buscarPorPlaca(Integer.valueOf(args[5]));
        Matricula matriculaNuevo = new Matricula(Integer.valueOf(args[0]),
                LocalDate.parse(args[1]),Integer.valueOf(args[2]),Integer.valueOf(args[3]),
                auto,propietario);
        this.matriculaServicio.modificar(Integer.valueOf(args[0]), matriculaNuevo);
        return matriculaNuevo;
    }
    
    
    public List<Matricula> listar()
    {
        return this.matriculaServicio.listar();
    }
}


