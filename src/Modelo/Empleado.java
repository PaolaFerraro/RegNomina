/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Modelo;

public abstract class Empleado{
    protected Persona per;
    protected String carg;
    protected double salario;

    public Empleado(Persona per, String carg, double salario) {
        this.per = per;
        this.carg = carg;
        this.salario = salario;
    }

    public Empleado() {
        this.per = new Persona();
        this.carg = "";
        this.salario = 0;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public String getCarg() {
        return carg;
    }

    public void setCarg(String carg) {
        this.carg = carg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  per.toString() + "\nCargo: " + carg + "\nSalario: $" + salario + "\nPension: $" + this.Pension() + 
            "\nSalud: $" + this.Salud() + "\nSueldo: $" + this.sueldo();  
    }

    public double Pension(){//funcion para calular el valor de pago de la pension correspondiente al 4%
        double pens;
        pens = this.salario*0.04;
        return pens;
    }
    public double Salud(){//funcion para calular el valor de pago de la salud correspondiente al 3.5%
       double sal;
       sal = this.salario*0.035;
       return sal;  
    }
    
    public double deducciones(){
        return Salud()+Pension();
    }
    
    public abstract double sueldo();
}
