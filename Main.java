/**
* Simulador de memoria RAM para que el usuario ingrese o cierre programas
* @author  Nancy Gabriela Mazariegos Molina
* @version 1.0
* @since   29/02/2022
*/
import java.util.*;
public class Main{
    /**
     * Clase Main
     */
    private static double tamaño;
    public static void main(String[] args) {
        Main con = new Main();
        Main z = new Main();
        try{
        con.work();
        }
        catch(Exception e){
        z.PrintExepcion();
        }
        System.out.println("Simulador de memoria RAM");
        int respuesta =-1;
        try (Scanner teclado = new Scanner(System.in)) {
            /**
             * Crear las listas donde se almacenarán los datos de cada memoria
             */
            ArrayList<Programa> RAM=new ArrayList<Programa>();
            ArrayList<String> RAMNombres=new ArrayList<String>();
            ArrayList<Programa> cola=new ArrayList<Programa>();
            Memoria memoria=new Memoria("", 0, 0);
            /**
             * Crear el menú para seleccionar tipo y tamaño de la memoria RAM
             */
            int seleccion=1;
            String tipo="";
            double sizeSeleccion=1,size=4,x,bloques;
            System.out.println("Tipo de memoria: \n1.SDR \n2.DDR");
            seleccion=teclado.nextInt();
            System.out.println("Tamaño de la memoria seleccionada: \n1-->4GB \n2-->8GB \n3-->12GB \n4-->16GB \n5-->32GB \n6-->64GB ");
            sizeSeleccion=teclado.nextDouble();
            if(sizeSeleccion==1){
                size=4;}
            else if(sizeSeleccion==2){
                size=8;}
            else if(sizeSeleccion==3){
                size=12;}
            else if(sizeSeleccion==4){
                size=16;
            }else if(sizeSeleccion==5){
                size=32;
            }else if(sizeSeleccion==6){
                size=64;
            }else{
                System.out.println("Por favor seleccionar una opción válida");
            }
            /**
             * /Tamaño de la memoria con su límite de espacio para los programas y la cantidad de bloques que ocupa
             */
            double tamañoP=tamaño*1024;
            double limite=tamañoP;
            double bloque=tamañoP/64;
            /**
             * Asignar el tipo de memoria en base a lo que el usuario seleccionó
             */
            if(seleccion==1){
                tipo="SDR";
            }else{
                tipo="DDR";
            }
            /**
             * Llamar a los sets de la clase Memoria para poder asignar los atributos previamente listados en la misma
             */
            memoria.setTipo(tipo);
            memoria.setTamaño(tamaño);
            x=size/64;
            bloques=Math.ceil(x);
            memoria.setBloques(bloques);
            /**
             * Agregar los programas predeterminados a la lista de programas abiertos para tomar en cuenta el espacio que estos ocupan
             */
            Programa programa1=new Programa("Google chrome", 2070, 8, bloque);
            Programa programa2=new Programa("Firefox", 64, 16, bloque);
            Programa programa3=new Programa("Zoom", 320, 60, bloque);
            Programa programa4=new Programa("Whatsapp", 128, 8, bloque);
            Programa programa5=new Programa("Telegram", 128, 8, bloque);
            Programa programa6=new Programa("Visual Studio", 320, 60, bloque);
            Programa programa7=new Programa("Mail", 32, 15, bloque);
            Programa programa8=new Programa("Contactos", 32, 8, bloque);
            Programa programa9=new Programa("Word", 1024, 10, bloque);
            RAM.add(programa1);
            RAM.add(programa2);
            RAM.add(programa3);
            RAM.add(programa4);
            RAM.add(programa5);
            RAM.add(programa6);
            RAM.add(programa7);
            RAM.add(programa8);
            RAM.add(programa9);
            /**
             * Asignar una variable para el espacio y los bloques de cada programa
             * y luego sumar para calcular el espacio disponible y ocupado
             */
            RAMNombres.add("Google Chrome");
            double gc = 2070;
            double bgc = 8;
            RAMNombres.add("Firefox");
            double ff = 64;
            double bff = 16;
            RAMNombres.add("Zoom");
            double zm = 320;
            double bzm = 60;
            RAMNombres.add("Whatsapp");
            double wa = 128;
            double bwa = 8;
            RAMNombres.add("Telegram");
            double tg = 128;
            double btg = 8;
            RAMNombres.add("Visual Studio");
            double vs = 320;
            double bvs = 60;
            RAMNombres.add("Mail");
            double ml = 32;
            double bml = 15;
            RAMNombres.add("Contactos");
            double cc = 32;
            double bcc = 8;
            RAMNombres.add("Word");
            double wd = 1024;
            double bwd = 10;
            /**
             * Suma del espacio en MB que ocupan los programas predeterminados en la memoria
             */
            double sumaTamaño = gc+ff+zm+wa+tg+vs+ml+cc+wd;
            /**
             * Suma de los bloques/tiempo que ocupan
             */
            double sumaBloques = bgc+bff+bzm+bwa+btg+bvs+bml+bcc+bwd;
            tamañoP-=sumaTamaño;
            bloque-=sumaBloques;
            /**
             * Menú de opciones que el usuario puede ejecutar
             */
            while(respuesta!=15){
                System.out.println("\n\n Menú de memoria RAM");
                System.out.println("1. Abrir un nuevo programa");
                System.out.println("2. Cerrar programa");
                System.out.println("3. RAM");
                System.out.println("4. RAM disponible");
                System.out.println("5. RAM en uso");
                System.out.println("6. Programas");
                System.out.println("7. Programas en cola");
                System.out.println("8. Espacio de un programa");
                System.out.println("9. Programas ingresados a la cola");
                System.out.println("10. Aumentar/disminuir tamaño de memoria");
                System.out.println("11. Listado de programas");
                System.out.println("12. Realizar ciclo de reloj");
                System.out.println("13. Cerrar");
                System.out.println("\n\n Ingresa la opcion que desees");
                respuesta=teclado.nextInt();
                /**
                 * Ejecución del menú de la selección del usuario
                 */
                if(respuesta==1){
                    /**
                     * Preguntar: nombre, tamaño y bloques del programa
                     */
                    Programa programa=new Programa("nombre", 0, 0, sumaBloques);
                    String nombre;
                    double espacio,x2;
                    Double bloques2;
                    System.out.println("Ingresa el nombre del programa: ");
                    nombre=teclado.next();
                    System.out.println("Espacio que ocupa el programa: ");
                    espacio=teclado.nextDouble();
                    x2=espacio/64;
                    bloques2=Math.ceil(x2);
                    if(bloques2>bloque && tamañoP>espacio){
                    /**
                     * Agregar el programa a la lista de programa
                     */
                    programa.setNombre(nombre);
                    programa.setTamaño(tamaño);
                    programa.setBloques(bloques2);
                    RAM.add(programa);
                    RAMNombres.add(nombre);
                    tamañoP-=espacio;
                    /**
                     * Si el tiempo y/o bloques son muy grandes mandar a la cola el programa
                     */
                    }else{
                        System.out.println("No se puede ingresar el programa, se pondra en cola ");
                        programa.setNombre(nombre);
                        programa.setTamaño(tamaño);
                        programa.setBloques(bloques2);
                        cola.add(programa);}
                }else if(respuesta==2){
                    /**
                     * Cerrar programa
                     */
                    int close=0;
                    for(int i=0;i<RAMNombres.size();i++){
                        System.out.println(i+1+". "+RAMNombres.get(i));}
                    System.out.println("Programa que deseas cerrar: ");
                    close=teclado.nextInt();
                    RAM.remove(close-1);
                    RAMNombres.remove(close-1);
                }else if(respuesta==3){
                    /**
                     * RAM TOTAL
                     */
                    System.out.println("RAM TOTAL -> "+limite);
                }else if(respuesta==4){
                    /**
                     * RAM DISPONIBLE
                     */
                    System.out.println("RAM DISPONIBLE -> "+tamañoP);
                }else if(respuesta==5){
                    /**
                     * RAM EN USO
                     */
                    System.out.println("RAM EN USO -> "+(limite-tamañoP));
                }else if(respuesta==6){
                    /**
                     * Programas en uso
                     */
                    for(int i=0;i<RAM.size();i++){
                        System.out.print(i+1+". ");
                        System.out.println(RAM.get(i));
                    }
                    System.out.println("MEMORIA RESTANTE EN MB -> "+tamañoP);
                }else if(respuesta==7){
                    /**
                     * Mostrar programas que aún están en cola
                     */
                    for(int i=0;i<cola.size();i++){
                        System.out.print(i+1+". ");
                        System.out.println(cola.get(i));
                    }
                }else if(respuesta==8){
                    /**
                     * Espacio que un programa ocupa
                     */
                    int posicion=0;
                    for(int i=0;i<RAM.size();i++){
                        System.out.print(i+1+". ");
                        System.out.println(RAM.get(i).getNombre());
                    }
                    posicion=teclado.nextInt();
                    if(posicion>0 && posicion<=RAM.size()){
                        System.out.print("Espacio que ocupa "+RAM.get(posicion-1).getNombre()+": ");
                        System.out.println(RAM.get(posicion-1).getTamaño());
                    }
                }else if(respuesta==9){
                    /**
                     * Programas que aún puede iniciar
                     */
                    ArrayList<Programa> temp=new ArrayList<Programa>();
                    ArrayList<Programa> temp2=new ArrayList<Programa>();
                    if(cola.size()>0){
                        for(int i=0;i<cola.size();i++){
                            if(cola.get(i).getBloques()<bloque){
                                temp.add(cola.get(i));
                                cola.remove(i);
                            }else{
                                temp2.add(cola.get(i));
                            }
                        }
                        System.out.println("Permitidos :) ");
                        for(int k=0;k<temp.size();k++){
                            System.out.print(k+1+". ");
                            System.out.println(temp.get(k));
                        }
                        System.out.println("Ya no caben :( ");
                        for(int k=0;k<temp2.size();k++){
                            System.out.print(k+1+". ");
                            System.out.println(temp2.get(k));
                        }
                    }else{
                        System.out.println("No hay programas en cola");
                    }
                /**
                 * Aumentar/disminuir la memoria
                 */
                }else if(respuesta==10){
                    double contador=0;
                    double bloque1=64;
                    double bloque2=128;
                    double bloque3=192;
                    double bloque4=256;
                    double bloque5=512;
                    double bloque6=1024;
                    if(memoria.getTipo().equalsIgnoreCase("SDR")){
                        if(cola.size()>0){
                            for(int i=0;i<cola.size();i++){
                                contador+=cola.get(i).getBloques();
                            }
                        
                        if(bloque1<contador && contador<bloque2){
                            memoria.setTamaño(8);
                            memoria.setBloques(128);
                        }else if(bloque2<contador && contador<bloque3){
                            memoria.setTamaño(12);
                            memoria.setBloques(192);
                        }else if(bloque3<contador && contador<bloque4){
                            memoria.setTamaño(16);
                            memoria.setBloques(256);
                        }else if(bloque4<contador && contador<bloque5){
                            memoria.setTamaño(32);
                            memoria.setBloques(512);
                        }else if(bloque5<contador && contador<bloque6){
                            memoria.setTamaño(64);
                            memoria.setBloques(1024);
                        }
                            System.out.println("Se aumentó el tamaño de la memoria: "+memoria.getTamaño());
                            System.out.println("Se aumentó la cantidad de bloques de la memoria: "+memoria.getBloques());
                        }else{
                            double contador2=memoria.getTamaño()-tamañoP;
                            if(bloque1<contador2 && contador2<bloque2){
                                memoria.setTamaño(4);
                                memoria.setBloques(64);
                            }else if(bloque2<contador2 && contador2<bloque3){
                                memoria.setTamaño(8);
                                memoria.setBloques(128);
                            }else if(bloque3<contador2 && contador2<bloque4){
                                memoria.setTamaño(12);
                                memoria.setBloques(192);
                            }else if(bloque4<contador2 && contador2<bloque5){
                                memoria.setTamaño(16);
                                memoria.setBloques(256);
                            }else if(bloque5<contador2 && contador2<bloque6){
                                memoria.setTamaño(32);
                                memoria.setBloques(512);
                            }
                            System.out.println("Se redujo el tamaño de la memoria: "+memoria.getTamaño());
                            System.out.println("Se redujo la cantidad de bloques de la memoria: "+memoria.getBloques());
                        }
                    }else{
                        System.out.println("El tipo de memoria no se puede aumentar, lo sentimos :(");
                    }
                /**
                 * Mostar listado de programas
                 */
                }else if(respuesta==11){
                    System.out.println(RAMNombres);
                /**
                 * Cerrar memoria RAM
                 */
                }else if(respuesta==12){
                    System.out.println("Lamentamos informarle que esta opción aún no se encuentra disponible debido a que la ingeniera no supo como hacer esta parte :(, que tenga un bonito día ");
                }else if(respuesta==13){
                    System.out.println("Feliz dia ");
                }else{
                    System.out.println("Ingresa un valor correcto ");
                }
                
            }
        }
    }
    private void PrintExepcion() {}
    private void work() {}
}