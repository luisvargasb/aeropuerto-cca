/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Administrativo.java
Breve descripcion: En esta clase se definen los nuevos administrativos.
Utiliza metodos set() y get().
 *******************************************************************************/
public class Administrativo {
    //Definicion de atributos
    private String nombre;
    private String cargo;
    
    //Constructor
    public Administrativo(String n){
        nombre = n;
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
    //Valor de retorno: cargo
    public String getCargo() {
        return cargo;
    }
    //Parametros: variable String cargo
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
