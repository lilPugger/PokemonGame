/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalPokemon;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/** 
 * PokemonSelect.java - Used to let the user select one of three pokemon from
 * the menu. It saves and checks if other pokemon are active.
 *
 * @author Liam McCausland 
 * @since 21-June-2022 
 */
public class PokemonSelect extends javax.swing.JFrame {

    public boolean charmanderIsActive = StartMenu.charmanderIsActive;
    public boolean bulbasaurIsActive = StartMenu.bulbasaurIsActive;
    public boolean squirtleIsActive = StartMenu.squirtleIsActive;

    public PokemonSelect() {
        initComponents();
        setFrame();
        checkPokemon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        squirtleBox = new javax.swing.JCheckBox();
        bulbasaurBox = new javax.swing.JCheckBox();
        charmanderBox = new javax.swing.JCheckBox();
        button1 = new java.awt.Button();
        bulbasaurPic = new javax.swing.JLabel();
        squirtlePic = new javax.swing.JLabel();
        charmanderPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        squirtleBox.setText("Squirtle");
        squirtleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squirtleBoxActionPerformed(evt);
            }
        });

        bulbasaurBox.setText("Bulbasaur");
        bulbasaurBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulbasaurBoxActionPerformed(evt);
            }
        });

        charmanderBox.setText("Charmander");
        charmanderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charmanderBoxActionPerformed(evt);
            }
        });

        button1.setLabel("Done");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        bulbasaurPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalPokemon/pictures/bulbasaur.png"))); // NOI18N

        squirtlePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalPokemon/pictures/squirtle.png"))); // NOI18N

        charmanderPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalPokemon/pictures/charmander.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(squirtlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bulbasaurPic)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(charmanderPic, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(squirtleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(bulbasaurBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(charmanderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(squirtlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bulbasaurPic)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(charmanderPic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(squirtleBox)
                    .addComponent(bulbasaurBox)
                    .addComponent(charmanderBox))
                .addGap(50, 50, 50)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final String TITLE = "Pokemon";

    private void squirtleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squirtleBoxActionPerformed
        if (!squirtleBox.isSelected()) {
            StartMenu.squirtleIsActive = false;
            squirtleIsActive = false;
        } else if (charmanderIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Squirtle", TITLE, JOptionPane.PLAIN_MESSAGE);
            charmanderIsActive = false;
            StartMenu.charmanderIsActive = false;
            squirtleIsActive = true;
            StartMenu.squirtleIsActive = true;
            charmanderBox.setSelected(false);
        } else if (bulbasaurIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Squirtle", TITLE, JOptionPane.PLAIN_MESSAGE);
            bulbasaurIsActive = false;
            StartMenu.bulbasaurIsActive = false;
            squirtleIsActive = true;
            StartMenu.squirtleIsActive = true;
            bulbasaurBox.setSelected(false);
        } else {
            squirtleIsActive = true;
            StartMenu.squirtleIsActive = true;
        }
    }//GEN-LAST:event_squirtleBoxActionPerformed

    private void bulbasaurBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulbasaurBoxActionPerformed
        if (!bulbasaurBox.isSelected()) {
            StartMenu.bulbasaurIsActive = false;
            bulbasaurIsActive = false;
        } else if (charmanderIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Bulbasaur", TITLE, JOptionPane.PLAIN_MESSAGE);
            charmanderIsActive = false;
            StartMenu.charmanderIsActive = false;
            bulbasaurIsActive = true;
            StartMenu.bulbasaurIsActive = true;
            charmanderBox.setSelected(false);
        } else if (squirtleIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Bulbasaur", TITLE, JOptionPane.PLAIN_MESSAGE);
            squirtleIsActive = false;
            StartMenu.squirtleIsActive = false;
            bulbasaurIsActive = true;
            StartMenu.bulbasaurIsActive = true;
            squirtleBox.setSelected(false);
        } else {
            bulbasaurIsActive = true;
            StartMenu.bulbasaurIsActive = true;
        }

    }//GEN-LAST:event_bulbasaurBoxActionPerformed

    private void charmanderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charmanderBoxActionPerformed
        if (!charmanderBox.isSelected()) {
            StartMenu.charmanderIsActive = false;
            charmanderIsActive = false;
        } else if (bulbasaurIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Charmander", TITLE, JOptionPane.PLAIN_MESSAGE);
            bulbasaurIsActive = false;
            StartMenu.bulbasaurIsActive = false;
            charmanderIsActive = true;
            StartMenu.charmanderIsActive = true;
            bulbasaurBox.setSelected(false);
        } else if (squirtleIsActive == true) {
            JOptionPane.showMessageDialog(null, "Your Pokemon is now Charmander", TITLE, JOptionPane.PLAIN_MESSAGE);
            squirtleIsActive = false;
            StartMenu.squirtleIsActive = false;
            charmanderIsActive = true;
            StartMenu.charmanderIsActive = true;
            squirtleBox.setSelected(false);
        } else {
            charmanderIsActive = true;
            StartMenu.charmanderIsActive = true;
        }
    }//GEN-LAST:event_charmanderBoxActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        StartMenu start = new StartMenu();
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(PokemonSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bulbasaurBox;
    private javax.swing.JLabel bulbasaurPic;
    private java.awt.Button button1;
    private javax.swing.JCheckBox charmanderBox;
    private javax.swing.JLabel charmanderPic;
    private javax.swing.JCheckBox squirtleBox;
    private javax.swing.JLabel squirtlePic;
    // End of variables declaration//GEN-END:variables

    private void setFrame() {
        this.setTitle("Pokemon");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * Checks what pokemon is selected
     */
    private void checkPokemon() {
        if (StartMenu.charmanderIsActive == true) {
            charmanderBox.setSelected(true);
        } else if (StartMenu.bulbasaurIsActive == true) {
            bulbasaurBox.setSelected(true);
        } else if (StartMenu.squirtleIsActive == true) {
            squirtleBox.setSelected(true);
        }

        if (StartMenu.charmanderIsActive == false) {
            charmanderBox.setSelected(false);
        } else if (StartMenu.bulbasaurIsActive == false) {
            bulbasaurBox.setSelected(false);
        } else if (StartMenu.squirtleIsActive == false) {
            squirtleBox.setSelected(false);
        }
    }

}
