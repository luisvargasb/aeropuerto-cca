/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CompraBoletos.java
 *
 * Created on Sep 14, 2011, 4:20:59 PM
 */
package proyecto1;

import org.jdesktop.application.Action;

/**
 *
 * @author eddy
 */
public class VentaBoletos extends javax.swing.JFrame {

    /** Creates new form CompraBoletos */
    public VentaBoletos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vuelo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        asiento = new javax.swing.JComboBox();
        vender = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();

        setName("Form"); // NOI18N
        setSize(new java.awt.Dimension(411, 316));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(proyecto1.Proyecto1App.class).getContext().getResourceMap(VentaBoletos.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        nombre.setText(resourceMap.getString("nombre.text")); // NOI18N
        nombre.setName("nombre"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        vuelo.setName("vuelo"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        asiento.setName("asiento"); // NOI18N

        vender.setText(resourceMap.getString("vender.text")); // NOI18N
        vender.setName("vender"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(proyecto1.Proyecto1App.class).getContext().getActionMap(VentaBoletos.class, this);
        nuevo.setAction(actionMap.get("lipiarCampos")); // NOI18N
        nuevo.setText(resourceMap.getString("nuevo.text")); // NOI18N
        nuevo.setName("nuevo"); // NOI18N
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(129, 129, 129)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel2)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(nombre, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(asiento, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(vuelo, 0, 189, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(vender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(nuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(vuelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(asiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(vender)
                    .add(nuevo))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseClicked
        this.nombre.setText("");
        this.asiento.setSelectedIndex(-1);
        this.vuelo.setSelectedIndex(-1);
        this.nombre.requestFocus();
}
public void llenarVuelo(String i){
    this.vuelo.addItem(i);
    this.vuelo.setSelectedIndex(-1);
}
public void llenarAsiento(String i){
    this.asiento.addItem(i);
    this.asiento.setSelectedIndex(-1);
}//GEN-LAST:event_nuevoMouseClicked

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
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentaBoletos().setVisible(true);
            }
        });
    }

    @Action
    public void limpiarCampos() {
        this.nombre.setText("");
        this.asiento.setSelectedIndex(0);
        this.vuelo.setSelectedIndex(0);
        this.nombre.setCursor(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox asiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton vender;
    private javax.swing.JComboBox vuelo;
    // End of variables declaration//GEN-END:variables
}
