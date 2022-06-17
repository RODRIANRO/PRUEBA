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
public class Matricula {
    
 int numero;
    LocalDate Matricula;
    int Chasis;
    int duracionMatricula;
    Auto auto;
    Propietario propietario;

    public Matricula(int numero, LocalDate Matricula, int Chasis, 
            int duracionMatricula, Auto auto, Propietario propietario) {
        this.numero = numero;
        this.Matricula = Matricula;
        this.Chasis = Chasis;
        this.duracionMatricula = duracionMatricula;
        this.auto = auto;
        this.propietario = propietario;
    }

    public Matricula(int numero, LocalDate Matricula, int Chasis, 
            int duracionMatricula) {
        this.numero = numero;
        this.Matricula = Matricula;
        this.Chasis = Chasis;
        this.duracionMatricula = duracionMatricula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaMatricula() {
        return Matricula;
    }

    public void setMatricula(LocalDate Matricula) {
        this.Matricula = Matricula;
    }

    public int getChasis() {
        return Chasis;
    }

    public void setChasis(int Chasis) {
        this.Chasis = Chasis;
    }

    public int getDuracionMatricula() {
        return duracionMatricula;
    }

    public void setDuracionMatricula(int duracionMatricula) {
        this.duracionMatricula = duracionMatricula;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

        
    public int calcularExpiracion(){
        var retorno=1000;
        
        return retorno;
    }
    public boolean validadChasis(){
        var retorno=true;
        
        return retorno;
    }

    @Override
    public String toString() {
        return "Matricula{" + "numero=" + numero + ", fechaMatricula=" + 
                Matricula + ", numeroChasis=" + Chasis + 
                ", duracionMatricula=" + duracionMatricula + ", auto=" + auto.toString()
                + ", propietario=" + propietario.toString() + '}';
    }
    

  
}
