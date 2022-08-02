
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basquet;

/**
 *
 * @author Lara Sosa
 */
public class Jugadores {
    private String nom;
    private String edad;
    private String categoria;
    private int cod;
    private String equipos;
   
   public Jugadores() {
   this.nom = "";
   this.edad = "";
   this.categoria = "";
   this.cod = 0;
   this.equipos = "";
}
   
public Jugadores (String nom, String edad, String categoria, int cod ){
    this.nom = nom;
    this.edad = edad;
    this.categoria = categoria;
    this.cod = cod;
    this.equipos = equipos;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }
    

   public String toStrinng() {
    return 
"nombre del jugador es: " + nom+ "| la edad de los jugadores es:" + edad
               + "la categoria es: " + categoria
         + "codigo: " + cod+ "|su equipo es: " + equipos;
                
   }

}
  
