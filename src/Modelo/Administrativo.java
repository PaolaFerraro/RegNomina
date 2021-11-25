/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Modelo;

public class Administrativo extends Empleado{

    public Administrativo(Persona per, String carg, double salario) {
        super(per, carg, salario);
    }

    public Administrativo() {
        super();
    }

    @Override
    public double sueldo() {
        double val;
        val=this.salario-this.deducciones();
        return val;
    }
    
}

