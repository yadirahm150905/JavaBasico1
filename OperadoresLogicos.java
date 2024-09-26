/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;
public class OperadoresLogicos {
    public void operador (){
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //Operador AND (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("resultado AND:" + resultado);
         // Operador OR (||)
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("resultado OR: " + resultadoOr);
        
        // Operador NOT (!)
        boolean resultadoNot = !esVerdadero;
        System.out.println("resultado NOT: " + resultadoNot);

    
    }
}
