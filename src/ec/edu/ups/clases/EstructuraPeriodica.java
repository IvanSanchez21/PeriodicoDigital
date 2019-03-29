/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *EstructuraPeriodica
 * 
 *clase qeu permite estructurar mi periodico digital
 * 
 * @version 2.0
 * @since 2019
 * @author Ivàn
 * @see http://ups.edu.ec
 */
public class EstructuraPeriodica {

    private String nombrePeriodico;
    private String ubicacion;
    private int fecha;
    
    /**
     * 
     * @param nombrePeriodico 
     */
    
    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombrePeriodico() {

        return this.nombrePeriodico;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public int getFecha() {

        return this.fecha;
    }
}
