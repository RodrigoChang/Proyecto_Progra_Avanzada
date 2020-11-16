/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Login.Login;
import javax.swing.JOptionPane;
import Modelo.Usuario;
/**
 *
 * @author Fernando
 */
public class frmPrincipalAlumno extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipalAlumno() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        Alumnos = new javax.swing.JMenu();
        Listar_alumnos_de_clase = new javax.swing.JMenuItem();
        Listar_Profesores = new javax.swing.JMenuItem();
        consultar_Notas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Software de Ventas"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(0, 115, 202));

        menuBar.setForeground(new java.awt.Color(0, 123, 247));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Opciones");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuItemMouseClicked(evt);
            }
        });
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        Alumnos.setMnemonic('e');
        Alumnos.setText("Alumnos");

        Listar_alumnos_de_clase.setMnemonic('t');
        Listar_alumnos_de_clase.setText("Listar alumnos de clase");
        Alumnos.add(Listar_alumnos_de_clase);

        Listar_Profesores.setMnemonic('y');
        Listar_Profesores.setText("Listar Profesores");
        Listar_Profesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listar_ProfesoresActionPerformed(evt);
            }
        });
        Alumnos.add(Listar_Profesores);

        consultar_Notas.setText("Consultar notas");
        Alumnos.add(consultar_Notas);

        menuBar.add(Alumnos);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void exitMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItemMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowOpened

    private void Listar_ProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listar_ProfesoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Listar_ProfesoresActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new frmPrincipalAlumno().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Alumnos;
    private javax.swing.JMenuItem Listar_Profesores;
    public javax.swing.JMenuItem Listar_alumnos_de_clase;
    private javax.swing.JMenuItem consultar_Notas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
