/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Modelo;

public class Operario extends Empleado{

    private int canthorasextra;

    public Operario(int canthorasextra, Persona per, String carg, double salario) {
        super(per, carg, salario);
        this.canthorasextra = canthorasextra;
    }

    public Operario() {
        super();
        this.canthorasextra = canthorasextra;
    }
    
    public int getCanthorasextra() {
        return canthorasextra;
    }

    public void setCanthorasextra(int canthorasextra) {
        this.canthorasextra = canthorasextra;
    }
    
    
    public double horaNormal(){
        double val;
        val=this.salario/240;
        return val;
    }
    
    public double abonos(){
        double val;
        val=this.canthorasextra*(this.horaNormal()*0.035);
        return val;
    }

    @Override
    public double sueldo() {
        double val;
        val=this.salario-this.deducciones()+this.abonos();
        return val;
    }

}

