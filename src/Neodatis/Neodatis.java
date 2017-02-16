/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Neodatis;

import Objetos.Equipo;
import Objetos.Jugador;
import java.util.Iterator;
import org.neodatis.odb.*;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author Alumno
 */
public class Neodatis {

    private static ODB bd;

    /**
     * @return the bd
     */
    public static ODB getBd() {
        return bd;
    }

    public Neodatis() {
        bd = ODBFactory.open("neodatis.neo");
    }

    public boolean comprobarEquipo(int id) {
        try {
            IQuery consulta = new CriteriaQuery(Equipo.class, Where.equal("id_equipo", id));
            Equipo obj = (Equipo) getBd().getObjects(consulta).getFirst();
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean comprobarNombreEquipo(String n) {
        try {
            IQuery consulta = new CriteriaQuery(Equipo.class, Where.equal("nombre", n));
            Equipo obj = (Equipo) getBd().getObjects(consulta).getFirst();
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean comprobarJugador(int id) {
        try {
            IQuery consulta = new CriteriaQuery(Jugador.class, Where.equal("id_jugador", id));
            Jugador obj = (Jugador) getBd().getObjects(consulta).getFirst();
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean comprobarNombreJugador(String n) {
        try {
            IQuery consulta = new CriteriaQuery(Jugador.class, Where.equal("nombre", n));
            Jugador obj = (Jugador) getBd().getObjects(consulta).getFirst();
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean insertarEquipo(Equipo e) {
        if (comprobarEquipo(e.getId_equipo()) == false && comprobarNombreEquipo(e.getNombre()) == false) {
            getBd().store(e);
            getBd().commit();
            return true;
        } else {
            return false;
        }
    }

    public boolean insertarJugador(Jugador j) {
        if (comprobarJugador(j.getId_jugador()) == false && comprobarNombreJugador(j.getNombre()) == false) {
            getBd().store(j);
            getBd().commit();
            return true;
        } else {
            return false;
        }
    }

    public void insertarJugadorEnEquipo(Jugador j, Equipo e) {
        e.getJugadores().add(j);
        getBd().store(e);
        getBd().commit();
    }

    public Equipo devolverEquipoPorNombre(String n) {
        try {
            IQuery consulta = new CriteriaQuery(Equipo.class, Where.equal("nombre", n));
            Equipo obj = (Equipo) getBd().getObjects(consulta).getFirst();
            return obj;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public Jugador devolverJugadorPorId(int id) {
        try {
            IQuery consulta = new CriteriaQuery(Jugador.class, Where.equal("id_jugador", id));
            Jugador obj = (Jugador) getBd().getObjects(consulta).getFirst();
            return obj;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public Equipo devolverEquipoPorId(int id) {
        try {
            IQuery consulta = new CriteriaQuery(Equipo.class, Where.equal("id_equipo", id));
            Equipo obj = (Equipo) getBd().getObjects(consulta).getFirst();
            return obj;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean eliminarJugador(Jugador j) {
        if (j.getEquipo() != null) {
            Equipo e = j.getEquipo();
            e.getJugadores().remove(j);
            getBd().store(e);
        }
        getBd().delete(j);
        getBd().commit();
        return true;
    }

    public void eliminarJugadorDeEquipo(Jugador j) {
        j.setEquipo(null);
        getBd().store(j);
        getBd().commit();
    }

    public boolean eliminarEquipo(Equipo e) {
        if (e.getJugadores() != null) {
            Iterator<Jugador> it = e.getJugadores().iterator();
            for (int i = 0; i < e.getJugadores().size(); i++) {
                Jugador j = it.next();
                eliminarJugadorDeEquipo(j);
            }
        }
        getBd().delete(e);
        getBd().commit();
        return true;
    }

    public void cambiarJugadoresDeEquipo(Equipo e, Equipo e1) {
        Iterator<Jugador> it = e.getJugadores().iterator();
        for (int i = 0; i < e.getJugadores().size(); i++) {
            Jugador j = it.next();
            Jugador aux = j;
            aux.setEquipo(e1);
            eliminarJugador(j);
            insertarJugador(aux);
            e1.getJugadores().add(aux);
            getBd().store(e1);
            getBd().commit();
        }
    }

    public void cerrarConexion() {
        getBd().close();
    }
}
