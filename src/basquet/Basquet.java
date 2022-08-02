
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basquet;

/**
 *
 * @author Lara Sosa
 */
public class Basquet {
    
    private float cantTiempo;
    private int  cantPuntos;
    private int arbitros;
    private String nomClub;
    private String fechaPartido;
    private int cod;
    
public Basquet (){
    this.cantTiempo = 0;
    this.cantPuntos = 0;
    this.arbitros = 0;
    this.nomClub = "";
    this.fechaPartido = "";
    this.cod = 0;
}

public Basquet (float cantTiempo, int cantPuntos, int arbitros, String nomClub, 
        String fechaPartido, int cod){
    this.cantTiempo = cantTiempo;
    this.cantPuntos = cantPuntos;
    this.arbitros = arbitros;
    this.nomClub = nomClub;
    this.fechaPartido = fechaPartido;
    this.cod = cod;
}

    public float getCantTiempo() {
        return cantTiempo;
    }

    public void setCantTiempo(float cantTiempo) {
        this.cantTiempo = cantTiempo;
    }

    public int getCantPuntos() {
        return cantPuntos;
    }

    public void setCantPuntos(int cantPuntos) {
        this.cantPuntos = cantPuntos;
    }

    public int getArbitros() {
        return arbitros;
    }

    public void setArbitros(int arbitros) {
        this.arbitros = arbitros;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

public String toStrinng() {
    return 
"la cantidad del tiempo del partido es: " + cantTiempo+ "| la cantidad de puntos es:" + cantPuntos
               + "los arbitros: " + arbitros
         + "|el nombre del club es: " + nomClub+ "|la fecha del es : " 
            +fechaPartido+ "codigo: " + cod;
                
   }
    
    
    

    }
    

