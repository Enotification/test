
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class fpassword extends javax.swing.JFrame {

    
    public fpassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fquetext = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fanstext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fusertext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("NOTIFICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 30, -1, 32));

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("E    -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 34, -1, -1));

        fquetext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fquetext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTER YOUR NATIONALITY", "ENTER YOUR PET NAME ", "YOUR FAVOURITE SINGER", "YOUR FAVOURITE MOVIE", "YOUR FAVOURITE ACTRESS NAME", " " }));
        getContentPane().add(fquetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 149, 239, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("SECURITY QUESTION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENTER YOUR ANSWER:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 228, -1, -1));

        fanstext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fanstextActionPerformed(evt);
            }
        });
        getContentPane().add(fanstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 223, 242, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("USER NAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 90, -1, -1));
        getContentPane().add(fusertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 84, 242, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("CHANGE YOUR PASSWORD NOW>>>>>");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void fanstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fanstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fanstextActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
        String user=fusertext.getText();
        String question1=(String) fquetext.getSelectedItem();
        String answer1=fanstext.getText();
        if(user.equals("")||answer1.equals("")){
                JOptionPane.showMessageDialog(null,"some fields are empty");
                    try {  System.out.println("bhai kya dikkat hai");
                
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
                java.sql.Statement stmt =con.createStatement();                
                 String s3="select * from faculty_reg where name='"+user+"'AND question='"+question1+"' AND answer='"+answer1+"';";
                  ResultSet rs=stmt.executeQuery(s3);
                  if(rs.next()){
        JOptionPane.showMessageDialog(null,"you are an authorised faculty");
                 new setpassword(user,question1,answer1).setVisible(true);
                this.dispose();
                  
                  }else
                      JOptionPane.showMessageDialog(null, "no such entry is found");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(fpassword.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jLabel6MouseClicked

    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fpassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fanstext;
    private javax.swing.JComboBox<String> fquetext;
    private javax.swing.JTextField fusertext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
