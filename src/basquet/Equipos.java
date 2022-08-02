/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basquet;

/**
 *
 * @author Lara Sosa
 */
public class Equipos {
    private String nom;
    private int cod;
    
public Equipos() {
    this.nom = "";
    this.cod = 0;
    
}
public Equipos(String nom, int cod){
    this.nom = nom;
    this.cod = cod;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

public String toStrinng() {
    return  "el nombre del equipo es: " + nom+ "|el codigo es: " + cod; 

                
   }

}

