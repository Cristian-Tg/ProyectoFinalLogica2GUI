/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import controlador.ModeloServicioAvanzado;
import controlador.ModeloServicioBasico;
import controlador.ModeloServicioMonitoreo;

/**
 *
 * @author Antonio
 */
public class Servicios extends javax.swing.JPanel {
    private ModeloServicioBasico modeloBasico;
    private ModeloServicioAvanzado modeloAbanzado;
    private ModeloServicioMonitoreo modeloMonitoreo;
    

    /**
     * Creates new form Principal
     */
    public Servicios() {
        initComponents();
        modeloBasico = new ModeloServicioBasico();
        this.tblContratos1.setModel(modeloBasico);
        
        modeloAbanzado = new ModeloServicioAvanzado();
        this.tblservicioAvanzado.setModel(modeloAbanzado);
        
        modeloMonitoreo = new ModeloServicioMonitoreo();
        this.tblContratos2.setModel(modeloMonitoreo);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblservicioAvanzado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContratos1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblContratos2 = new javax.swing.JTable();
        Title2 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Title.setText("Monitoreo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        tblservicioAvanzado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblservicioAvanzado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 690, 150));

        tblContratos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblContratos1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 690, 150));

        tblContratos2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblContratos2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 690, 150));

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Title2.setText("Servicios Básicos");
        add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Title3.setText("Servicios Avanzados");
        add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblContratos1;
    private javax.swing.JTable tblContratos2;
    private javax.swing.JTable tblservicioAvanzado;
    // End of variables declaration//GEN-END:variables
}
