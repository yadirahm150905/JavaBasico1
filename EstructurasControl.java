/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.logging.Logger;

public class EstructurasControl {
    private int edad;
    //constructor
    
    
    public void estructura(){
        int edad = 18;
        
        if(edad >=18){
            System.out.println("Es mayor de edad");
        }else if(edad >=45) {
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
    public void tablaMultiplicar (){
      for(int i = 1;i <=10; i++){
          System.out.println(i+"x 2 = "+ i*2);
      }
    }    
    //todas las tablas de multiplicar
         public void tablaMultiplicar1(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
         }
       }

    //
    