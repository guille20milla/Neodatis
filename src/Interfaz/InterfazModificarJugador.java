/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objetos.Equipo;
import Objetos.Jugador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Guill
 */
public class InterfazModificarJugador extends javax.swing.JFrame {

    Jugador j;
    InterfazJugadores i;

    /**
     * Creates new form InterfazModificarJugador
     */
    public InterfazModificarJugador(Jugador j, InterfazJugadores i) {
        this.i = i;
        this.j = j;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public boolean comprobarEntero(String numero) {
        Pattern p = Pattern.compile("(\\d)+");
        Matcher m = p.matcher(numero);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarString(String palabra) {
        Pattern p = Pattern.compile("([A-Z]|[a-z]|ñ|Ñ)+");
        Matcher m = p.matcher(palabra);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        comboPosicion = new javax.swing.JComboBox<>();
        textEquipo = new javax.swing.JTextField();
        botonElegir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setTitle("Modificacion");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Edad:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Posicion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Equipo:");

        comboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Medio", "Delantero" }));

        textEquipo.setEditable(false);

        botonElegir.setText("+");
        botonElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElegirActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNombre)
                                    .addComponent(textEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboPosicion, 0, 97, Short.MAX_VALUE)
                                    .addComponent(textEquipo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonElegir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonElegir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElegirActionPerformed
        InterfazElegir i = new InterfazElegir(this);
    }//GEN-LAST:event_botonElegirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (comprobarString(getTextNombre().getText())) {
            if (comprobarEntero(getTextEdad().getText())) {
                Jugador aux;
                int id = j.getId_jugador();
                String nombre=getTextNombre().getText();
                int edad = Integer.parseInt(getTextEdad().getText());
                String posicion = getComboPosicion().getSelectedItem().toString();
                Equipo e;
                j.getEquipo().getJugadores().remove(j);
                if (getTextEquipo().getText().contentEquals("")) {
                    e=null;
                    aux=new Jugador(id, nombre, edad, posicion);
                    i.conexion.eliminarJugador(j);
                    i.conexion.insertarJugador(aux);
                } else {
                    e = i.conexion.devolverEquipoPorNombre(getTextEquipo().getText());
                    aux = new Jugador(id, nombre, edad, posicion, e);
                    e.getJugadores().add(aux);
                    i.conexion.eliminarJugador(j);
                    i.conexion.insertarJugador(aux);
                }
                JOptionPane.showMessageDialog(this, "Jugador modificado", "Modificado", JOptionPane.INFORMATION_MESSAGE);
                i.actualizarTabla();
                i.actualizarTabla1();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Escribe una edad correcto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Escribe un nombre correcto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        getTextEdad().setText("");
        getTextEquipo().setText("");
        getTextNombre().setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonElegir;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JComboBox<String> comboPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textEquipo;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the comboPosicion
     */
    public javax.swing.JComboBox<String> getComboPosicion() {
        return comboPosicion;
    }

    /**
     * @return the textEdad
     */
    public javax.swing.JTextField getTextEdad() {
        return textEdad;
    }

    /**
     * @return the textEquipo
     */
    public javax.swing.JTextField getTextEquipo() {
        return textEquipo;
    }

    /**
     * @return the textNombre
     */
    public javax.swing.JTextField getTextNombre() {
        return textNombre;
    }
}