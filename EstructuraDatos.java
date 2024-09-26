/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.List;

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
        
   
    }
    
    
    public void map (){
        
}
    
    
}