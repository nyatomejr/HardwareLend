/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwarehome;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class reports2 extends javax.swing.JInternalFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form AddBook
     */
 //Connection con=null;
    public reports2() {
        initComponents();
        conn=(Connection) newdb.ConnectDb();
       tablelord();

    }
     
    private void tablelord(){
      //   String sql="SELECT booklend.mid, booklend.bid,   addbook.bname, addbook.subject, addbook.form, addmember.name FROM booklend JOIN addbook ON booklend.bid=addbook.bid JOIN addmember ON booklend.mid=addmember.mid WHERE addbook.bname='longhorn' and addbook.subject='math' and addbook.form='4'";
  
         try{
   String sql="SELECT `ib`, `co`, `ca`, `na`, `qu`, `pe`, `lo`, `da`, `pu` FROM `borrow` WHERE mark='0'";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   tblendhistory.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e);
   }    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtbname = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblendhistory = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(940, 530));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbname.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        txtbname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbnameKeyReleased(evt);
            }
        });
        jPanel2.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 130, 30));

        txtsub.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        txtsub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsubKeyReleased(evt);
            }
        });
        jPanel2.add(txtsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 190, 30));

        tblendhistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblendhistory);
        if (tblendhistory.getColumnModel().getColumnCount() > 0) {
            tblendhistory.getColumnModel().getColumn(3).setMinWidth(20);
            tblendhistory.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblendhistory.getColumnModel().getColumn(3).setMaxWidth(20);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 890, 320));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 410, 110, 60));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 110, 60));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel6.setText("Item Code");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel7.setText("Issued To");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 910, 410));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel2.setText("Lend History");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 910, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 930, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         tablelord();
        txtsub.setText("");
         txtbname.setText("");
          
        //tablelord();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    /**  MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
        tblendhistory.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
        }
        **/
      int prcount=tblendhistory.getRowCount();
if (prcount>0){
DefaultTableModel tableModel=(DefaultTableModel) tblendhistory.getModel();
try{

    JasperPrint jasperPrint=null;
    

      JasperCompileManager.compileReportToFile("C:\\Users\\Dripping Melanin\\Documents\\NetBeansProjects\\hardware\\src\\reports\\borrow.jrxml");
    jasperPrint=JasperFillManager.fillReport("C:\\Users\\Dripping Melanin\\Documents\\NetBeansProjects\\hardware\\src\\reports\\borrow.jasper", null , new JRTableModelDataSource(tableModel));
JasperViewer.viewReport(jasperPrint, false);
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
}
else{
      JOptionPane.showMessageDialog(null, "No deatails to print");  
        } 
      /** try {
            // TODO add your handling code here:
            String path="";
            JFileChooser j=new JFileChooser();
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int x= j.showSaveDialog(this);
            if(x==JFileChooser.APPROVE_OPTION ){
                path=j.getSelectedFile().getPath();
            }
            
         Document doc=new Document();
            PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(4);
            
            tbl.addCell("mid");
             tbl.addCell("bid");
              tbl.addCell("bname");
               tbl.addCell("subject");
               
               tbl.addCell("mname");
            for (int i = 0; i <tblendhistory.getRowCount(); i++) {
                String mid=tblendhistory.getValueAt(i, 0).toString();
                 String bid=tblendhistory.getValueAt(i, 1).toString();
                  String bname=tblendhistory.getValueAt(i, 2).toString();
                   String subject=tblendhistory.getValueAt(i, 3).toString();
                   
                   String mname=tblendhistory.getValueAt(i, 4).toString();
                   
                   tbl.addCell(mid);
                    tbl.addCell(bid);
                     tbl.addCell(bname);
                      tbl.addCell(subject);

                      tbl.addCell(mname);
            }
            doc.add(tbl);
            doc.close();
             }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }**/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbnameKeyReleased
        // TODO add your handling code here:
         try{
   String sql="SELECT `ib`, `co`, `ca`, `na`, `qu`, `pe`, `lo`, `da`, `pu` FROM `borrow` WHERE mark='0' and co LIKE'%"+txtbname.getText()+"%'";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   tblendhistory.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e);
   } 
    }//GEN-LAST:event_txtbnameKeyReleased

    private void txtsubKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubKeyReleased
        // TODO add your handling code here:
         try{
   String sql="SELECT `ib`, `co`, `ca`, `na`, `qu`, `pe`, `lo`, `da`, `pu` FROM `borrow` WHERE mark='0' and pe LIKE'%"+txtsub.getText()+"%'";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   tblendhistory.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e);
   } 
    }//GEN-LAST:event_txtsubKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblendhistory;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
