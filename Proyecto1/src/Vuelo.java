/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Vuelo.java
Breve descripcion: En esta clase se generan los nuevos vuelos.
Utiliza metodos set() y get().
 *******************************************************************************/
public class Vuelo {
    //Definicion de atributos
    private String piloto;
    private String aeromoza;
    private String tipoVuelo;
    private String destino;
    private String fechaDespegue;
    private String horaDespegue;
    private String fechaAterrizaje;
    private String horaAterrizaje;
    private String aeropuerto;
    private String avion;
    
    //Constructor
    public Vuelo(String p, String a, String tv, String d, String fd, String hd, String fa, String ha, String ae, String av){
        piloto = p;
        aeromoza = a;
        tipoVuelo = tv;
        destino = d;
        fechaDespegue = fd;
        horaDespegue = hd;
        fechaAterrizaje = fa;
        horaAterrizaje = ha;
        aeropuerto = ae;
        avion = av;
    }
}
