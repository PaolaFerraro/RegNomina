/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Modelo;

import java.util.ArrayList;

public class TotNomina {
    ArrayList<Empleado> ListaEmp;

    public TotNomina(ArrayList<Empleado> ListaEmp) {
        this.ListaEmp = ListaEmp;
    }
    
    public TotNomina() {
        this.ListaEmp = new ArrayList<Empleado>();
    }

    public ArrayList<Empleado> getListaEmp() {
        return ListaEmp;
    }

    public void setListaEmp(ArrayList<Empleado> ListaEmp) {
        this.ListaEmp = ListaEmp;
    }
    
    public double totalNomina(){
        double datos=0;
        for (int i = 0; i < ListaEmp.size(); i++) {
            datos+=ListaEmp.get(i).sueldo();
        }
        return datos;
    }
    
    public String datosLista(){
        String datos="";
        for (int i = 0; i < ListaEmp.size(); i++) {
            datos+=ListaEmp.get(i).toString()+"\n";
        }
        return datos;
    }

    @Override
    public String toString() {
        return "Lista Empleados:" + datosLista();
    }
    
    
}

