/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class Jugador {
    private int id_jugador;
    private String nombre;
    private int edad;
    private String posicion;
    private Equipo equipo;

    public Jugador(int id,String n,int e,String pos){
        this.id_jugador=id;
        this.edad=e;
        this.nombre=n;
        this.posicion=pos;
    }
    
    public Jugador(int id,String n,int e,String pos,Equipo eq){
        this.id_jugador=id;
        this.edad=e;
        this.nombre=n;
        this.posicion=pos;
        this.equipo=eq;
    }
    
    /**
     * @return the id_equipo
     */
    public int getId_jugador() {
        return id_jugador;
    }

    /**
     * @param id_equipo the id_equipo to set
     */
    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the equipo
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
