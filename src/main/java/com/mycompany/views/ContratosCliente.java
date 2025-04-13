
package com.mycompany.views;

import Clases.Cliente;
import Clases.Contrato;
import Clases.Monitoreo;
import Clases.Servicio;
import Clases.ServicioAvanzado;
import Clases.ServicioBasico;
import controlador.ModeloCliente;
import controlador.ModeloContrato;
import controlador.ModeloContratoTerminado;
import controlador.ModeloServicio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class ContratosCliente extends javax.swing.JPanel {
    private ModeloContrato modelo;
    private ModeloContratoTerminado modeloTerminado;
    private ModeloServicio modeloServicio;
    private ModeloCliente modeloCliente;
    private Contrato editarContrato;
    private int editarIndice;
    
    Cliente cliente;

   
    public ContratosCliente(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        modelo = new ModeloContrato();
        modeloTerminado = new ModeloContratoTerminado();
        modeloServicio = new ModeloServicio();
        modeloCliente = new ModeloCliente();
        editarContrato = null;
        this.tblContratos.setModel(modelo);
        // Determinar si se recibió el cliente
        if (cliente != null) {
            this.txtidCliente.setText(cliente.getIdentificacion());
            this.txtidCliente.setEnabled(false);
        }
        editarContrato = null;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlid = new javax.swing.JLabel();
        jlcid = new javax.swing.JLabel();
        txtduracion = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        jlfecha = new javax.swing.JLabel();
        jlduracion = new javax.swing.JLabel();
        jtfecha = new javax.swing.JTextField();
        jltservicio = new javax.swing.JLabel();
        jcbservicio = new javax.swing.JComboBox<>();
        jlguardias = new javax.swing.JLabel();
        jlsupervisor = new javax.swing.JLabel();
        jlucaninas = new javax.swing.JLabel();
        jltacompañamiento = new javax.swing.JLabel();
        jlcantidadcamaras = new javax.swing.JLabel();
        jcbacompañamiento = new javax.swing.JComboBox<>();
        jtfguardias = new javax.swing.JTextField();
        jtfsupervisor = new javax.swing.JTextField();
        jtfunidadescaninas = new javax.swing.JTextField();
        jtfccamaras = new javax.swing.JTextField();
        jlcodigo = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jlresponsable = new javax.swing.JLabel();
        jtfcodigoservicio = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfresponsable = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContratos = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtcontratoEliminar = new javax.swing.JTextField();
        bnteliminar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 430));

        jlid.setText("Identificación del cliente");

        jlcid.setText("Código");

        txtduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduracionActionPerformed(evt);
            }
        });

        jlfecha.setText("Fecha");

        jlduracion.setText("Duración (mes)");

        jtfecha.setToolTipText("DD/MM/YYYY");
        jtfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfechaMousePressed(evt);
            }
        });

        jltservicio.setText("Tipo de servicio");

        jcbservicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicio Básico", "Servicio Avanzado", "Monitoreo" }));
        jcbservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbservicioActionPerformed(evt);
            }
        });

        jlguardias.setText("Guardias");

        jlsupervisor.setText("Supervisores");

        jlucaninas.setText("Unidades Caninas");

        jltacompañamiento.setText("Tipo de acompañamiento");

        jlcantidadcamaras.setText("Cantidad de Cámaras");

        jcbacompañamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "12", "24-7" }));
        jcbacompañamiento.setEnabled(false);
        jcbacompañamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbacompañamientoActionPerformed(evt);
            }
        });

        jtfguardias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfguardiasFocusLost(evt);
            }
        });
        jtfguardias.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtfguardiasInputMethodTextChanged(evt);
            }
        });

        jtfsupervisor.setEnabled(false);

        jtfunidadescaninas.setEnabled(false);

        jtfccamaras.setEnabled(false);

        jlcodigo.setText("Código");

        jlnombre.setText("Nombre");

        jlresponsable.setText("Responsable");

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setText("Crear contrato");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        tblContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblContratos);

        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnModificar.setText("Crear Otro Sí");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });

        txtcontratoEliminar.setForeground(new java.awt.Color(102, 102, 102));
        txtcontratoEliminar.setText("Ingrese el codigo del contrato");
        txtcontratoEliminar.setBorder(null);
        txtcontratoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontratoEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtcontratoEliminarMouseReleased(evt);
            }
        });
        txtcontratoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontratoEliminarActionPerformed(evt);
            }
        });

        bnteliminar.setText("Eliminar");
        bnteliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnteliminarMouseClicked(evt);
            }
        });
        bnteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnteliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlcid)
                                            .addComponent(jlid)
                                            .addComponent(jlfecha)
                                            .addComponent(jlduracion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlguardias)
                                            .addComponent(jlsupervisor)
                                            .addComponent(jlucaninas)
                                            .addComponent(jltacompañamiento)
                                            .addComponent(jlcantidadcamaras))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jtfccamaras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jtfunidadescaninas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                                                    .addComponent(jtfsupervisor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(jtfguardias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jlresponsable)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfresponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jlcodigo)
                                                            .addComponent(jlnombre))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jtfcodigoservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(jcbservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbacompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jltservicio)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtcontratoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jltservicio)
                                    .addComponent(jcbservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(title)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlcid)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlfecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlduracion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlguardias)
                            .addComponent(jtfguardias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfcodigoservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlsupervisor)
                                .addComponent(jtfsupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlucaninas)
                            .addComponent(jtfunidadescaninas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlresponsable)
                            .addComponent(jtfresponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbacompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jltacompañamiento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlcantidadcamaras)
                                    .addComponent(jtfccamaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontratoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbacompañamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbacompañamientoActionPerformed
        
    }//GEN-LAST:event_jcbacompañamientoActionPerformed

    private void jcbservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbservicioActionPerformed
        
        if (((String) jcbservicio.getSelectedItem()).equals("Servicio Basico")) {
            jtfguardias.setEnabled(true);
            jtfunidadescaninas.setEnabled(false);
            jtfccamaras.setEnabled(false);
            jcbacompañamiento.setEnabled(false);
            
            jtfunidadescaninas.setText("");
            jtfccamaras.setText("");
            jcbacompañamiento.setSelectedIndex(0);
            
        }

        if (((String) jcbservicio.getSelectedItem()).equals("Servicio Avanzado")) {
            jtfguardias.setEnabled(true);
            jtfunidadescaninas.setEnabled(true);
            jtfccamaras.setEnabled(false);
            jcbacompañamiento.setEnabled(false);
            
            jtfccamaras.setText("");
            jcbacompañamiento.setSelectedIndex(0);
        }

        if (((String) jcbservicio.getSelectedItem()).equals("Monitoreo")) {
            jtfguardias.setEnabled(false);
            jtfunidadescaninas.setEnabled(false);
            jtfccamaras.setEnabled(true);
            jcbacompañamiento.setEnabled(true);
            
            jtfguardias.setText("");
            jtfunidadescaninas.setText("");
            
        }
    }//GEN-LAST:event_jcbservicioActionPerformed

    private void txtduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduracionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtcontratoEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontratoEliminarMousePressed
        if(txtcontratoEliminar.getText().equals("Ingrese el codigo del contrato"))
        txtcontratoEliminar.setText("");
    }//GEN-LAST:event_txtcontratoEliminarMousePressed

    private void txtcontratoEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontratoEliminarMouseReleased
        //nothing
    }//GEN-LAST:event_txtcontratoEliminarMouseReleased

    private void txtcontratoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontratoEliminarActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtcontratoEliminarActionPerformed

    private void bnteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnteliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnteliminarActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        String codigo = this.txtcodigo.getText();
        Date fechaPrestacion = null;
        String identificacion = this.txtidCliente.getText();
        try {
            fechaPrestacion = new SimpleDateFormat("dd/MM/yyyy").parse(this.jtfecha.getText());
            int duracion = Integer.parseInt(txtduracion.getText());
            Servicio servicio = crearServicio();
            if (cliente == null) {
                cliente = modeloCliente.obtener(identificacion);
            }
            if (this.btnCrear.getText().equals("Crear")) {
                Contrato contrato = new Contrato(codigo, cliente, fechaPrestacion, duracion, servicio);
                modelo.agregarContrato(contrato);
                JOptionPane.showMessageDialog(null, "Los datos se registraron en la tabla");
            } else {
                modelo.modificarContrato(this.editarIndice, fechaPrestacion, duracion, servicio);
                this.editarContrato = null;
                JOptionPane.showMessageDialog(null, "Los datos se modificaron correctamente");
                this.btnCrear.setText("Crear");
            }
            limpiar();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha no es válido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, String.format("El cliente con ID %s no se encuentra registrado", identificacion));
        }
        
    }//GEN-LAST:event_btnCrearMouseClicked

    private void jtfguardiasInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtfguardiasInputMethodTextChanged

    }//GEN-LAST:event_jtfguardiasInputMethodTextChanged

    private void jtfguardiasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfguardiasFocusLost
        try {
            int cantidadGuardias = Integer.parseInt(this.jtfguardias.getText());
            int supervisores  = cantidadGuardias / 8;
            this.jtfsupervisor.setText(String.valueOf(supervisores));
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jtfguardiasFocusLost

    private void jtfechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfechaMousePressed

    }//GEN-LAST:event_jtfechaMousePressed

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        modelo.guardarEnArchivo();
        modeloServicio.guardarEnArchivo();
        modeloTerminado.guardarEnArchivo();
        JOptionPane.showMessageDialog(null, "Los datos se almacenarón en el archivo plano");
        
    }//GEN-LAST:event_btnguardarMouseClicked

    private void bnteliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnteliminarMouseClicked
        String codigo = this.txtcontratoEliminar.getText();
        int fila = modelo.obtenerFila(codigo);
        if (fila >= 0) {
            Contrato contrato = modelo.getValuAt(fila);
            modelo.eliminarContrato(fila);
            modeloTerminado.agregarContrato(contrato);
        } else {
            JOptionPane.showMessageDialog(null, String.format("El contrato con Id %s no se encuentra registrado",codigo));
        }
    }//GEN-LAST:event_bnteliminarMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = this.tblContratos.getSelectedRow();
        if (fila >= 0) {
            this.editarContrato = modelo.getValuAt(fila);
            this.editarIndice = fila;
            this.txtcodigo.setText(editarContrato.getCodigo());
            this.txtidCliente.setText(editarContrato.getCliente().getIdentificacion());
            this.jtfecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(editarContrato.getFechaPrestacion()));
            this.txtduracion.setText(String.valueOf(editarContrato.getDuracion()));
            this.jcbservicio.setSelectedItem(editarContrato.getTipoDeServicio());
            this.modificarServicio();
            this.btnCrear.setText("Modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed
    
    private void modificarServicio() {
        String tipoServicio = editarContrato.getTipoDeServicio();
        this.jtfcodigoservicio.setText(editarContrato.getServicio().getCodigo());
        this.jtfnombre.setText(editarContrato.getServicio().getNombre());
        this.jtfresponsable.setText(editarContrato.getServicio().getResponsable());
        
        if (tipoServicio.equals("Servicio Basico")) {
            ServicioBasico sb = (ServicioBasico) editarContrato.getServicio();
            jtfguardias.setEnabled(true);
            jtfunidadescaninas.setEnabled(false);
            jtfccamaras.setEnabled(false);
            jcbacompañamiento.setEnabled(false);
            
            jtfunidadescaninas.setText("");
            jtfccamaras.setText("");
            jcbacompañamiento.setSelectedIndex(0);
            this.jtfguardias.setText(String.valueOf(sb.getCantidadGuardias()));
            this.jtfsupervisor.setText(String.valueOf(sb.getCantidadSupervisores()));
            
            
        }

        if (tipoServicio.equals("Servicio Avanzado")) {
            ServicioAvanzado sa = (ServicioAvanzado) editarContrato.getServicio();
            jtfguardias.setEnabled(true);
            jtfunidadescaninas.setEnabled(true);
            jtfccamaras.setEnabled(false);
            jcbacompañamiento.setEnabled(false);
            
            jtfccamaras.setText("");
            jcbacompañamiento.setSelectedIndex(0);
            this.jtfguardias.setText(String.valueOf(sa.getCantidadGuardias()));
            this.jtfsupervisor.setText(String.valueOf(sa.getCantidadSupervisores()));
            this.jtfunidadescaninas.setText(String.valueOf(sa.getNumElementosCaninos()));
        }

        if (tipoServicio.equals("Monitoreo")) {
            Monitoreo sm = (Monitoreo) editarContrato.getServicio();
            jtfguardias.setEnabled(false);
            jtfunidadescaninas.setEnabled(false);
            jtfccamaras.setEnabled(true);
            jcbacompañamiento.setEnabled(true);
            
            jtfguardias.setText("");
            jtfunidadescaninas.setText("");
            this.jtfccamaras.setText(String.valueOf(sm.getNumCamaras()));
            this.jcbacompañamiento.setSelectedItem(sm.getTipo());
        }
    }
    
    private Servicio crearServicio() {
        String tipoServicio = String.valueOf(jcbservicio.getSelectedItem());
        String codigo = this.jtfcodigoservicio.getText();
        String nombre = this.jtfnombre.getText();
        String responsable = this.jtfresponsable.getText();
        int cantidadGuardias;
        int cantidadSupervisores;
        
        switch (tipoServicio) {
            case "Servicio Basico":
                cantidadGuardias = Integer.parseInt(this.jtfguardias.getText());
                cantidadSupervisores = Integer.parseInt(this.jtfsupervisor.getText());
                ServicioBasico sb = new ServicioBasico(codigo, nombre, responsable, cantidadGuardias, cantidadSupervisores);
                modeloServicio.agregarServicio(sb);
                return sb;
            case "Servicio Avanzado":
                cantidadGuardias = Integer.parseInt(this.jtfguardias.getText());
                cantidadSupervisores = Integer.parseInt(this.jtfsupervisor.getText());
                int numElementosCaninos = Integer.parseInt(this.jtfunidadescaninas.getText());
                ServicioAvanzado sa = new ServicioAvanzado(codigo, nombre, responsable, cantidadGuardias, cantidadSupervisores, numElementosCaninos);
                modeloServicio.agregarServicio(sa);
                return sa;
            case "Monitoreo":
                int numCamaras = Integer.parseInt(this.jtfccamaras.getText());
                String tipoAcompañamiento = String.valueOf(this.jcbacompañamiento.getSelectedItem());
                Monitoreo sm = new Monitoreo(codigo, nombre, responsable, numCamaras, tipoAcompañamiento);
                modeloServicio.agregarServicio(sm);
                return sm;
            default:
                throw new AssertionError(); 
        }
    }
    
    private void limpiar() {
        this.txtcodigo.setText("");
        this.jtfecha.setText("");
        this.txtduracion.setText("");
        this.jcbservicio.setSelectedIndex(0);
        this.jtfguardias.setText("");
        this.jtfsupervisor.setText("");
        this.jtfunidadescaninas.setText("");
        this.jcbacompañamiento.setSelectedIndex(0);
        this.jtfccamaras.setText("");
        this.jtfcodigoservicio.setText("");
        this.jtfnombre.setText("");
        this.jtfresponsable.setText("");
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnteliminar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcbacompañamiento;
    private javax.swing.JComboBox<String> jcbservicio;
    private javax.swing.JLabel jlcantidadcamaras;
    private javax.swing.JLabel jlcid;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jlduracion;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel jlguardias;
    private javax.swing.JLabel jlid;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlresponsable;
    private javax.swing.JLabel jlsupervisor;
    private javax.swing.JLabel jltacompañamiento;
    private javax.swing.JLabel jltservicio;
    private javax.swing.JLabel jlucaninas;
    private javax.swing.JTextField jtfccamaras;
    private javax.swing.JTextField jtfcodigoservicio;
    private javax.swing.JTextField jtfecha;
    private javax.swing.JTextField jtfguardias;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtfresponsable;
    private javax.swing.JTextField jtfsupervisor;
    private javax.swing.JTextField jtfunidadescaninas;
    private javax.swing.JTable tblContratos;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcontratoEliminar;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtidCliente;
    // End of variables declaration//GEN-END:variables
}
