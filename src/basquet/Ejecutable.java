package basquet;

import java.util.Scanner;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lara Sosa
 */
public class Ejecutable {
    
    public static void main(String[] args){
      float cantTiempo;
      Scanner input = new Scanner(System.in);
      System.out.println("ingrese la cantidad de tiempo");
      cantTiempo = input.nextFloat();

      int cantPuntos;
      System.out.println("ingrese la cantidad de puntos ");
      cantPuntos = input.nextInt();
      
      int arbitros;
      System.out.println("ingrese los arbitros ");
      arbitros = input.nextInt();
      
      String nomClub;
      System.out.println("ingrese el nombre del club ");
      nomClub = input.nextLine();
      
      String fechaPartido;
      System.out.println("ingrese la fecha del partido  ");
      fechaPartido = input.nextLine();
      
      int cod;
      System.out.println("ingrese el codigo ");
      cod = input.nextInt();
      
      
      Basquet b1 = new Basquet();
      
      b1.setCantTiempo(cantTiempo);
      b1.setCantPuntos(cantPuntos);
      b1.setArbitros(arbitros);
      b1.setNomClub(nomClub);
      b1.setFechaPartido(fechaPartido);
      b1.setCod(cod);
      
      String nom;
      System.out.println("ingrese el nombre de un equipo");
      nom = input.nextLine();
     
      Equipos e1 = new Equipos();
      e1.setNom(nom);
      e1.setCod(3);
      System.out.println("ingrese el nombre del otro equipo");
      nom = input.nextLine();
      
      Equipos e2 = new Equipos( nom,4);
      
      Jugadores j1 [] = new Jugadores [12];
      String nombre;
      String edad;
      String categoria;
      
     for (int i = 0; i < 12; i++) {
      System.out.println("ingrese el nombre del jugador");
      nombre = input.nextLine();
      
      System.out.println("ingrese la edad del jugador");
      edad = input.nextLine();
      
      System.out.println("ingrese la categoria del jugador");
      categoria = input.nextLine();
      
      j1[i].setNom(nombre);
      j1[i].setEdad(edad);
      j1[i].setCategoria(categoria);
      j1[i].setCod(i);
      j1[i].setEquipos(e1.getNom());
      
            
        }
     
     Jugadores j2 [] = new Jugadores [12];
     
     for (int i = 0; i < 12; i++) {
      System.out.println("ingrese el nombre del jugador");
      nombre = input.nextLine();
      
      System.out.println("ingrese la edad del jugador");
      edad = input.nextLine();
      
      System.out.println("ingrese la categoria del jugador");
      categoria = input.nextLine();
      
      j2[i].setNom(nombre);
      j2[i].setEdad(edad);
      j2[i].setCategoria(categoria);
      j2[i].setCod(i);
      j2[i].setEquipos(e1.getNom());
      
            
        }
      
        
    System.out.println("Basquet: " + b1.toString());
    System.out.println("equipo1: " + e1.toString());
    System.out.println("equipo2: " + e2.toString());
    
    
}
}
