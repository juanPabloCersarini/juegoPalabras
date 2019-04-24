/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoPalabras;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo
 */
public class Pregunta {
    protected String pregunta;
    protected ArrayList<String> opciones;
    protected int correcta;

    public Pregunta(String pregunta,  int correcta) {
        this.pregunta = pregunta;
        this.correcta = correcta;
        this.opciones = new ArrayList<>();
    }

  
  

    
    
    

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the opciones
     */
    public ArrayList<String> getOpciones() {
        return opciones;
    }

    /**
     * @param opciones the opciones to set
     */
    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }

    /**
     * @return the correcta
     */
    public int getCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
}
