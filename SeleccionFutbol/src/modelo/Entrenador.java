
package modelo;


public class Entrenador extends SeleccionFutbol
{
    
    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{Datos del entrenador "+ sDatos() + "idFederacion=" + idFederacion + '}';
    }
    
    
    
    
    
    
}
