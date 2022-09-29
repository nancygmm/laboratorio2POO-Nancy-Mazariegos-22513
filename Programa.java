public class Programa {
    //Pedir nombre, tamaño y tiempo que tarda recorrer el programa//
    //Atributos de programa//
    private String nombre;
    private double tamaño;
    private double bloques;
    private double indice;
    //Contructor "Programa"//
    public Programa(String nombre, double tamaño, double bloques, double indice){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.bloques = bloques;
        this. indice = indice;
    }
    //Métodos con sus respectivos set y get//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public double getTamaño(){
        return tamaño;
    }
    public void setBloques(double bloques){
        this.bloques = bloques;
    }
    public double getBloques(){
        return bloques;
    }
    public void setIndice(double indice){
        this.indice = indice;
    }
    public double getIndice(){
        return indice;
    }
    public String toString(){
        String cadena = "";
        cadena +="Programa -> "+ this.nombre +"---";
        cadena +="Espacio MB -> "+ this.tamaño +"---";
        cadena +="Tiempo/bloques -> "+ this.bloques +"---";
        return cadena;
    }
}
