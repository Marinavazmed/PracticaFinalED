/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *@version 1.0
 * @author javier
 */
public class Geometria {

    /**
     * @author javier
     * @version 1.0
     * @since 11/23/2021
     * @see Triangulo.java, Cuadrado.java, Circulo.java, Rectangulo.java
     */
    public static void main(String[] args) 
    {
        /**
         * Declaración del nuevo objeto tipo Cuadrado
         */       
        Cuadrado cuadrado = new Cuadrado(10);
        /**
         * Cálculo e impresión del área del cuadrado
         */
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        /**Declaración del nuevo objeto tipo Circulo
         */
        Circulo circulo = new Circulo(200);
        /**Cálculo e impresión del área del círculo
         */
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        /**Declaración del nuevo objeto tipo Rectángulo
         */
        Rectangulo rectangulo = new Rectangulo(100, 20);
        /**Cálculo e impresión del área del rectángulo
         */
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

        /**Declaración del nuevo objeto tipo Triándulo
         */
        Triangulo triangulo = new Triangulo(5, 10);
        /**
         * Cálculo e impresión del área del triángulo
         */
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
