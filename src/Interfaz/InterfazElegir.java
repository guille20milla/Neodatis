/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objetos.Equipo;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.neodatis.odb.Objects;

/**
 *
 * @author Guill
 */
public class InterfazElegir extends javax.swing.JFrame {

    InterfazJugadores i;
    InterfazModificarJugador im;
    
    /**
     * Creates new form InterfazElegir
     */
    public InterfazElegir(InterfazJugadores i) {
        this.i=i;
        initComponents();
        actualizarTabla();
        setLocation(400, 400);
        setVisible(true);
    }
    
    public InterfazElegir(InterfazModificarJugador i) {
        this.im=i;
        initComponents();
        actualizarTabla();
        setLocation(400, 400);
        setVisible(true);
    }
    
    public void actualizarTabla() {
        Objects<Equipo> equipos;
        DefaultTableModel modelo = null;
        String[] titulos = {"Id_equipo", "Nombre", "Fundacion", "¿Tiene jugadores?"};
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if(i!=null){
            equipos = i.conexion.getBd().getObjects(Equipo.class);
        }else{
            equipos = im.i.conexion.getBd().getObjects(Equipo.class);
        }
        while (equipos.hasNext()) {
            Equipo e = equipos.next();
            String[] fila = new String[4];
            fila[0] = String.valueOf(e.getId_equipo());
            fila[1] = e.getNombre();
            fila[2] = String.valueOf(e.getFundacion());
            if(e.getJugadores().size()==0){
                fila[3] = "No tiene jugadores";
            }else{
                fila[3] = "Tiene jugadores";
            }
            
            modelo.addRow(fila);
            
        }
        getTablaEquipos().setModel(modelo);
        
        for (int i = 0; i < 4; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            getTablaEquipos().getColumnModel().getColumn(i).setCellRenderer(tcr);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();

        setTitle("Equipos disponibles");

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseClicked
        int row = getTablaEquipos().rowAtPoint(evt.getPoint());
        if(i!=null){
            i.getTextEquipoJugador().setText(String.valueOf(getTablaEquipos().getValueAt(row, 1)));
        }else{
            im.getTextEquipo().setText(String.valueOf(getTablaEquipos().getValueAt(row, 1)));
        }
    }//GEN-LAST:event_tablaEquiposMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEquipos;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tablaEquipos
     */
    public javax.swing.JTable getTablaEquipos() {
        return tablaEquipos;
    }
}
