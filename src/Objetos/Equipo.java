/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alumno
 */
public class Equipo {
    private int id_equipo;
    private String nombre;
    private int fundacion;
    private Set<Jugador> jugadores;

    public Equipo(int id,String n,int f){
        this.id_equipo=id;
        this.nombre=n;
        this.fundacion=f;
        this.jugadores = new HashSet<Jugador>();
    }
    
    /**
     * @return the id_equipo
     */
    public int getId_equipo() {
        return id_equipo;
    }

    /**
     * @param id_equipo the id_equipo to set
     */
    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
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
     * @return the fundacion
     */
    public int getFundacion() {
        return fundacion;
    }

    /**
     * @param fundacion the fundacion to set
     */
    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    /**
     * @return the jugadores
     */
    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
