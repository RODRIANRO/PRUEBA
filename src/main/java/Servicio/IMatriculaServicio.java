/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Matricula;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
interface IMatriculaServicio {
    
  public Matricula crear(Matricula matricula);
    public List<Matricula> listar();
    public Matricula modificar(int codigoMatricula, Matricula MatriculaNuevo);
    public Matricula eliminar(int codigoMatricula);
    public Matricula buscarPorCodigo(int codigoMatricula);
    public int buscarPosicion(Matricula matricula);
}

