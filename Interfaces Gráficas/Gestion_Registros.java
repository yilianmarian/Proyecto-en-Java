/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.TrabajoArchivos;
import Modelo.Registro;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author yuxnel
 */
public class Gestion_Registros extends javax.swing.JFrame {
Object[][] lista;
    
    public Gestion_Registros() {
        
        initComponents();
        ArrayList<Registro> reg = new ArrayList<>();
        
        try{
            reg = TrabajoArchivos.readFileTextRegistro();
        
        lista = new Object[reg.size()][3];
        for(int i=0;i<reg.size();i++){
            lista[i][0]=reg.get(i).getId();
            lista[i][1]=reg.get(i).getNombre();
            lista[i][2]=reg.get(i).getDescripcion();
        }
        
        t.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"ID", "Nombre", "Descripción"}));
       
    }
    
    catch(IOException | ClassNotFoundException ex){
    
}

    this.setTitle("Ferreteria El Tablillazo");

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Usuarios");
        setResizable(false);

        t.setBackground(new java.awt.Color(51, 51, 51));
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID de artículo", "Nombre", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t);
        if (t.getColumnModel().getColumnCount() > 0) {
            t.getColumnModel().getColumn(0).setResizable(false);
            t.getColumnModel().getColumn(1).setResizable(false);
            t.getColumnModel().getColumn(2).setResizable(false);
        }

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(255, 255, 51));
        jMenu1.setText("Menú");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 51));
        jMenuItem1.setText("Guardar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem2.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 51));
        jMenuItem2.setText("Volver al Menú");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Menu_Administrador v = new Menu_Administrador();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ArrayList<Registro> r = new ArrayList<>();
        
        for(int i=0;i<t.getRowCount();i++){
            String id = (String)t.getValueAt(i, 0);
            String nombre = (String)t.getValueAt(i, 1);
            String descripcion = (String)t.getValueAt(i, 2);
            
            r.add(new Registro(id,nombre,descripcion));
        }
        
        try{
            TrabajoArchivos.writeFileTextRegistro(r);
        }
        catch(Exception ex){
            
        }   

    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t;
    // End of variables declaration//GEN-END:variables
}
