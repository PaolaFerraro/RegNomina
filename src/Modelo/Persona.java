/**
 *
 * @authors 
 * Johan Sebastian Fontecha Soler   20191578026
 * Diana Paola Feraro Cardenas      20182020048
 * Andres Felipe Quintero Velazquez 20191020023  
 */
package Modelo;

public class Persona {
    private String id, nom, tel;

    public Persona(String id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }
    
    public Persona() {
        this.id = "";
        this.nom = "";
        this.tel = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "\nIdentificación: " + id + 
               "\nNombre: " + nom + 
               "\nTelefono: " + tel;
    }
}

