/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoposnet.posnet321;

/**
 *
 * @author luqas
 */
public class Posnet {
    private static final int MIN_CUOTA =1;
    private static final int MAX_CUOTA = 6;
    private static final double PORC_REC_CUOTA = 0.03;
    
    public Ticket efectuarPago(TarjetaCredito tarjeta, double monto, int cuotas){
        try{ 
            validarDatos(tarjeta, monto, cuotas);
            double total = calcularMontoTotal(monto, cuotas);
            if (tarjeta.puedoPagar(total)){
                tarjeta.debitar(monto);
                return new Ticket(tarjeta.nombreCompletoTitular(), total, total / cuotas);
            }
            
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    private double calcularRecargo(double monto, int cuotas){
        return (cuotas - 1) * PORC_REC_CUOTA;
    }
    
    private boolean validarDatos(TarjetaCredito tarjeta, double monto, int cuotas){
        return validarCuotas(cuotas) 
               && validarMonto(monto)
               && validarTarjeta(tarjeta);
        
    }
    
    private double calcularMontoTotal(double monto, int cuotas){
            double recargo = calcularRecargo(monto,cuotas);
            return monto + monto * recargo;
    }
    
    private static boolean validarCuotas(int cuotas){
        if(cuotas < MIN_CUOTA || cuotas > MAX_CUOTA ){
            throw new IllegalArgumentException("Cuotas invalidas");
        }
        return true;
    }
    
    private static boolean validarTarjeta(TarjetaCredito tarjeta){
        return tarjeta != null; // podemos validar muchas cosas de la tarjeta, numero, etc
    }
    
    private boolean checkSaldo(TarjetaCredito tarjeta, double monto){
        
        return tarjeta.puedoPagar(monto);
    }
    
    private static boolean validarMonto(double monto){
        return monto > 0;
    }
    
    
}
