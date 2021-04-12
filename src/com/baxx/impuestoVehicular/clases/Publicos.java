/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baxx.impuestoVehicular.clases;


public class Publicos extends Vehiculo{
    
    public Publicos(String marca, String serie, int modelo, String categoria, String matricula) {
        super(marca, serie, modelo, categoria, matricula);
    }

    @Override
    public void setDescuento(float descuento) {
        super.setDescuento((float) 0.05); 
    }

    @Override
    public void setTarifa(float tarifa) {
        super.setTarifa((float) 1.9); 
    }
    
   
}
