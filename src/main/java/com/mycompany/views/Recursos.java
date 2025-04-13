/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import Clases.Cliente;
import Clases.Contrato;
import Clases.Elemento;
import Clases.Monitoreo;
import Clases.Servicio;
import Clases.ServicioAvanzado;
import Clases.ServicioBasico;
import static com.mycompany.views.RegistroFacturas.getValidez;
import controlador.ListaClientes;
import controlador.ListaContratos;
import controlador.ListaServicios;
import controlador.ModeloCliente;
import controlador.ModeloContrato;
import controlador.ModeloElementos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Recursos extends javax.swing.JPanel {
    
    ModeloElementos modelo;
    ModeloCliente modeloCliente;
    ModeloContrato modeloContratos;

    /**
     * Creates new form Elementos1
     */
    public Recursos() {
        initComponents();
        modelo = new ModeloElementos();
        modeloCliente = new ModeloCliente();
        modeloContratos = new ModeloContrato();
        this.jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbMes = new javax.swing.JComboBox<>();
        txtxIdentificacion = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox<>();
        jcbSector = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

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
        jScrollPane1.setViewportView(jTable1);

        jcbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbMes.setEnabled(false);
        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Mes", "Sector" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jcbSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residencial", "Industrial", "Hospitalario", "Público", "Bancario" }));
        jcbSector.setEnabled(false);
        jcbSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSectorActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setText("Cantidad de recuersos");

        jLabel1.setText("Identificación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtxIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtxIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        String tipo = String.valueOf(this.jcbTipo.getSelectedItem());
        String identificacion = this.txtxIdentificacion.getText();
        int mes = this.jcbMes.getSelectedIndex();
        String sector = String.valueOf(this.jcbSector.getSelectedItem());
        switch (tipo) {
            case "Cliente":
                try {
                    Cliente cliente =  modeloCliente.obtener(identificacion);
                    getElementosXCliente(cliente);

               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "Cliente no encontrado");
               }
                break;
            case "Mes":
                getElementosXMes(mes);
                break;
            case "Sector":
                getElementosxSector(sector);
                break;
            default:
                throw new AssertionError();
        }
        
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        txtxIdentificacion.setText("");
        jcbMes.setSelectedIndex(0);
        jcbSector.setSelectedItem(0);
        
        if (((String) jcbTipo.getSelectedItem()).equals("Cliente")) {
            txtxIdentificacion.setEnabled(true);
            jcbMes.setEnabled(false);
            jcbSector.setEnabled(false);
        }

        if (((String) jcbTipo.getSelectedItem()).equals("Mes")) {
            txtxIdentificacion.setEnabled(false);
            jcbMes.setEnabled(true);
            jcbSector.setEnabled(false);
        }

        if (((String) jcbTipo.getSelectedItem()).equals("Sector")) {
            txtxIdentificacion.setEnabled(false);
            jcbMes.setEnabled(false);
            jcbSector.setEnabled(true);
        }
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jcbSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSectorActionPerformed

    
    public void getElementosXCliente(Cliente cliente) {
        int guardias = 0, supervisores = 0, elementosCaninos = 0, camaras = 0;
        ListaContratos contratos = modeloContratos.filtrarCliente(cliente.getIdentificacion());
        for (int i = 0; i < contratos.total(); i++) {
            Contrato contrato = contratos.obtener(i);
            int[] suma = sumarXContrato(contrato, guardias, supervisores, elementosCaninos, camaras);
            guardias = suma[0];
            supervisores = suma[1];
            elementosCaninos = suma[2];
            camaras = suma[3];
        }
        modelo.agregarElemento(new Elemento("Guardias", guardias));
        modelo.agregarElemento(new Elemento("Supervisores", supervisores));
        modelo.agregarElemento(new Elemento("Elementos caninos", elementosCaninos));
        modelo.agregarElemento(new Elemento("Camaras", camaras));
    }
    
    public void getElementosXMes (int mes) {
        int guardias = 0, supervisores = 0, elementosCaninos = 0, camaras = 0;
        ListaContratos contratos = modeloContratos.contratos;
        for (int i = 0; i < contratos.total(); i++) {
            Contrato contrato = contratos.obtener(i);
            
            List<Integer> validez = getValidez(contrato.getFechaPrestacion(), contrato.getDuracion());
            
            if (validez.contains(mes)) {
                int[] suma = sumarXContrato(contrato, guardias, supervisores, elementosCaninos, camaras);
                guardias = suma[0];
                supervisores = suma[1];
                elementosCaninos = suma[2];
                camaras = suma[3];
            }
                    
        }
        modelo.agregarElemento(new Elemento("Guardias", guardias));
        modelo.agregarElemento(new Elemento("Supervisores", supervisores));
        modelo.agregarElemento(new Elemento("Elementos caninos", elementosCaninos));
        modelo.agregarElemento(new Elemento("Camaras", camaras));
    }
    
    public void getElementosxSector (String sector) {
        int guardias = 0, supervisores = 0, elementosCaninos = 0, camaras = 0;
        ListaClientes clientes = modeloCliente.clientes;
        
        for (int i = 0; i < clientes.total(); i++) {
            Cliente cliente = clientes.obtener(i);
            
            if (cliente.getSector().equals(sector)) {
                ListaContratos contratos = modeloContratos.filtrarCliente(cliente.getIdentificacion());
                
                for (int j = 0; j < contratos.total(); j++) {
                    Contrato contrato = contratos.obtener(j);
                    Servicio servicio = contrato.getServicio();
                    int[] suma = sumarXContrato(contrato, guardias, supervisores, elementosCaninos, camaras);
                    guardias = suma[0];
                    supervisores = suma[1];
                    elementosCaninos = suma[2];
                    camaras = suma[3];
                }  
            }
        }
        modelo.agregarElemento(new Elemento("Guardias", guardias));
        modelo.agregarElemento(new Elemento("Supervisores", supervisores));
        modelo.agregarElemento(new Elemento("Elementos caninos", elementosCaninos));
        modelo.agregarElemento(new Elemento("Camaras", camaras));
    }
   
    private int[] sumarXContrato(Contrato contrato, int guardias, int supervisores, int elementosCaninos, int camaras) {
        Servicio servicio = contrato.getServicio();
        String tipoServicio = contrato.getTipoDeServicio();

        switch (tipoServicio) {
            case "Servicio Basico":
                ServicioBasico sb = (ServicioBasico) servicio;
                guardias += sb.getCantidadGuardias();
                supervisores += sb.getCantidadSupervisores();
            break;
            case "Servicio Avanzado":
                ServicioAvanzado sa = (ServicioAvanzado) servicio;
                guardias += sa.getCantidadGuardias();
                supervisores += sa.getCantidadSupervisores();
                elementosCaninos += sa.getNumElementosCaninos();
            break;
            case "Monitoreo":
                Monitoreo sm = (Monitoreo) servicio;
                camaras += sm.getNumCamaras();
            break;
        default:
            throw new AssertionError();  
        }
        
        int[] resultado = {guardias, supervisores, elementosCaninos, camaras};
        return resultado;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JComboBox<String> jcbSector;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtxIdentificacion;
    // End of variables declaration//GEN-END:variables
}
