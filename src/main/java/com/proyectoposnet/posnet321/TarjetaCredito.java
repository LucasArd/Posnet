/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoposnet.posnet321;

/**
 *
 * @author luqas
 */
public class TarjetaCredito {
    
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numero;
    private Cliente titular;
    private double saldo;

    public TarjetaCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String numero, Cliente titular, double saldo) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public boolean puedoPagar(double monto){
        return monto <= saldo;
    }
    
    public void debitar(double monto){
        if(puedoPagar(monto)){
            saldo -= monto;
        }
    }
    
    public String nombreCompletoTitular(){
        return titular.getNombreCompleto();
    }
    
}
