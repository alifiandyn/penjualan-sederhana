/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alif
 */
public class ControllerPenjualan {
    
    private List<ModelBarang> listBarang;
    private ViewPenjualan view;
    
    public ControllerPenjualan(){
        initModel();
        initView();
    }
    public void show(){
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
               view.setVisible(true);
            }
        });
    }

    private void initModel() {
        listBarang = new ArrayList<ModelBarang>();
        listBarang.add(new ModelBarang("Beras","kg",200.0));
        listBarang.add(new ModelBarang("Gula","kg",150.0));
        listBarang.add(new ModelBarang("Indomie","pcs",2.0));
        listBarang.add(new ModelBarang("Shampoo Lidah Buaya","pcs",125.0));
    }

    private void initView() {
        view = new ViewPenjualan();
        view.initComboBox(listBarang);
        view.initBtnSimpan(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            String message = view.getPenjualan();
            JOptionPane.showMessageDialog(view, message);
        }
        });
    }

}
