/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author NOTEBOOK
 */
public class Auto {
    
 String placa;
    String marca;
    int precio;
    int desgaste;
    String modelo;

    public Auto(String placa, String marca, int precio, int desgaste, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.desgaste = desgaste;
        this.modelo = modelo;
    }
    
    public boolean validarPlaca(){
        var retorno=false;
        
        return retorno;
    }
    public String identificarProvincia(){
        var retorno="hola";
        
        return retorno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getdesgaste() {
        return desgaste;
    }

    public void setdesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", marca=" + marca + ", precio=" 
                + precio + ", kilometraje=" + desgaste + ", modelo=" 
                + modelo + '}';
    }

}
