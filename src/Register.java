
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mailtext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        collegecombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        branchcombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yearcombo = new javax.swing.JComboBox<>();
        sectioncombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        birthtext = new com.toedter.calendar.JDateChooser();
        enrolltext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Adobe Arabic", 1, 10)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });
        getContentPane().add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 62, 142, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("  DOB");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 65, 37, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 117, -1, -1));

        mailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailtextActionPerformed(evt);
            }
        });
        getContentPane().add(mailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 114, 142, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ENROLLMENT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 117, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("COLLEGE ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        collegecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LNCT", "LNCT&S", "LNCTE", "LNCP", "JNCT" }));
        getContentPane().add(collegecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 164, 142, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("BRANCH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 167, -1, -1));

        branchcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "EC", "EE", "EE", "ME", "CE", "CHE", " " }));
        getContentPane().add(branchcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 164, 166, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("YEAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 221, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("SECTION");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 221, -1, -1));

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ST YEAR", "2ND YEAR", "3RD YEAR", "4RTH YEAR" }));
        getContentPane().add(yearcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 218, 142, -1));

        sectioncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", " " }));
        getContentPane().add(sectioncombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 218, 166, -1));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 295, 111, 40));

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setFont(new java.awt.Font("Charlemagne Std", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 204));
        jLabel10.setText("NOTIFICATION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 10, 345, 32));

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("E    -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 14, 52, -1));
        getContentPane().add(birthtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 62, 138, -1));
        getContentPane().add(enrolltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 114, 166, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailtextActionPerformed

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        
    }//GEN-LAST:event_nametextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=nametext.getText();
        java.util.Date dob=birthtext.getDate();
        java.sql.Date mysqlDob= new Date(dob.getTime());
        String mail=mailtext.getText();
        String enrol=enrolltext.getText();
        String  college=(String) collegecombo.getSelectedItem();
        String branch=(String) branchcombo.getSelectedItem();
        String year=(String) yearcombo.getSelectedItem();
        String section=(String) sectioncombo.getSelectedItem();
        
         if(name.equals("") ||dob.equals("")|| mail.equals("")||enrol.equals(""))
             JOptionPane.showMessageDialog(null, "some fields are empty");
         else
         {  try {
             Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
             java.sql.Statement stmt =con.createStatement();
             String s1="insert into student_reg values('"+name+"','"+mysqlDob+"','"+mail+"','"+branch+"','"+college+"','"+branch+"','"+year+"','"+section+"')";
                 stmt.executeUpdate(s1);
                    JOptionPane.showMessageDialog(null, "successfully registered");
                    this.dispose();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
              
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    }
   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthtext;
    private javax.swing.JComboBox<String> branchcombo;
    private javax.swing.JComboBox<String> collegecombo;
    private javax.swing.JTextField enrolltext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailtext;
    private javax.swing.JTextField nametext;
    private javax.swing.JComboBox<String> sectioncombo;
    private javax.swing.JComboBox<String> yearcombo;
    // End of variables declaration//GEN-END:variables
}
