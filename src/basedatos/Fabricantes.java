/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class Fabricantes extends javax.swing.JFrame {

    static public ResultSet r;
    /**
     * Creates new form Fabricantes
     */
    public Fabricantes() throws SQLException {
        initComponents();
        //Esto lo he hecho desde Github xdd
        aceptar.setVisible(false);
        cancelar.setVisible(false);
          String url ="jdbc:mysql://localhost:3306/base_datos_1";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user,pass);
        
        Statement s = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from fabricantes";
        r = s.executeQuery(query);
        r.first();
        code.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        cod1 = new javax.swing.JLabel();
        cod2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        cod = new javax.swing.JLabel();
        siguiente = new javax.swing.JToggleButton();
        anterior = new javax.swing.JToggleButton();
        ultimo = new javax.swing.JToggleButton();
        primero = new javax.swing.JToggleButton();
        nuevo = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Fabricantes");

        code.setEditable(false);
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        cod1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cod1.setText("Nombre");

        cod2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cod2.setText("Pais");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cod.setText("Código Fabricante");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        ultimo.setText("Ultimo");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        primero.setText("Primero");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Volver al menu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cod)
                            .addComponent(cod1)
                            .addComponent(cod2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code)
                            .addComponent(nombre)
                            .addComponent(pais)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(siguiente)
                                .addGap(10, 10, 10)
                                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(primero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jToggleButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod2)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anterior)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ultimo)
                        .addComponent(primero)
                        .addComponent(nuevo)
                        .addComponent(modificar)
                        .addComponent(siguiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar)
                    .addComponent(jToggleButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        try {
            if(r.next()){
                r.next();
                code.setText(r.getString("COD_FABRICANTE"));
                  nombre.setText(r.getString("NOMBRE"));
                 pais.setText(r.getString("PAIS"));
            } } catch (SQLException ex) {
                Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try {
            if(r.previous()){
                r.previous();
                code.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
            }} catch (SQLException ex) {
                Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_anteriorActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        try {
            r.last();
            code.setText(r.getString("COD_FABRICANTE"));
                  nombre.setText(r.getString("NOMBRE"));
                 pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        try {
            r.first();
            code.setText(r.getString("COD_FABRICANTE"));
                  nombre.setText(r.getString("NOMBRE"));
                 pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_primeroActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        code.setEditable(true);
        borrar.setEnabled(false);       
        modificar.setEnabled(false);
        anterior.setEnabled(false);       
        siguiente.setEnabled(false);
        nuevo.setEnabled(false);        
        primero.setEnabled(false);
        ultimo.setEnabled(false);
        aceptar.setVisible(true);
        cancelar.setVisible(true);
        aceptar.setEnabled(true);
        cancelar.setEnabled(true);
        code.setText(null);
        nombre.setText(null);        
        pais.setText(null);
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        try {
            modificar.setEnabled(true);
            borrar.setEnabled(true);
            code.setEditable(false);
            anterior.setEnabled(true);
            siguiente.setEnabled(true);
            primero.setEnabled(true);
            nuevo.setEnabled(true);
            ultimo.setEnabled(true);
            aceptar.setVisible(false);
            cancelar.setVisible(false);
            aceptar.setEnabled(false);
            cancelar.setEnabled(false);
            code.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));    
            pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try {
            String vcode, vnombre, vpais;
            vcode = code.getText();
            vnombre = nombre.getText();
            vpais = pais.getText();           
            String url = "jdbc:mysql://localhost:3306/base_datos_1";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "update fabricantes set NOMBRE='" + vnombre + "', PAIS='" + vpais + "' WHERE COD_FABRICANTE='" + vcode +"'";
            int resultado = s.executeUpdate(query);
            r.refreshRow();
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        try {
            String vcode, vnombre, vpais;
            vcode = code.getText();
            vnombre = nombre.getText();
            vpais = pais.getText();           
            String url = "jdbc:mysql://localhost:3306/base_datos_1";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
             if (code.getText().length()==0) JOptionPane.showMessageDialog(null,"No has asignado un Código");
             else{
            String query = "insert into fabricantes values ('" + vcode + "','" + vnombre + "','" + vpais + "')";
            int resultado = s.executeUpdate(query);
            String query2 = "select * from fabricantes";
            r = s.executeQuery(query2);
            r.first();
             }
           } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        modificar.setEnabled(true);
        borrar.setEnabled(true);
            code.setEditable(false);
            anterior.setEnabled(true);
            siguiente.setEnabled(true);
            primero.setEnabled(true);
            nuevo.setEnabled(true);
            ultimo.setEnabled(true);
            aceptar.setVisible(false);
            cancelar.setVisible(false);
            aceptar.setEnabled(false);
            cancelar.setEnabled(false);
            
            
    }//GEN-LAST:event_aceptarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try {
            int i= JOptionPane.showConfirmDialog(null, "Realmente desea borrar?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (i==1);
            else {
            String vcode;
            vcode = code.getText();           
            String url = "jdbc:mysql://localhost:3306/base_datos_1";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "delete FROM fabricantes WHERE COD_FABRICANTE='"+vcode+"'";
            int resultado = s.executeUpdate(query);
             String query2 = "select * from fabricantes";
            r = s.executeQuery(query2);
            r.first();
            code.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
   Menu cli = new Menu();
cli.setLocationRelativeTo (null);
this.setVisible(false);
cli.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Fabricantes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JToggleButton anterior;
    private javax.swing.JToggleButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel cod1;
    private javax.swing.JLabel cod2;
    private javax.swing.JTextField code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField pais;
    private javax.swing.JToggleButton primero;
    private javax.swing.JToggleButton siguiente;
    private javax.swing.JToggleButton ultimo;
    // End of variables declaration//GEN-END:variables
}
