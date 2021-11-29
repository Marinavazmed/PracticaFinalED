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
public class Triangulo implements FiguraGeometrica
{
    private double base;
    /**Atributo de tipo doble que contiene el valor de la base*/
    private double altura;
    /**Atributo tipo doble que contiene el valor de la altura*/
    private double areaTriangulo;
    /**Atributo tipo doble que contiene el valor del área del triángulo*/
    
/**
 * Construcor de la clase triángulo
 * @param base Primer parámetro tipo double para el método
 * @param altura Segundo parámetro tipo double para el método
 * */
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }


    public double getBase() 
    {
        return base;
    }


    public void setBase(double base)
    {
        this.base = base;
    }

    

    public double getAltura() 
    {
        return altura;
    }

    

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    
    /**
     * Método para obtener el área del triángulo
     * @return double Devuelve el área del triángulo
     * */
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    
    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}