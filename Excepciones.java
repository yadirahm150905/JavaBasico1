/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;

public class Excepciones {
    public void  manejoError(){
        Scanner sc = new Scanner (System.in);
        
        try{ //intentar
            System.out.println("Ingresar un numero:");
            int num = sc.nextInt();
        }catch(Exception e){ //Capturar
        System.out.println("Ocurrio un error:"+ e.getMessage());
        }finally{ // finalizar
            System.out.println("Este bloque se efectua siempre");
            
            sc.close();
    }
    }
    
}
