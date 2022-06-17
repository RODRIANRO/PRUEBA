/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author NOTEBOOK
 */
public class Propietario {
    
  int idPropietario;
    String nombrePropietario;
    LocalDate fechaNacPropietario;
    int VehiculosPropietario;
    String LicenciaPropietario;
    
    public Propietario(int idPropietario, String nombrePropietario, 
            LocalDate fechaNacPropietario, int numeroVehiculosPropietario, 
            String tipoLicenciaPropietario) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
        this.fechaNacPropietario = fechaNacPropietario;
        this.VehiculosPropietario = numeroVehiculosPropietario;
        this.LicenciaPropietario = tipoLicenciaPropietario;
    }
    
    
    public boolean idValida(){
        var retorno= false;
        
        return retorno;
    }
    public int identificarNumeroVehiculos(){
        var retorno=10000;
        
        return retorno;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public LocalDate getFechaNacPropietario() {
        return fechaNacPropietario;
    }

    public void setFechaNacPropietario(LocalDate fechaNacPropietario) {
        this.fechaNacPropietario = fechaNacPropietario;
    }

    public int getNumeroVehiculosPropietario() {
        return VehiculosPropietario;
    }

    public void setNumeroVehiculosPropietario(int numeroVehiculosPropietario) {
        this.VehiculosPropietario = numeroVehiculosPropietario;
    }

    public String getTipoLicenciaPropietario() {
        return LicenciaPropietario;
    }

    public void setTipoLicenciaPropietario(String tipoLicenciaPropietario) {
        this.LicenciaPropietario = tipoLicenciaPropietario;
    }

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + 
                ", nombrePropietario=" + nombrePropietario + 
                ", fechaNacPropietario=" + fechaNacPropietario + 
                ", numeroVehiculosPropietario=" + VehiculosPropietario + 
                ", tipoLicenciaPropietario=" + LicenciaPropietario + '}';
    }
    

 
    
}
