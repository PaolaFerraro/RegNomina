/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Control;

import Modelo.*;
import java.util.Scanner;

public class Controlador {
    TotNomina objNom;

    public Controlador(TotNomina objNom) {
        this.objNom = objNom;
    }

    public Controlador() {
        this.objNom = new TotNomina();
    }
    
    public void iniciar(){
      int ver=0;
        System.out.println("--------------Calcular Nomina-----------------");
        do{
          Scanner leer = new Scanner(System.in);
          int tipo=0;
          System.out.println("BIENVENIDO \n OPCIONES EMPLEADOS \n" + "1. Administrativo \n2. Operario \n3. salir");
            tipo=leer.nextInt();
            
            Persona objEmp = new Persona();
            
            System.out.println("Identificación");
            String br=leer.nextLine();
            objEmp.setId(leer.nextLine());

            System.out.println("Nombre");
            objEmp.setNom(leer.nextLine());

            System.out.println("Telefono");
            objEmp.setTel(leer.nextLine());
            
            switch(tipo){
                case 1:{
                    Administrativo objAd = new Administrativo();
                    System.out.println("Administrativo");
                    
                    objAd.setPer(objEmp);
                    System.out.println("Inserte cargo del empleado");
                    objAd.setCarg(leer.nextLine());
                    System.out.println("Ingrese salario del empleado");
                    objAd.setSalario(leer.nextDouble());
                    
                    objNom.getListaEmp().add(objAd);
                    System.out.println("Empleado Registrado: " + objAd.toString());
                    
                    break;
                }
                
                case 2:{
                    Operario objOp = new Operario();
                    System.out.println("Operario");
                    objOp.setPer(objEmp);

                    System.out.println("Inserte cargo del empleado");
                    objOp.setCarg(leer.nextLine());
                    System.out.println("Ingrese salario del empleado");
                    objOp.setSalario(leer.nextDouble());
                    System.out.println("Ingrese cantidad de horas extras del empleado");
                    objOp.setCanthorasextra(leer.nextInt());
                    
                    objNom.getListaEmp().add(objOp);
                    System.out.println("Empleado Registrado: " + objOp.toString());
                    
                    break;
                }
            }
            System.out.println("Desea ingresar otro empleado? \n1. SI \n2. NO");
            ver=leer.nextInt();
        }while(ver==1);
        System.out.println("Empleados\n" + objNom.datosLista() + "\nTotal Nomina: $" + objNom.totalNomina()); 
    }
}

