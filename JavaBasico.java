//yadira yahaira human meza
package javabasico;

import java.util.Scanner;
import javabasico.OperadoresLogicos;

/**
 *
 * @author Alumno-PB203
 */
public class JavaBasico {
    
    public void principal (){
          System.out.println("Bienvenido Java Basicco");
          System.out.println("1. Operadores Logicos");
          System.out.println("2. Tipo de Datos");
          System.out.println("3. Estructuras de Control");
          System.out.println("4. Excepciones");
          System.out.println("5. Estructura de Datos");   
          
          System.out.println("Elige una opcion:");

    //elegir opciones en la consola
    Scanner sc = new Scanner (System.in); 
    int data = sc.nextInt();
    
     switch (data){
        case 1:
             OperadoresLogicos o1 = new OperadoresLogicos();
             o1.operador();
             break;
      
}
    switch (data){
        case 2:
             TiposDeDatos o2 = new TiposDeDatos();
             o2.Datos();
             break;
        }
    
    switch (data){
        case 3:
             EstructurasControl o3= new EstructurasControl();
             o3.tablaMultiplicar1(40);
             break;
    }
    
    switch (data){
        case 4:
             Excepciones o4= new Excepciones();
             o4.manejoError();
             break;
        }
    
    
     switch (data){
        case 5:
             EstructuraDatos o5= new EstructuraDatos();
             //o5.array();
             o5.list();

             break;
        
    }
    }
    public static void main(String[] args) {
        Practica prac = new Practica();
        JavaBasico jb = new JavaBasico();
        jb.principal();
       // prac.menu();
    
    
    }
    
}
  











