/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Auto;
import java.util.List;

/**
 *
 * @author NOTEBOOK
 */
interface IAutoServicio {
    
   public Auto crear(Auto auto);
    public List<Auto> listar();
    public Auto modificar(String placaAuto, Auto AutoNuevo);
    public Auto eliminar(String placaAuto);
    public Auto buscarPorPlaca(String placaAuto);
    public int buscarPosicion(Auto auto);
}