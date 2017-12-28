
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class entry extends javax.swing.JFrame {
   
   

    public entry() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordlogin = new javax.swing.JPasswordField();
        usernamelogin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(560, 563));
        setMinimumSize(new java.awt.Dimension(560, 563));
        setPreferredSize(new java.awt.Dimension(560, 563));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 320, 80, 17);
        jPanel1.add(passwordlogin);
        passwordlogin.setBounds(250, 350, 222, 30);
        jPanel1.add(usernamelogin);
        usernamelogin.setBounds(250, 310, 222, 33);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        jButton2.setText("SIGNUP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 480, 147, 38);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel5.setText("FORGOT PASSWORD  ??");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 460, 139, 15);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 410, 127, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 360, 82, 17);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 560, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   new choose().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String username=usernamelogin.getText().toUpperCase();
String password=passwordlogin.getText();

if(username.equals("")||password.equals("")){
    JOptionPane.showMessageDialog(null,"some fields are empty");
    usernamelogin.setText("");
    passwordlogin.setText("");
}
else{try {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
    java.sql.Statement stmt =con.createStatement();
    
    String s2="select * from faculty_reg where name='"+username+"' AND password='"+password+"' ";
    System.out.println(s2);
    ResultSet rs=stmt.executeQuery(s2);
    if(rs.next()){
        JOptionPane.showMessageDialog(null,"login succesfull");
        new service1().setVisible(true);
        this.dispose();
    }
    else
        JOptionPane.showMessageDialog(null,"plezz enter correct username and password");
    
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        new fpassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new entry().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordlogin;
    private javax.swing.JTextField usernamelogin;
    // End of variables declaration//GEN-END:variables

}