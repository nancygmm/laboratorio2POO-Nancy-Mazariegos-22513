/**
* Simulador de memoria RAM para que el usuario ingrese o cierre programas
* @author  Nancy Gabriela Mazariegos Molina
* @version 1.0
* @since   29/02/2022
*/
public class Memoria {
    /**
     *Clase Memoria
     *Pedir tipo de memoria SDR/DDR, tamaño y tiempos/bloques
     *Atributos de memoria
     */
    private String tipo;
    private double tamaño;
    private double bloques;
    /**
     * Constructor "Memoria"
     * @param tipo
     * @param tamaño
     * @param bloques
     */
    public Memoria(String tipo, double tamaño, double bloques){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.bloques = bloques;
    }
    /**
     * Métodos GET/SET tipo
     * @param tipo
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    /**
     * Métodos GET/SET tamaño
     * @param tamaño
     */
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public double getTamaño(){
        return this.tamaño;
    }
    /**
     * Métodos GET/SET bloques
     * @param bloques
     */
    public void setBloques(double bloques){
        this.bloques = bloques;
    }
    public double getBloques(){
        return this.bloques;
    }
    /**
     * ToString
     */
    public String toString(){
        String cadena=" ";
        cadena+="Tipo -> "+this.tipo+"----";
        cadena+="Tamaño -> "+this.tamaño+"----";
        cadena+="Tiempo/bloques -> "+this.bloques;
        return cadena;
    }
}
