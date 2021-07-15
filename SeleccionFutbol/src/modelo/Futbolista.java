
package modelo;

public class Futbolista extends SeleccionFutbol
{
   private String demarcacion;
   private int dorsal;

    public Futbolista() {
    }

    public Futbolista(String demarcacion, int dorsal, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{Datos del Jugador"+ sDatos() + "demarcacion=" + demarcacion + ", dorsal=" + dorsal + '}';
    }
   
   
    
    
    
}
