/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baxx.impuestoVehicular.clases;

/**
 *
 * @author Equipo3
 */
public class Motos extends Vehiculo{
    
    private int cilindraje;
    
    public Motos(String marca, String serie, int modelo, String categoria, String matricula) {
        super(marca, serie, modelo, categoria, matricula);
    }

    public Motos(int cilindraje, String marca, String serie, int modelo, String categoria, String matricula) {
        super(marca, serie, modelo, categoria, matricula);
        this.cilindraje = cilindraje;
    }

   
    
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    public void verificacionTarifa(int cilindraje){
        if (cilindraje < 125) {
            super.setTarifa((float) 0.0);
        }
    }

}
   

