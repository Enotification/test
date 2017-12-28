
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class setpassword extends javax.swing.JFrame {
String user,question,answer;
   
    public setpassword(String user ,String question ,String answer ) {
        this.user=user;
        this.question=question;
        this.answer=answer;
        
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passtext = new javax.swing.JPasswordField();
        repasstext = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("NOTIFICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 41, -1, 32));

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("E    -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 43, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ENTER NEW PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 158, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("RE-ENTER:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 224, -1, 27));
        getContentPane().add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 158, 235, 30));
        getContentPane().add(repasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 218, 235, 33));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 16)); // NOI18N
        jButton1.setText("UPDATE>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, 36));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String password=passtext.getText();
      String repassword=repasstext.getText();
       if(password.equals("") ||repassword.equals(""))
             JOptionPane.showMessageDialog(null, "some fields are empty");
       else{ 
            if(Arrays.equals(passtext.getPassword(),repasstext.getPassword())) {
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
                    java.sql.Statement stmt =con.createStatement();
                    
                    String s4="update faculty_reg set(answer='"+password+"' where name='"+user+"' AND question='"+question+"'AND answer='"+answer+"'";
                    ResultSet rs=stmt.executeQuery(s4);
                }catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(setpassword.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            
       }
            else 
                JOptionPane.showMessageDialog(null, "password is not matching");
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JPasswordField repasstext;
    // End of variables declaration//GEN-END:variables
}
