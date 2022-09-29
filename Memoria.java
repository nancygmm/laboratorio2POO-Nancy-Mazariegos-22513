public class Memoria {
    //Pedir tipo de memoria SDR/DDR, tamaño y tiempos/bloques//
    //Atributos de memoria//
    private String tipo;
    private double tamaño;
    private double bloques;
    //Constructor "Memoria"//
    public Memoria(String tipo, double tamaño, double bloques){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.bloques = bloques;
    }
    //Métodos con sus respectivos set y get//
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public double getTamaño(){
        return this.tamaño;
    }
    public void setBloques(double bloques){
        this.bloques = bloques;
    }
    public double getBloques(){
        return this.bloques;
    }
    //ToString//
    public String toString(){
        String cadena=" ";
        cadena+="Tipo -> "+this.tipo+"----";
        cadena+="Tamaño -> "+this.tamaño+"----";
        cadena+="Tiempo/bloques -> "+this.bloques;
        return cadena;
    }
}
