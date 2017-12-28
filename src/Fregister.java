

import javax.swing.JOptionPane;


public class Fregister extends javax.swing.JFrame {

    
    public Fregister() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        conttext = new javax.swing.JTextField();
        collegecombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        departcombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("E -");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 35, 30, -1));

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("NOTIFICATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 163, 56, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CONTACT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 162, -1, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("COLLEGE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 348, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DEPARTMENT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 348, -1, -1));
        getContentPane().add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 165, 181, 32));
        getContentPane().add(conttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 165, 173, 32));

        collegecombo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        collegecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LNCT", "LNCT&S", "LNCTE", "LNCP", "JNCT" }));
        collegecombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        collegecombo.setName("SELECT"); // NOI18N
        getContentPane().add(collegecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 344, 181, 28));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NEXT>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 443, 99, 32));

        departcombo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        departcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "ME", "CE", "EC", "EE", "EI" }));
        getContentPane().add(departcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 344, 173, 28));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String name=nametext.getText().toUpperCase(),college,department;
        college=(String) collegecombo.getSelectedItem();
        department=(String) departcombo.getSelectedItem();
        long contact=Long.parseLong(conttext.getText());
        if(name.equals(""))
            JOptionPane.showMessageDialog(null,"plz enter complet details");
        else
            new Fregister2(contact ,name,college,department).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fregister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> collegecombo;
    private javax.swing.JTextField conttext;
    private javax.swing.JComboBox<String> departcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametext;
    // End of variables declaration//GEN-END:variables
}
