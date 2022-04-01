package app;

import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alif
 */
public class ModelPenjualan {
    private double subTotal=0;
    private double ppn=0;
    private double total=0;
    private DefaultTableModel table = new DefaultTableModel();

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DefaultTableModel getTable() {
        return table;
    }

    public void setTable(DefaultTableModel table) {
        this.table = table;
    }
}
