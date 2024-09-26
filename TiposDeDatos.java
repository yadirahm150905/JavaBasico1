package javabasico;

public class TiposDeDatos {
    
    public  void Datos() {
        // Declaración de variables
        int edad = 25;
        double temperatura = 36.6;
        boolean isActive = true;
        char letra = 'A';
        String nombre = "Juan";
        Object objeto1 = 66;

        // Imprimir cada tipo de dato
    System.out.println("Mi integer es tipo: " + ((Object)edad).getClass().getSimpleName());

    System.out.println("Mi double es tipo: " + ((Object)temperatura).getClass().getSimpleName());

    System.out.println("Mi boolean es tipo: " + ((Object)isActive).getClass().getSimpleName());    

    System.out.println("MI char es tipo: " + ((Object)letra).getClass().getSimpleName());    

    System.out.println("Mi String es tipo: " + ((Object)nombre).getClass().getSimpleName());

    System.out.println("Mi Object es tipo: " + ((Object)objeto1).getClass().getSimpleName());
      
    }

   
    }

    