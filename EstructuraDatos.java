/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Alumno-PB203
 */
public class EstructuraDatos {
    
    public void array(){
        String apellido ="Lipa";
        
        Object[] datos = {"Diego","Marta","senati","Daniel",23};
   
    
    //Obtener la cantidad de datos 
    int cantidad = datos.length;
    System.out.println("Cantidad de  datos en my array:" + cantidad);
    
    // tablas de multiplicar
        
        for (int i = 0;1 <= cantidad-i ; i ++) {
            System.out.println(datos[i]);
             // itinerando usar estructura de control if () y en ese ef si encuentra la palabra ¨"senati" print por consolo cuando encuentre la palabra senati   
            if(datos[i]== "senati")   { 
                System.out.println("Se encontro la palabra => "  + datos[i]);
    
    }

        }}
    
    //Listas
    public void list (){
    List <String> nombres = new ArrayList<>();
    nombres.add("Marco");
    nombres.add("Maria");
    nombres.add("Luis");
    nombres.add("Ester");
    
    
    List <String> nombresNuevos = new ArrayList<>();
    nombresNuevos.add("Talia");
    nombresNuevos.add("Yeison");
    nombresNuevos.add("Ana");
    
    //adddAll -> AGREGAR NOMBRES
    
    nombres.addAll(nombresNuevos);
    
    //Cantidad de datos 
    int cantidad = nombres.size();
    System.out.println("Cantidad de datos : " + cantidad);
    
    //Obtener un Dato DE mi LIsta
    System.out.println("El dato es :" + nombres.get(0));
    
    // Obtener un dato de la lista
        System.out.println("El dato en el índice 0 es: " + nombres.get(0));
        
    //Lista de nombrees con for
    
    System.out.println("Nombres en la lista:");
     for (int i = 0; i < nombres.size(); i++) {
    System.out.println("El dato es :"  + nombres.get(i));
    }
     //REMOVE
        nombres.remove("Maria");
     //ENCONTRAR  UN DATO
     nombres.contains("Luis"); //bolean
     //indice de un dato
     nombres.indexOf("Luis");
     //ordenar una lista
      Collections.sort(nombres);
     //Revertir una lista
      Collections.reverse(nombres);
     //Reemplazar un Dato
     nombres.set(1,"Yadira");
     
     //
        System.out.println("---------------------");
     for(String item:nombres){
         System.out.println("El dato es:" + item);
          System.out.println("---------------------");
     }
     
     //limpiar toda la lista
    //nombres.clear();
    
     
    }
    
    public void map (){
        Map<String,Integer > edades =  new HashMap<>();
        // agregar datos put
        edades.put("Gael",53);
        edades.put("Luciana",55);
        edades.put("Carlos",30);
        edades.put("Paul",30);
//REMOVE DATOS 
    edades.remove("Paul");
//cantidad de datos 
  edades.size();
  
 //For
 for (String nombre : edades.keySet()) {
            int edad = edades.get(nombre);
            String estado;
                        if (edad >= 18) {
                estado = "Mayor de edad";
            } else {
                estado = "Menor de edad";
            }
            
            System.out.println("Clave: " + nombre + ", Valor: " + edad + " - " + estado);
        }
    }
 
}
    