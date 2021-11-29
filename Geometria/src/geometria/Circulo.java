/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;
    
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    /**
     * Método consultor de la variable radio
     * @return devuelve el valor de radio
     * */
    public double getRadio() 
    {
        return radio;
    }

    /**
     * Método modificador de la variable radio
     * @param double Requiere como primer parámetro un valor double
     * */
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    /**
     * Método consultor de la variable areaRadio
     * @return double Devuelve el valor de areaRadio
     * */
    public double getAreaRadio() 
    {
        return areaRadio;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
