package proyecto1;

/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Aerolinea.java
Breve descripcion: En esta clase se generan todos los elementos que conforman una
aerolinea, se realiza por medio de listas.
Utiliza métodos get() y set().
 *******************************************************************************/
/*import java.util.ArrayList;*/
import java.util.List;
//import java.util.ArrayList;

public class Aerolinea {
    //Definición de atributos
    private String nombre;
    static List<Boleto> boleto;
    //static ArrayList<Boleto> boleto = new ArrayList();//Otra forma de hacerlo
    static Boleto tempBoleto = new Boleto();
    
    //Constructor
    public Aerolinea(String n){
        nombre = n;
    }
    //Constructor vacio
    public Aerolinea(){
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: nombre
    public String getNombre() {
        return nombre;
    }
    //Parametros: variable String nombre
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*public void comprarBoleto(){
        char a = 'P';
        String p = "Eddy";
        String v = "001-tx";
        boleto.add(new Boleto(a,p,v));
     }*///Se utilizara para llenar con datos iniciales
}
