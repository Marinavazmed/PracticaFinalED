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
public class Cuadrado implements FiguraGeometrica
{
    private double lado;
    /**
     * Atributo tipo double con el valor del lado del cuadrado
     */
    private double areaCuadrado;
    /**
     * Atributo tipo double con el valor del área del cuadrado
     */

    /**
     * Método constructor de cuadrado
     * @param double Primer parámetro, requiere el lado del cuadrado
     * */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Método consultor del valor del lado del cuadrado
     * @return double El valor del lado del cuadrado
     * */
    public double getLado() 
    {
        return lado;
    }

    /**
     * Método modificador del lado del cuadrado
     * @param double Requiere el parámetro del lado del cuadrado
     * */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    /**
     * Método que devuelve el área del cuadrado.
     * @return double Valor del área del cuadrado.
     * */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}