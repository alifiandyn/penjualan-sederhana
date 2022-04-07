/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Alif
 */
public class ControllerPenjualan {
//    public static void main(String[] args) {
//        PenjualanUI penjualan = new PenjualanUI();
//        penjualan.setVisible(true);
//    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try{
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
            }
        }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPenjualan().setVisible(true);
            }
        });
    }
}
