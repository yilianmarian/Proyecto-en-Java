/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author yuxnel
 */
public class Menu_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Administrador
     */
    public Menu_Administrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        GUsuarios = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        pestañas3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        GUsuarios1 = new javax.swing.JLabel();
        GUsuarios2 = new javax.swing.JLabel();
        GUsuarios3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Adminstrador");
        setResizable(false);

        background.setBackground(new java.awt.Color(51, 51, 51));

        nombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 102));
        nombre.setText("Menú de Administrador:");

        GUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        GUsuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GUsuarios.setForeground(new java.awt.Color(255, 255, 51));
        GUsuarios.setText("GESTION DE USUARIOS (EMPLEADOS)");
        GUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUsuariosMouseClicked(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/IMG_7457.JPG"))); // NOI18N

        pestañas3.setBackground(new java.awt.Color(255, 255, 102));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("CERRAR SESIÓN");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("COMPROMISOS");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pestañas3Layout = new javax.swing.GroupLayout(pestañas3);
        pestañas3.setLayout(pestañas3Layout);
        pestañas3Layout.setHorizontalGroup(
            pestañas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañas3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(118, 118, 118))
        );
        pestañas3Layout.setVerticalGroup(
            pestañas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pestañas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27)))
        );

        GUsuarios1.setBackground(new java.awt.Color(51, 51, 51));
        GUsuarios1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GUsuarios1.setForeground(new java.awt.Color(255, 255, 51));
        GUsuarios1.setText("GESTION DE ARTICULOS");
        GUsuarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUsuarios1MouseClicked(evt);
            }
        });

        GUsuarios2.setBackground(new java.awt.Color(51, 51, 51));
        GUsuarios2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GUsuarios2.setForeground(new java.awt.Color(255, 255, 51));
        GUsuarios2.setText("GESTION DE REGISTROS");
        GUsuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUsuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUsuarios2MouseClicked(evt);
            }
        });

        GUsuarios3.setBackground(new java.awt.Color(51, 51, 51));
        GUsuarios3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GUsuarios3.setForeground(new java.awt.Color(255, 255, 51));
        GUsuarios3.setText("GESTION DE USUARIOS (CLIENTES)");
        GUsuarios3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUsuarios3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUsuarios3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pestañas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(GUsuarios)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(GUsuarios3)
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GUsuarios2)
                                    .addComponent(GUsuarios1))
                                .addGap(245, 245, 245)))
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pestañas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(icon))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(GUsuarios)
                        .addGap(52, 52, 52)
                        .addComponent(GUsuarios3)
                        .addGap(52, 52, 52)
                        .addComponent(GUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(GUsuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUsuariosMouseClicked
        Gestion_Empleado v = new Gestion_Empleado();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_GUsuariosMouseClicked

    private void GUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUsuarios1MouseClicked
        Gestion_Articulo v = new Gestion_Articulo();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_GUsuarios1MouseClicked

    private void GUsuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUsuarios2MouseClicked
        Gestion_Registros v = new Gestion_Registros();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_GUsuarios2MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Login v = new Login();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void GUsuarios3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUsuarios3MouseClicked
        Gestion_Cliente v = new Gestion_Cliente();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_GUsuarios3MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Compromisos v = new Compromisos();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GUsuarios;
    private javax.swing.JLabel GUsuarios1;
    private javax.swing.JLabel GUsuarios2;
    private javax.swing.JLabel GUsuarios3;
    private javax.swing.JPanel background;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel pestañas3;
    // End of variables declaration//GEN-END:variables
}
