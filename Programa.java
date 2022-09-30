/**
* Simulador de memoria RAM para que el usuario ingrese o cierre programas
* @author  Nancy Gabriela Mazariegos Molina
* @version 1.0
* @since   29/02/2022
*/
public class Programa {
    /**
     * Clase Programa
     * Pedir nombre, tamaño y tiempo que tarda recorrer el programa
     * Atributos de programa
     */
    private String nombre;
    private double tamaño;
    private double bloques;
    private double indice;
    /**
     * Constructor "Programa"
     * @param nombre
     * @param tamaño
     * @param bloques
     * @param indice
     */
    public Programa(String nombre, double tamaño, double bloques, double indice){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.bloques = bloques;
        this. indice = indice;
    }
    /**
     * Métodos GET/SET nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    /**
     * Métodos GET/SET tamaño
     * @param tamaño
     */
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public double getTamaño(){
        return tamaño;
    }
    /**
     * Métodos GET/SET bloques
     * @param bloques
     */
    public void setBloques(double bloques){
        this.bloques = bloques;
    }
    public double getBloques(){
        return bloques;
    }
    /**
     * Métodos GET/SET indice
     * @param indice
     */
    public void setIndice(double indice){
        this.indice = indice;
    }
    public double getIndice(){
        return indice;
    }
    /**
     * ToString
     */
    public String toString(){
        String cadena = "";
        cadena +="Programa -> "+ this.nombre +"---";
        cadena +="Espacio MB -> "+ this.tamaño +"---";
        cadena +="Tiempo/bloques -> "+ this.bloques +"---";
        return cadena;
    }
}
