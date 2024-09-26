/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;

public class Practica {
    //SWITCH CASE
    
    public void menu(){
    System.out.println(" ----MENU----");
    System.out.println("| 1. Desayuno|");
    System.out.println("| 2. Almuerzo|");
    System.out.println("| 3. Cena    |");
    System.out.println("| 4. Extras  |");
    System.out.println("| 5. Salir   |");
    System.out.println(" ------------");

    System.out.println("Elige una opcion:");

    //elegir opciones en la consola
    Scanner sc = new Scanner (System.in); 
    int ValorQueInsertaElUsuario = sc.nextInt();
    
    switch (ValorQueInsertaElUsuario){
        case 1:
             System.out.println("Jugo de papaya");
             System.out.println("Caldo de cabeza");
             System.out.println("Lomo saltado");
             break;
        case 2:
             System.out.println("Estofado");
             break;

        case 3:
             System.out.println("Pollo a la brasa");
             break;
             
        case 4:
             System.out.println("No tenemos extras");
              break;
            
        case 5:
             System.out.println("Gracias por visitarnos");
             break;
        default:
             System.out.println("Vuelva pronto");
             break;
     }
    }
}  
