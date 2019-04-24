
package juegoPalabras;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
   protected int nroNivel;
   protected String color;
   protected String descripcion;
   protected List <Pregunta> definiciones = new ArrayList <>();

    /**
     * @return the nroNivel
     */
    public int getNroNivel() {
        return nroNivel;
    }

    /**
     * @param nroNivel the nroNivel to set
     */
    public void setNroNivel(int nroNivel) {
        this.nroNivel = nroNivel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the definiciones
     */
    public List <Pregunta> getDefiniciones() {
        return definiciones;
    }

    /**
     * @param definiciones the definiciones to set
     */
    public void setDefiniciones(List <Pregunta> definiciones) {
        this.definiciones = definiciones;
    }
  
}

   