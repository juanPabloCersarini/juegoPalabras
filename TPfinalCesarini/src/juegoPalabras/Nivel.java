package juegoPalabras;

import java.util.ArrayList;
import java.util.Scanner;


public class Nivel extends Etapa {
    public static int puntosTotales=0;
    public Nivel(int numero, String color, String descripcion) {
        this.nroNivel = numero;
        this.color = color;
        this.descripcion = descripcion;
    }

public static   ArrayList<Nivel> armarNiveles (ArrayList<Nivel> lista ){
    
    Nivel nivel1 = new Nivel(1, "Rojo", "Muy Fácil");
    Pregunta preg1_1 = new Pregunta("A - Colores de la bandera Argentina", 2);
    preg1_1.opciones.add("1 - Rojo y Verde");
    preg1_1.opciones.add("2 - Celeste y Blanco");
    preg1_1.opciones.add("3 - Amarillo y Marron");
    nivel1.definiciones.add(preg1_1);
       
    Pregunta preg2_1 = new Pregunta("B - Segundo nombre presidente de Argentina en 1992",3);
    preg2_1.opciones.add("1 - Rodrigo");
    preg2_1.opciones.add("2 - Armando");
    preg2_1.opciones.add("3 - Saul");
    nivel1.definiciones.add(preg2_1);
    
    Pregunta preg3_1 = new Pregunta("C - De que color es la luz central de un semáforo", 3);
    preg3_1.opciones.add("1 - Verde");
    preg3_1.opciones.add("2 - Azul");
    preg3_1.opciones.add("3 - Amarillo");
    nivel1.definiciones.add(preg3_1);
    
    Pregunta preg4_1 = new Pregunta ("D - Conductor apodado <el cabezón>",1);
    preg4_1.opciones.add("1 - Tinelli");
    preg4_1.opciones.add("2 - Vignolo");
    preg4_1.opciones.add("3 - Casella");
    nivel1.definiciones.add(preg4_1);
    
    Pregunta preg5_1 = new Pregunta ("E - Profesor de paradigmas", 3);
    preg5_1.opciones.add ("1 - Eduardo");
    preg5_1.opciones.add("2 - Roberto");
    preg5_1.opciones.add("3 - Fernando");
    nivel1.definiciones.add(preg5_1);
   
    lista.add(nivel1);
    
    Nivel nivel2 = new Nivel(2, "Verde", "Fácil");
    Pregunta preg1_2 = new Pregunta("A - (315/5) * 3" , 1);
    preg1_2.opciones.add("1 - 189");
    preg1_2.opciones.add("2 - 199");            
    preg1_2.opciones.add("3 - 187");
    nivel2.definiciones.add(preg1_2);
    
    Pregunta preg2_2 = new Pregunta ("B - Que representan 2 átomos de hidrógeno y uno de oxígeno?", 2);
    preg2_2.opciones.add("1 - Sal");
    preg2_2.opciones.add("2 - Agua");
    preg2_2.opciones.add("3 - Carbón");
    nivel2.definiciones.add(preg2_2);
    
    Pregunta preg3_2 = new Pregunta ("C -  Un chanchito tiene casa de paja, el otro de madera. Y el tercero?", 2);
    preg3_2.opciones.add("1 - Cartón");
    preg3_2.opciones.add("2 - Ladrillo");
    preg3_2.opciones.add("3 - Algodón");
    nivel2.definiciones.add(preg3_2);
    
    Pregunta preg4_2 = new Pregunta ("D - Autor de <Corazón en Venta>",1);
    preg4_2.opciones.add("1 - Calamaro");
    preg4_2.opciones.add("2 - Sabina");
    preg4_2.opciones.add("3 - Paz Martinez");
    nivel2.definiciones.add(preg4_2);
    
    Pregunta preg5_2 = new Pregunta("E - Oid mortales,el grito ...",3);
    preg5_2.opciones.add("1 - Maligno");
    preg5_2.opciones.add("2 - Ensordesedor");
    preg5_2.opciones.add("3 - Sagrado");
    nivel2.definiciones.add(preg5_2);
    lista.add(nivel2);
    
    Nivel nivel3 = new Nivel(3, "Azul", "Media");
    Pregunta preg1_3 = new Pregunta("A - Alhaja que se usa en un dedo de la mano" , 2);
    preg1_3.opciones.add("1 - Pulsera");
    preg1_3.opciones.add("2 - Anillo");            
    preg1_3.opciones.add("3 - Aro");
    nivel3.definiciones.add(preg1_3);
    
    Pregunta preg2_3 = new Pregunta("B - Bien aceptado como medio de pago" ,3);
    preg2_3.opciones.add("1 - DNI");
    preg2_3.opciones.add("2 - Pasaporte");            
    preg2_3.opciones.add("3 - Dinero");
    nivel3.definiciones.add(preg2_3);
    
    Pregunta preg3_3 = new Pregunta("C - La segunda pirámide más grande de Egipto" , 1);
    preg3_3.opciones.add("1 - Kefren");
    preg3_3.opciones.add("2 - Miserino");            
    preg3_3.opciones.add("3 - Keops");
    nivel3.definiciones.add(preg3_3);
    
    Pregunta preg4_3 = new Pregunta("D - Accesorio propio de la realeza" , 1);
    preg4_3.opciones.add("1 - Corona");
    preg4_3.opciones.add("2 - Anillo");            
    preg4_3.opciones.add("3 - Sable");
    nivel3.definiciones.add(preg4_3);
    
    Pregunta preg5_3 = new Pregunta("E - Lo que usa para hacerse oir un árbitro deportivo" , 3);
    preg5_3.opciones.add("1 - Micrófono");
    preg5_3.opciones.add("2 - Megáfono");            
    preg5_3.opciones.add("3 - Silbato");
    nivel3.definiciones.add(preg5_3);
    lista.add(nivel3);
    return lista;
}


public void jugarNivel (String nombre){
    
        int i, x, j, k, respuesta;
        String control;
        i = 0;
        k = 0;
        x = definiciones.size();
        Jugador jdor = new Jugador();
        Scanner entrada = new Scanner (System.in);
        System.out.print("Continuas con las preguntas (S/N): "); control = entrada.nextLine();
        System.out.println("");
        
        // Aca tendra que iterar sobre el ArrayList de definiciones (Pregunta)
        // y por cada una de ellas: mostrar la pregunta, mostrar las opciones
        // y comparar el numero ingresado con la correcta
        
        while (i<=(x-1) && ("S".equalsIgnoreCase(control))){
                     System.out.println("---------------------------------------------");
                     System.out.println(definiciones.get(i).pregunta);   
                     System.out.println("---------------------------------------------");
                     for (j =0; j<=2; j++){
                         System.out.println(" " + definiciones.get(i).opciones.get(j));
                     }
                     System.out.print("Ingresá la opción correcta 1 - 2 - 3: "); respuesta = entrada.nextInt();
                     if (respuesta == definiciones.get(i).correcta){
                         puntosTotales = puntosTotales + 5;
                         jdor.puntos = jdor.puntos + 5;
                         System.out.println("Felicidades "  + nombre + " acumulas " + jdor.puntos + " puntos");
                     }else{
                         jdor.puntos = jdor.puntos - 10;
                         puntosTotales= puntosTotales - 10;
                         System.out.println("Ups!! " + nombre + " te equivocaste, acumulas " + jdor.puntos + " puntos");
                     }
                     
                     if (jdor.puntos == 25){
                         System.out.println("╔═══════════╗");
                         System.out.println("║>>>> MUY BIEN <<<<║");
                         System.out.println("╚═══════════╝");
                         System.out.println("Cumpliste con el objetivo del nivel ");
                     }              
                 
                     if ("S".equalsIgnoreCase(control)){
                             i++;                 
                     }
                     System.out.print("Continuas con las preguntas (S/N): "); control = entrada.next();
                   
      }
           
}    

}


