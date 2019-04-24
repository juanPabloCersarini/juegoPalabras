package juegoPalabras;

import java.util.ArrayList;
import java.util.Scanner;
import static juegoPalabras.Nivel.puntosTotales;

public class juegoPalabras {
        public static ArrayList<Nivel> niveles = new ArrayList<>();
         
        public static void main(String[] args) {
 
            niveles = Nivel.armarNiveles(niveles);
            String corte;
            Jugador persona = new Jugador();
            Scanner entrada = new Scanner(System.in);
            int lugar, puntos;
            lugar=0;
            System.out.println("BIENVENIDO AL JUEGO DE LAS PALABRAS");
            System.out.print("Nombre Jugador: "); persona.nombre = entrada.nextLine();
            System.out.print("Comenzamos con el juego (S/N): "); corte= entrada.nextLine();
            
            while ((!"n".equalsIgnoreCase(corte)) && (lugar < niveles.size())){
                    Nivel niv = niveles.get(lugar);
                    System.out.println("╔═════════════╗");
                    System.out.println("║Estas en el Nivel: " + niv.nroNivel + " ║");
                    System.out.println("╚═════════════╝");
                    System.out.println("Color distintivo: " + niv.color);
                    System.out.println("Dificultad: " + niv.descripcion);
                    niv.jugarNivel(persona.nombre);
                    lugar = lugar + 1;
                   
                    if (lugar < niveles.size()){
                         System.out.print("Continuamos con el juego (S/N): "); corte= entrada.nextLine();
                    }
             }  
            if (puntosTotales == 75){
                            System.out.println("GENIAL!!, lograste cumplir el objetivo del juego. Acumulaste  " + puntosTotales + " puntos");
                            System.out.println("GANASTE UNA LAPICERA DE ORO");
                     }else{
                              if (puntosTotales==0){
                                   System.out.println("Lamentamos que no te animes a jugar!!");
                              }
                                }
                       
                        if((puntosTotales>0) && (puntosTotales <= 15)){
                             System.out.println("No te quejes, la próxima te va a salir mejor, acumulaste " + puntosTotales + " puntos");
                            System.out.println("Agradece que te demos una BIC");
                        }else{
                            if((puntosTotales>15)&&(puntosTotales <= 25)){
                                 System.out.println("No te quejes, la próxima te va a salir mejor, acumulaste " + puntosTotales + " puntos");
                                System.out.println("GANASTE UNA LAPICERA DE BRONCE");
                            }else{
                                if ((puntosTotales >25) && (puntosTotales <75)){
                                     System.out.println("No te quejes, la próxima te va a salir mejor, acumulaste " + puntosTotales + " puntos");
                                    System.out.println("GANASTE UNA LAPICERA DE PLATA");
                            }else{
                                   
                            }
                     }
                    }
            System.out.println("GAME OVER");
        }
}

    
