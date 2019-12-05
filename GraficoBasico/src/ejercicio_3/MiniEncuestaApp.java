/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_3;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * @author DiscoDurodeRoer
 */
public class MiniEncuestaApp extends javax.swing.JFrame {

    public MiniEncuestaApp() {
        initComponents();
        
        //Creamos una instacia de ButtonGroup
        ButtonGroup btg=new ButtonGroup();
        
        //Añadimos los botones radiobutton
        //Si no lo hacemos, los botones seran independientes
        btg.add(btnWindows);
        btg.add(btnLinux);
        btg.add(btnMac);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnWindows = new javax.swing.JRadioButton();
        btnLinux = new javax.swing.JRadioButton();
        btnMac = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ckbProgramacion = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ckbDiseno = new javax.swing.JCheckBox();
        ckbAdministracion = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnGenerar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlHoras = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Encuesta");

        btnWindows.setText("Windows");

        btnLinux.setText("Linux");

        btnMac.setText("Mac");

        jLabel1.setText("Elige un sistema operativo");

        ckbProgramacion.setText("Programación");

        jLabel2.setText("Elige tu especialidad");

        ckbDiseno.setText("Diseño gráfico");

        ckbAdministracion.setText("Administración");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jlHoras.setMaximum(10);
        jlHoras.setValue(0);
        jlHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jlHorasStateChanged(evt);
            }
        });

        jLabel3.setText("Horas que dedicas en el ordenador");

        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoras.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnGenerar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbProgramacion)
                            .addComponent(jLabel2)
                            .addComponent(ckbAdministracion)
                            .addComponent(ckbDiseno)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(btnLinux)
                            .addComponent(btnMac)
                            .addComponent(btnWindows)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(ckbProgramacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbDiseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbAdministracion)
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       
        String informacion="Tu sistema operativo favorito es: ";
        
        //Cogemos todos los radiobutton en un array
        JRadioButton[] rdbs={btnWindows, btnLinux, btnMac};
        
        for(int i=0;i<rdbs.length;i++){
            
            //Si esta seleccionado, coge el texto
            if(rdbs[i].isSelected()){
                informacion+=rdbs[i].getText();
            }
            
        }
        
        //Hacemos igual con los checkboxes
        JCheckBox[] ckbs={ckbProgramacion, ckbDiseno, ckbAdministracion};
        
        informacion+=", \nTu especialidad es: ";
        
        for(int i=0;i<ckbs.length;i++){
            
            if(ckbs[i].isSelected()){
                informacion+=ckbs[i].getText()+" "; 
            }
            
        }
        
        informacion+=" \n El numero de horas que dedicas al ordenador es: "+jlHoras.getValue();
        
        JOptionPane.showMessageDialog(this, informacion, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jlHorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jlHorasStateChanged
        
        lblHoras.setText(String.valueOf(jlHoras.getValue()));
        
    }//GEN-LAST:event_jlHorasStateChanged

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
            java.util.logging.Logger.getLogger(MiniEncuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniEncuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniEncuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniEncuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniEncuestaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JRadioButton btnLinux;
    private javax.swing.JRadioButton btnMac;
    private javax.swing.JRadioButton btnWindows;
    private javax.swing.JCheckBox ckbAdministracion;
    private javax.swing.JCheckBox ckbDiseno;
    private javax.swing.JCheckBox ckbProgramacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jlHoras;
    private javax.swing.JLabel lblHoras;
    // End of variables declaration//GEN-END:variables
}
