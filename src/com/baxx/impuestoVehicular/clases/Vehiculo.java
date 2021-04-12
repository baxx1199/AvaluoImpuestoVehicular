
package com.baxx.impuestoVehicular.clases;


public class Vehiculo {
    private String marca;
    private String serie;
    private int modelo;
    private String categoria;
    private String matricula;
    private float tarifa;
    private float descuento;

    public Vehiculo(String marca, String serie, int modelo, String categoria, String matricula) {
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.categoria = categoria;
        this.matricula = matricula;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    
    
    
    
}
