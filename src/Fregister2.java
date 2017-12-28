
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Fregister2 extends javax.swing.JFrame {

   long contact;
   String uname,college,department;
    public Fregister2(long contact,String uname,String college,String department ) {
        this.uname=uname;
        this.contact=contact;
        this.college=college;
        this.department=department;
        
        
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
        mailtext = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();
        repasstext = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Passtext = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        quetext = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        anstext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("NOTIFICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 24, -1, 32));

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("E    -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 28, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("EMAILID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 99, -1, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENTER PASSWORD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 183, -1, 38));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("SERVICE ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 101, -1, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("RE-ENTER PASSWORD:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 183, -1, 38));
        getContentPane().add(mailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 99, 227, 40));
        getContentPane().add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 99, 86, 40));
        getContentPane().add(repasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 185, 106, 38));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 141, 40));
        getContentPane().add(Passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 185, 145, 38));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("SECURITY QUESTION: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 252, -1, -1));

        quetext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quetext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YOUR NATIONALITY ?", "FAVORITE SUBJECT ?", "FAVORITE SONG ?", "FAVORITE COLOR ?" }));
        getContentPane().add(quetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 292, 183, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ANSWER:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 246, 72, 28));
        getContentPane().add(anstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 292, 209, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        String email=mailtext.getText().toUpperCase(); 
        String question=((String) quetext.getSelectedItem()).toUpperCase();
        
        String answer=anstext.getText().toUpperCase();
     String id=idtext.getText();
     String password=Passtext.getText();
     
     if(email.equals("") ||id.equals("")|| password.equals("")||answer.equals(""))
     {
         JOptionPane.showMessageDialog(null, "plezz enter complete details");
     }
     else
      if(Arrays.equals(Passtext.getPassword(),repasstext.getPassword()))  
          
            {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
                java.sql.Statement stmt =con.createStatement();
                       String s="insert into faculty_reg values('"+uname+"','"+contact+"','"+college+"','"+department+"','"+email+"','"+id+"','"+password+"','"+question+"','"+answer+"')";
     stmt.executeUpdate(s);
     JOptionPane.showMessageDialog(null, "successfully registered");
this.dispose();
     
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Fregister2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
      else{
          JOptionPane.showMessageDialog(null,"password is not matching" );
          Passtext.setText("");
          repasstext.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passtext;
    private javax.swing.JTextField anstext;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mailtext;
    private javax.swing.JComboBox<String> quetext;
    private javax.swing.JPasswordField repasstext;
    // End of variables declaration//GEN-END:variables
}
