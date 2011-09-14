/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Avion.java
Breve descripcion: En esta clase se generan los nuevos aviones.
Utiliza metodos set() y get().
 *******************************************************************************/
import java.util.Scanner;
public class Avion {
    //Definicion de atributos
    private String nombre;
    private char vInternacional;
    private char cPrimera;
    private char cTurista;
    private char vNacional;
    
    //Constructor
    public Avion(String n, char vi,char vn, char cp, char ct){
        nombre = n;
        vInternacional = vi;
        vNacional = vn;
        cPrimera = cp;
        cTurista = ct;
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
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: vInternacional
    public char getvInternacional() {
        return vInternacional;
    }
    //Parametros: variable char vInternacional
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setvInternacional(char vInternacional) {
        this.vInternacional = vInternacional;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cPrimera
    public char getcPrimera() {
        return cPrimera;
    }
    //Parametros: variable char cPrimera
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcPrimera(char cPrimera) {
        this.cPrimera = cPrimera;
    }
  
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cTurista
    public char getcTurista() {
        return cTurista;
    }
    //Parametros: variable char cTurista
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcTurista(char cTurista) {
        this.cTurista = cTurista;
    }
    public void ingresoAvion(){
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el nombre del avion: ");
        this.nombre = tecla.nextLine(); 
        System.out.print ("Vuelo internacional: (Si (S) - No (N)) ");
        this.vInternacional = tecla.next().charAt(0);
        System.out.print ("Vuelo nacional: (Si (S) - No (N)) ");
        this.vNacional = tecla.next().charAt(0);
        System.out.print ("El vuelo cuenta con Primera clase: (Si (S) - No (N)) ");
        this.cPrimera = tecla.next().charAt(0);
        System.out.print ("El vuelo cuenta con clase Turista: (Si (S) - No (N)) ");
        this.cTurista = tecla.next().charAt(0);
    }
}
